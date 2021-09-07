Feature:

  Scenario:
    * def port = karate.start('mock.feature').port
    * url 'http://localhost:' + port
    * path 'send';
    * method get
    * status 200

