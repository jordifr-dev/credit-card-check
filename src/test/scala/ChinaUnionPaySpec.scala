import net.jordifr.check.CardCheck
import net.jordifr.check.types.ChinaUnionPay
import org.scalatest.{FeatureSpec, GivenWhenThen}

/**
  * Created by 0a555836 on 03/01/2017.
  */
class ChinaUnionPaySpec extends FeatureSpec with GivenWhenThen {

  feature("China Union Pay card") {
    scenario("Starts by 62 and has a fixed length of 16 digits") {
      Given("a credit card with number 6212345678910123")
      val cardCheck = new CardCheck();
      val number = "6212345678910123";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is an American Express card")
      assert(new ChinaUnionPay().name == cardType.name)
    }
    scenario("Starts by 62 and has a fixed length of 17 digits") {
      Given("a credit card with number 62123456789101234")
      val cardCheck = new CardCheck();
      val number = "62123456789101234";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is an American Express card")
      assert(new ChinaUnionPay().name == cardType.name)
    }
    scenario("Starts by 62 and has a fixed length of 18 digits") {
      Given("a credit card with number 621234567891012345")
      val cardCheck = new CardCheck();
      val number = "621234567891012345";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is an American Express card")
      assert(new ChinaUnionPay().name == cardType.name)
    }
    scenario("Starts by 62 and has a fixed length of 19 digits") {
      Given("a credit card with number 6212345678910123456")
      val cardCheck = new CardCheck();
      val number = "6212345678910123456";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is an American Express card")
      assert(new ChinaUnionPay().name == cardType.name)
    }
  }

}