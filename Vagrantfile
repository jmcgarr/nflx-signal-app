# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant.configure(2) do |config|
  config.vm.box = "ubuntu/trusty64"
  config.vm.network "forwarded_port", guest: 8080, host: 8081
  config.vm.provision "shell", inline: <<-SHELL

    # BaseAMI provides this (see https://github.com/Netflix-Skunkworks/zerotocloud/blob/master/baseami/build.gradle#L4)
    sudo apt-get -y install default-jdk # TODO - figure out java-8
    sudo apt-get -y install tomcat7 # TODO - need to turn off

    # install our deb
    sudo dpkg -i /vagrant/build/distributions/helloworld_1.0.0_all.deb
  SHELL
end
