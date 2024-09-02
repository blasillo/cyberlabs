<!-- PROJECT LOGO -->
<p align="center">

  <h3 align="center">VulnLab</h3> 

</p>



<!-- Vulnerabilities List -->
## Vulnerabilities

* SQL Injection
* Cross Site Scripting (XSS)
* Command Injection
* Insecure Direct Object References (IDOR)
* Cross Site Request Forgery (CSRF)
* XML External Entity (XXE)
* Insecure Deserialization
* File Upload
* File Inclusion
* Broken Authentication
* Race Condition
* Server Side Template Injection (SSTI)
* API Hacking
* Captcha Bypass
* Path Traversal

<!-- Installation -->
## Installation

### Install with DockerHub

1. If you want to install on DockerHub, just type this command.
   ```sh
    docker run --name vulnlab -d -p 1337:80 yavuzlar/vulnlab:latest
   ```
2. Go to http://localhost:1337

### Manuel Installation

1. Clone the repo
   ```sh
    git clone https://github.com/Yavuzlar/VulnLab
   ```
2. Build docker image
   ```sh
    docker build -t yavuzlar/vulnlab .
   ```
3. Run container
   ```sh
    docker run -d -p 1337:80 yavuzlar/vulnlab
   ```
4. Go to http://localhost:1337

### Google Cloud

[![Run on Google Cloud](https://deploy.cloud.run/button.svg)](https://deploy.cloud.run/?git_repo=https://github.com/Yavuzlar/VulnLab)

<!-- SPONSOR -->

## Supporters
<a href="https://www.bakka.gov.tr/" style="margin-right:50px;">
    <img src="https://i.ibb.co/YXYdfQx/bakkalogo.png" alt="Logo" width="200" >
</a>
<a href="https://cyrops.com/">
    <img src="https://i.ibb.co/MV9HbNZ/Ba-l-ks-z-2.png" alt="Logo" width="200" >
</a>

<!-- CONTACT -->
## Contact

[Website](https://siberyavuzlar.com/) </br>
[Linkedln](https://www.linkedin.com/company/siberyavuzlar) <br>
[Twitter](https://twitter.com/siberyavuzlar) </br>
[Instagram](https://www.instagram.com/siberyavuzlar/)
