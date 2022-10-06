
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Homepage")/*2.18*/{_display_(Seq[Any](format.raw/*2.19*/("""
"""),_display_(/*3.2*/defining(play.core.PlayVersion.current)/*3.41*/ { version =>_display_(Seq[Any](format.raw/*3.54*/("""

"""),format.raw/*5.1*/("""<header>
<section id="content">
  <div class="intro">
    <h1 class="intro_heading">
      Welcome to RedditLytics
    </h1>

    <div class="intro_search">
      <form method="post">
        <label for="keyword">
        </label>
        <input
          class="intro_search--input"
        type="text"
        id="keyword"
        placeholder="Enter search keyword: " />

        <input
        class="intro_search--submit"
        type="submit" value="Go"/>
      </form>
    </div>
  </div>
</section>
</header>
""")))}),format.raw/*30.2*/("""
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 9cfd0413c556f3cfbf8c108a2f4e1f9518c97c5e
                  MATRIX: 900->1|996->5|1020->21|1058->22|1085->24|1132->63|1182->76|1210->78|1757->595
                  LINES: 27->1|32->2|32->2|32->2|33->3|33->3|33->3|35->5|60->30
                  -- GENERATED --
              */
          