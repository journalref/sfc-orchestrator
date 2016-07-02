# sfc-orchestrator

This project is the first version of SFC Orchestrator that provides SFC Control layer as stated in [IETF SFC working group specs] (https://datatracker.ietf.org/doc/draft-ietf-sfc-control-plane/) and [ONF SFC specs](https://www.opennetworking.org/images/stories/downloads/sdn-resources/onf-specifications/L4-L7_Service_Function_Chaining_Solution_Architecture.pdf). It manages the Network Service Requests occured by the NFV Orchestrator - [Open Baton](http://openbaton.github.io/) - and translates these requests which include VNF Forwarding Graphs into Service Function Chains and Paths using OpenDaylight SDN Control - [SFC Project](https://wiki.opendaylight.org/view/Service_Function_Chaining:Main) - that provides SFC Data plane functionality.

## Prerequests 

1. Zabbix plugin running (see the [doc of Zabbix plugin](https://github.com/openbaton/docs/blob/develop/docs/zabbix-plugin.md))
2. [Open Baton 2.0.1](https://github.com/openbaton/NFVO/tree/2.0.1 running)
3. [Generic VNFM 2.0.1](https://github.com/openbaton/generic-vnfm/tree/2.0.1) running
4. [Open Baton Fault Management](https://github.com/openbaton/fm-system) running
5. [OVS 2.3.90 with NSH Patch](https://github.com/pritesh/ovs/blob/nsh-v8/third-party/start-ovs-deb.sh) running this script should  install ovs with its patch for Ubuntu only.
6. [Devstack Liberty](https://github.com/openstack-dev/devstack/tree/stable/liberty) running using this local.conf file. This local.conf file includes the plugin and installation of Opendaylight SFC.
 

## Getting Started

After installing the prerequests, you can clone the SFC Orchestrator Project from git, compile it and start:
```
git clone https://github.com/mah88/sfc-orchestrator.git
```

##Configuration file description

Parameter                                    | Description
---------------------------------------------|--------------------------------------------------------------------
nfvo.baseURL                                 |         NFV Orchestrator IP                      
nfvo.basePort                                | NFV Orchestrator Port. Default value: 8080
nfvo.username                                | NFVO Username. Default value: admin 
nfvo.password                                | NFVO Password. Default value: openbaton
nfvo.security                                | NFVO Security. Default value: false
server.port                                  | Port of the SFC Orchestrator
spring.http.converters.preferred-json-mapper | json converter. Default value: gson
spring.rabbitmq.host                         | IP of the machine where RabbitMQ is running. 
spring.rabbitmq.port                         | Port of the machine where RabbitMQ is running. Default value: 5672
spring.rabbitmq.username                     | username for authorization of RabbitMQ
spring.rabbitmq.password                     | password for authorization of RabbitMQ
logging.level.*                              | Log level of the defined modules








