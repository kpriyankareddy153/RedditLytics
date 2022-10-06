
package views.html.Subreddits

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

object subreddit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Set[SubReddit],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(subreddits: Set[SubReddit]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <center><h1>Subreddits Data</h1></center>

    <center>
    """),_display_(/*12.6*/for(subreddit <- subreddits) yield /*12.34*/{_display_(Seq[Any](format.raw/*12.35*/("""
        """),format.raw/*13.9*/("""<a href="routes.SubredditController.redirect_to_subreddit(subreddit.reddit_id)">"""),_display_(/*13.90*/subreddit/*13.99*/.permalink),format.raw/*13.109*/("""</a>
        <p> Reddit id: """),_display_(/*14.25*/subreddit/*14.34*/.reddit_id),format.raw/*14.44*/("""</p>
        <p> SubReddit id: """),_display_(/*15.28*/subreddit/*15.37*/.subreddit_id),format.raw/*15.50*/("""</p>
        <p> SubReddit name: """),_display_(/*16.30*/subreddit/*16.39*/.subreddit_name),format.raw/*16.54*/("""</p>
        <p> Link id: """),_display_(/*17.23*/subreddit/*17.32*/.link_id),format.raw/*17.40*/("""</p>
        <p> Reddit Body: """),_display_(/*18.27*/subreddit/*18.36*/.reddit_body),format.raw/*18.48*/("""</p>
    """)))}),format.raw/*19.6*/("""
    """),format.raw/*20.5*/("""</center>

</body>
</html>"""))
      }
    }
  }

  def render(subreddits:Set[SubReddit]): play.twirl.api.HtmlFormat.Appendable = apply(subreddits)

  def f:((Set[SubReddit]) => play.twirl.api.HtmlFormat.Appendable) = (subreddits) => apply(subreddits)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/Subreddits/subreddit.scala.html
                  HASH: c50fd8ee84cfa0a557e9fcba0a83618bed775857
                  MATRIX: 930->1|1052->30|1079->31|1261->187|1305->215|1344->216|1380->225|1488->306|1506->315|1538->325|1594->354|1612->363|1643->373|1702->405|1720->414|1754->427|1815->461|1833->470|1869->485|1923->512|1941->521|1970->529|2028->560|2046->569|2079->581|2119->591|2151->596
                  LINES: 27->1|32->2|33->3|42->12|42->12|42->12|43->13|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|50->20
                  -- GENERATED --
              */
          