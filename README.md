# JWeb

![Build Status](http://teamcity.vicart.ovh:8080/app/rest/builds/buildType:(id:Jweb_BuildSnapshot)/statusIcon.svg "Build status")

JWeb is a Java framework for building full html web static pages. That said, it enables you include all you need, such as static content (eg images, links...) including JavaScript static scripts to link your elements and make them dynamic.

It includes some predefined HTML components like buttons, links, paragraphs and utilities like "meta", "link", "script" etc...

JWeb requires minimal configurations to fit the server settings and delivering contents. It also supports predefined themes such as Bootstrap

## Example

this is a way to configure JWeb:
`JWeb.configure().withTheme(new BaseTheme()).withContextPath("/");`

or a web page with an only paragraph:
```
WebPage wp = new WebPage("title");
HParagraph hp = new HParagraph("text");
wp.getBody().add(hp);
String finalHtml = wp.render();
```

# Sections

