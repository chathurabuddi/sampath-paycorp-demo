## Sampath Bank Paycorp Demo 🇱🇰

[![MIT License](https://img.shields.io/apm/l/atomic-design-ui.svg?)](https://github.com/chathurabuddi/sampath-paycorp-demo/blob/master/LICENSE)
[![Build](https://github.com/chathurabuddi/sampath-paycorp-demo/actions/workflows/build.yml/badge.svg)](https://github.com/chathurabuddi/sampath-paycorp-demo/actions/workflows/build.yml)
[![Quality gate](https://sonarcloud.io/api/project_badges/quality_gate?project=chathurabuddi_sampath-paycorp-demo)](https://sonarcloud.io/dashboard?id=chathurabuddi_sampath-paycorp-demo)

This application demonstrate how to configure Sampath Bank Paycorp Payment Gateway
with Spring-Boot and Thymeleaf. Please read [Paycorp technical documentation](https://paycorp-international.gitbook.io/quick-web/) and understand the workflow well 
before integrating this to your website. 

### Installation & Usage 
Clone the repository and run `mvn clean install` from the project root. After that, jar file will be generated 
at `<PROJECT_ROOT>/target` directory

```bash
git clone https://github.com/chathurabuddi/sampath-paycorp-demo.git
cd sampath-paycorp-demo
mvn clean install
```

To run the web server, navigate to the generated jar file and execute following command.

```bash
java -jar sampath-paycorp-demo-<version>.jar
```

The payment page can be accessed from `http://localhost:8080/`

### Issues
Please use Github Issues to report any issues, clarifications or suggestions. 

### Contribution
Contributions, issues and feature requests are welcome. Feel free to check
[issues page](https://github.com/chathurabuddi/sampath-paycorp-demo/issues)

### License
Copyright © 2021 Chathura Buddhika ([chathurabuddi](www.chathurabuddi.lk))  
This project is [MIT](http://opensource.org/licenses/MIT) licensed.