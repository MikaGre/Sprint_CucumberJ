$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Feature/DarkSky/Timeline");
formatter.feature({
  "line": 1,
  "name": "Timeline",
  "description": "",
  "id": "timeline",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#@time"
    }
  ],
  "line": 4,
  "name": "Verify timeline is displayed in correct format",
  "description": "",
  "id": "timeline;verify-timeline-is-displayed-in-correct-format",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on Darksky home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I verify timeline is displayed with 2 hours increment",
  "keyword": "Then "
});
formatter.match({
  "location": "Timeline.i_am_on_Darksky_home_page()"
});
formatter.result({
  "duration": 5462991764,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 36
    }
  ],
  "location": "Timeline.i_verify_timeline_is_displayed_with_hours_increment(int)"
});
formatter.result({
  "duration": 100865052,
  "error_message": "java.lang.AssertionError\n\tat Pages.BasePage.getListofNumbersfromElement(BasePage.java:115)\n\tat Pages.Darksky.LandingPage.getTimelineHr(LandingPage.java:27)\n\tat StepDef.DarkSky.Timeline.i_verify_timeline_is_displayed_with_hours_increment(Timeline.java:18)\n\tat ✽.Then I verify timeline is displayed with 2 hours increment(src/main/resources/Feature/DarkSky/Timeline:6)\n",
  "status": "failed"
});
formatter.after({
  "duration": 1232609908,
  "status": "passed"
});
});