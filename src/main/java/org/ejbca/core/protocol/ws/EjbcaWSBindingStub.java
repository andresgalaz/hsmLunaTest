/**
 * EjbcaWSBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.ejbca.core.protocol.ws;

public class EjbcaWSBindingStub extends org.apache.axis.client.Stub implements org.ejbca.core.protocol.ws.EjbcaWS {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[38];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("caCertResponse");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[][].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalException"),
                      "org.ejbca.core.protocol.ws.ApprovalException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"),
                      "org.ejbca.core.protocol.ws.CADoesntExistsException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "WaitingForApprovalException"),
                      "org.ejbca.core.protocol.ws.WaitingForApprovalException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "WaitingForApprovalException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("caRenewCertRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[][].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalException"),
                      "org.ejbca.core.protocol.ws.ApprovalException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"),
                      "org.ejbca.core.protocol.ws.CADoesntExistsException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "WaitingForApprovalException"),
                      "org.ejbca.core.protocol.ws.WaitingForApprovalException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "WaitingForApprovalException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("certificateRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "userDataVOWS"), org.ejbca.core.protocol.ws.UserDataVOWS.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "certificateResponse"));
        oper.setReturnClass(org.ejbca.core.protocol.ws.CertificateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalException"),
                      "org.ejbca.core.protocol.ws.ApprovalException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "NotFoundException"),
                      "org.ejbca.core.protocol.ws.NotFoundException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "NotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "UserDoesntFullfillEndEntityProfile"),
                      "org.ejbca.core.protocol.ws.UserDoesntFullfillEndEntityProfile",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "UserDoesntFullfillEndEntityProfile"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"),
                      "org.ejbca.core.protocol.ws.CADoesntExistsException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "WaitingForApprovalException"),
                      "org.ejbca.core.protocol.ws.WaitingForApprovalException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "WaitingForApprovalException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkRevokationStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "revokeStatus"));
        oper.setReturnClass(org.ejbca.core.protocol.ws.RevokeStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"),
                      "org.ejbca.core.protocol.ws.CADoesntExistsException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createCRL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalRequestExpiredException"),
                      "org.ejbca.core.protocol.ws.ApprovalRequestExpiredException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalRequestExpiredException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalException"),
                      "org.ejbca.core.protocol.ws.ApprovalException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"),
                      "org.ejbca.core.protocol.ws.CADoesntExistsException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("crmfRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "certificateResponse"));
        oper.setReturnClass(org.ejbca.core.protocol.ws.CertificateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "NotFoundException"),
                      "org.ejbca.core.protocol.ws.NotFoundException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "NotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"),
                      "org.ejbca.core.protocol.ws.CADoesntExistsException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customLog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "certificate"), org.ejbca.core.protocol.ws.Certificate.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"),
                      "org.ejbca.core.protocol.ws.CADoesntExistsException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cvcRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "certificate"));
        oper.setReturnClass(org.ejbca.core.protocol.ws.Certificate[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CertificateExpiredException"),
                      "org.ejbca.core.protocol.ws.CertificateExpiredException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CertificateExpiredException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalException"),
                      "org.ejbca.core.protocol.ws.ApprovalException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "SignRequestException"),
                      "org.ejbca.core.protocol.ws.SignRequestException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "SignRequestException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "UserDoesntFullfillEndEntityProfile"),
                      "org.ejbca.core.protocol.ws.UserDoesntFullfillEndEntityProfile",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "UserDoesntFullfillEndEntityProfile"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "NotFoundException"),
                      "org.ejbca.core.protocol.ws.NotFoundException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "NotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"),
                      "org.ejbca.core.protocol.ws.CADoesntExistsException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "WaitingForApprovalException"),
                      "org.ejbca.core.protocol.ws.WaitingForApprovalException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "WaitingForApprovalException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteUserDataFromSource");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "MultipleMatchException"),
                      "org.ejbca.core.protocol.ws.MultipleMatchException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "MultipleMatchException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "UserDataSourceException"),
                      "org.ejbca.core.protocol.ws.UserDataSourceException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "UserDataSourceException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("editUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "userDataVOWS"), org.ejbca.core.protocol.ws.UserDataVOWS.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalException"),
                      "org.ejbca.core.protocol.ws.ApprovalException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "UserDoesntFullfillEndEntityProfile"),
                      "org.ejbca.core.protocol.ws.UserDoesntFullfillEndEntityProfile",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "UserDoesntFullfillEndEntityProfile"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"),
                      "org.ejbca.core.protocol.ws.CADoesntExistsException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "WaitingForApprovalException"),
                      "org.ejbca.core.protocol.ws.WaitingForApprovalException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "WaitingForApprovalException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("existsHardToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("fetchUserData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "userDataSourceVOWS"));
        oper.setReturnClass(org.ejbca.core.protocol.ws.UserDataSourceVOWS[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "UserDataSourceException"),
                      "org.ejbca.core.protocol.ws.UserDataSourceException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "UserDataSourceException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findCerts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "certificate"));
        oper.setReturnClass(org.ejbca.core.protocol.ws.Certificate[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "userMatch"), org.ejbca.core.protocol.ws.UserMatch.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "userDataVOWS"));
        oper.setReturnClass(org.ejbca.core.protocol.ws.UserDataVOWS[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "IllegalQueryException"),
                      "org.ejbca.core.protocol.ws.IllegalQueryException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "IllegalQueryException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("genTokenCertificates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "userDataVOWS"), org.ejbca.core.protocol.ws.UserDataVOWS.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "tokenCertificateRequestWS"), org.ejbca.core.protocol.ws.TokenCertificateRequestWS[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "hardTokenDataWS"), org.ejbca.core.protocol.ws.HardTokenDataWS.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "tokenCertificateResponseWS"));
        oper.setReturnClass(org.ejbca.core.protocol.ws.TokenCertificateResponseWS[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "HardTokenExistsException"),
                      "org.ejbca.core.protocol.ws.HardTokenExistsException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "HardTokenExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalRequestExpiredException"),
                      "org.ejbca.core.protocol.ws.ApprovalRequestExpiredException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalRequestExpiredException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalException"),
                      "org.ejbca.core.protocol.ws.ApprovalException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "UserDoesntFullfillEndEntityProfile"),
                      "org.ejbca.core.protocol.ws.UserDoesntFullfillEndEntityProfile",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "UserDoesntFullfillEndEntityProfile"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"),
                      "org.ejbca.core.protocol.ws.CADoesntExistsException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "WaitingForApprovalException"),
                      "org.ejbca.core.protocol.ws.WaitingForApprovalException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "WaitingForApprovalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalRequestExecutionException"),
                      "org.ejbca.core.protocol.ws.ApprovalRequestExecutionException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalRequestExecutionException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAuthorizedEndEntityProfiles");
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "nameAndId"));
        oper.setReturnClass(org.ejbca.core.protocol.ws.NameAndId[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAvailableCAs");
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "nameAndId"));
        oper.setReturnClass(org.ejbca.core.protocol.ws.NameAndId[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAvailableCAsInProfile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "nameAndId"));
        oper.setReturnClass(org.ejbca.core.protocol.ws.NameAndId[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAvailableCertificateProfiles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "nameAndId"));
        oper.setReturnClass(org.ejbca.core.protocol.ws.NameAndId[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCertificate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "certificate"));
        oper.setReturnClass(org.ejbca.core.protocol.ws.Certificate.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"),
                      "org.ejbca.core.protocol.ws.CADoesntExistsException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEjbcaVersion");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getHardTokenData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "hardTokenDataWS"));
        oper.setReturnClass(org.ejbca.core.protocol.ws.HardTokenDataWS.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalRequestExpiredException"),
                      "org.ejbca.core.protocol.ws.ApprovalRequestExpiredException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalRequestExpiredException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "NotFoundException"),
                      "org.ejbca.core.protocol.ws.NotFoundException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "NotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"),
                      "org.ejbca.core.protocol.ws.CADoesntExistsException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "HardTokenDoesntExistsException"),
                      "org.ejbca.core.protocol.ws.HardTokenDoesntExistsException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "HardTokenDoesntExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "WaitingForApprovalException"),
                      "org.ejbca.core.protocol.ws.WaitingForApprovalException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "WaitingForApprovalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalRequestExecutionException"),
                      "org.ejbca.core.protocol.ws.ApprovalRequestExecutionException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalRequestExecutionException"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getHardTokenDatas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "hardTokenDataWS"));
        oper.setReturnClass(org.ejbca.core.protocol.ws.HardTokenDataWS[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"),
                      "org.ejbca.core.protocol.ws.CADoesntExistsException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLastCAChain");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "certificate"));
        oper.setReturnClass(org.ejbca.core.protocol.ws.Certificate[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"),
                      "org.ejbca.core.protocol.ws.CADoesntExistsException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLastCertChain");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "certificate"));
        oper.setReturnClass(org.ejbca.core.protocol.ws.Certificate[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPublisherQueueLength");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isApproved");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalRequestExpiredException"),
                      "org.ejbca.core.protocol.ws.ApprovalRequestExpiredException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalRequestExpiredException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalException"),
                      "org.ejbca.core.protocol.ws.ApprovalException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalException"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isAuthorized");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("keyRecoverNewest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalException"),
                      "org.ejbca.core.protocol.ws.ApprovalException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "NotFoundException"),
                      "org.ejbca.core.protocol.ws.NotFoundException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "NotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"),
                      "org.ejbca.core.protocol.ws.CADoesntExistsException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "WaitingForApprovalException"),
                      "org.ejbca.core.protocol.ws.WaitingForApprovalException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "WaitingForApprovalException"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pkcs10Request");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "certificateResponse"));
        oper.setReturnClass(org.ejbca.core.protocol.ws.CertificateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "NotFoundException"),
                      "org.ejbca.core.protocol.ws.NotFoundException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "NotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"),
                      "org.ejbca.core.protocol.ws.CADoesntExistsException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pkcs12Req");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "keyStore"));
        oper.setReturnClass(org.ejbca.core.protocol.ws.KeyStore.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "NotFoundException"),
                      "org.ejbca.core.protocol.ws.NotFoundException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "NotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"),
                      "org.ejbca.core.protocol.ws.CADoesntExistsException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("republishCertificate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "PublisherException"),
                      "org.ejbca.core.protocol.ws.PublisherException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "PublisherException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"),
                      "org.ejbca.core.protocol.ws.CADoesntExistsException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("revokeCert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AlreadyRevokedException"),
                      "org.ejbca.core.protocol.ws.AlreadyRevokedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AlreadyRevokedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalException"),
                      "org.ejbca.core.protocol.ws.ApprovalException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "NotFoundException"),
                      "org.ejbca.core.protocol.ws.NotFoundException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "NotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"),
                      "org.ejbca.core.protocol.ws.CADoesntExistsException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "WaitingForApprovalException"),
                      "org.ejbca.core.protocol.ws.WaitingForApprovalException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "WaitingForApprovalException"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("revokeCertBackdated");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "RevokeBackDateNotAllowedForProfileException"),
                      "org.ejbca.core.protocol.ws.RevokeBackDateNotAllowedForProfileException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "RevokeBackDateNotAllowedForProfileException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AlreadyRevokedException"),
                      "org.ejbca.core.protocol.ws.AlreadyRevokedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AlreadyRevokedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalException"),
                      "org.ejbca.core.protocol.ws.ApprovalException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "DateNotValidException"),
                      "org.ejbca.core.protocol.ws.DateNotValidException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "DateNotValidException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "NotFoundException"),
                      "org.ejbca.core.protocol.ws.NotFoundException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "NotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"),
                      "org.ejbca.core.protocol.ws.CADoesntExistsException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "WaitingForApprovalException"),
                      "org.ejbca.core.protocol.ws.WaitingForApprovalException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "WaitingForApprovalException"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("revokeToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AlreadyRevokedException"),
                      "org.ejbca.core.protocol.ws.AlreadyRevokedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AlreadyRevokedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalException"),
                      "org.ejbca.core.protocol.ws.ApprovalException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "NotFoundException"),
                      "org.ejbca.core.protocol.ws.NotFoundException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "NotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"),
                      "org.ejbca.core.protocol.ws.CADoesntExistsException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "WaitingForApprovalException"),
                      "org.ejbca.core.protocol.ws.WaitingForApprovalException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "WaitingForApprovalException"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("revokeUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AlreadyRevokedException"),
                      "org.ejbca.core.protocol.ws.AlreadyRevokedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AlreadyRevokedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalException"),
                      "org.ejbca.core.protocol.ws.ApprovalException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "NotFoundException"),
                      "org.ejbca.core.protocol.ws.NotFoundException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "NotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"),
                      "org.ejbca.core.protocol.ws.CADoesntExistsException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "WaitingForApprovalException"),
                      "org.ejbca.core.protocol.ws.WaitingForApprovalException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "WaitingForApprovalException"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("softTokenRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "userDataVOWS"), org.ejbca.core.protocol.ws.UserDataVOWS.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "keyStore"));
        oper.setReturnClass(org.ejbca.core.protocol.ws.KeyStore.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalException"),
                      "org.ejbca.core.protocol.ws.ApprovalException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "NotFoundException"),
                      "org.ejbca.core.protocol.ws.NotFoundException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "NotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "UserDoesntFullfillEndEntityProfile"),
                      "org.ejbca.core.protocol.ws.UserDoesntFullfillEndEntityProfile",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "UserDoesntFullfillEndEntityProfile"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"),
                      "org.ejbca.core.protocol.ws.CADoesntExistsException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "WaitingForApprovalException"),
                      "org.ejbca.core.protocol.ws.WaitingForApprovalException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "WaitingForApprovalException"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("spkacRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "certificateResponse"));
        oper.setReturnClass(org.ejbca.core.protocol.ws.CertificateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"),
                      "org.ejbca.core.protocol.ws.EjbcaException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"),
                      "org.ejbca.core.protocol.ws.AuthorizationDeniedException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "NotFoundException"),
                      "org.ejbca.core.protocol.ws.NotFoundException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "NotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"),
                      "org.ejbca.core.protocol.ws.CADoesntExistsException",
                      new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException"), 
                      true
                     ));
        _operations[37] = oper;

    }

    public EjbcaWSBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public EjbcaWSBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public EjbcaWSBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AlreadyRevokedException");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.AlreadyRevokedException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalException");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.ApprovalException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalRequestExecutionException");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.ApprovalRequestExecutionException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "ApprovalRequestExpiredException");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.ApprovalRequestExpiredException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "AuthorizationDeniedException");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.AuthorizationDeniedException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CADoesntExistsException");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.CADoesntExistsException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "certificate");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.Certificate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "CertificateExpiredException");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.CertificateExpiredException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "certificateResponse");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.CertificateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "DateNotValidException");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.DateNotValidException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaException");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.EjbcaException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "errorCode");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.ErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "extendedInformationWS");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.ExtendedInformationWS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "hardTokenDataWS");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.HardTokenDataWS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "HardTokenDoesntExistsException");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.HardTokenDoesntExistsException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "HardTokenExistsException");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.HardTokenExistsException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "IllegalQueryException");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.IllegalQueryException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "keyStore");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.KeyStore.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "MultipleMatchException");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.MultipleMatchException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "nameAndId");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.NameAndId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "NotFoundException");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.NotFoundException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "pinDataWS");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.PinDataWS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "PublisherException");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.PublisherException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "RevokeBackDateNotAllowedForProfileException");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.RevokeBackDateNotAllowedForProfileException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "revokeStatus");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.RevokeStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "SignRequestException");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.SignRequestException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "tokenCertificateRequestWS");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.TokenCertificateRequestWS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "tokenCertificateResponseWS");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.TokenCertificateResponseWS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "UserDataSourceException");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.UserDataSourceException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "userDataSourceVOWS");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.UserDataSourceVOWS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "userDataVOWS");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.UserDataVOWS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "UserDoesntFullfillEndEntityProfile");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.UserDoesntFullfillEndEntityProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "userMatch");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.UserMatch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "WaitingForApprovalException");
            cachedSerQNames.add(qName);
            cls = org.ejbca.core.protocol.ws.WaitingForApprovalException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void caCertResponse(java.lang.String arg0, byte[] arg1, byte[][] arg2, java.lang.String arg3) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.ApprovalException, org.ejbca.core.protocol.ws.CADoesntExistsException, org.ejbca.core.protocol.ws.WaitingForApprovalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "caCertResponse"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2, arg3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.ApprovalException) {
              throw (org.ejbca.core.protocol.ws.ApprovalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.CADoesntExistsException) {
              throw (org.ejbca.core.protocol.ws.CADoesntExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.WaitingForApprovalException) {
              throw (org.ejbca.core.protocol.ws.WaitingForApprovalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public byte[] caRenewCertRequest(java.lang.String arg0, byte[][] arg1, boolean arg2, boolean arg3, boolean arg4, java.lang.String arg5) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.ApprovalException, org.ejbca.core.protocol.ws.CADoesntExistsException, org.ejbca.core.protocol.ws.WaitingForApprovalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "caRenewCertRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, new java.lang.Boolean(arg2), new java.lang.Boolean(arg3), new java.lang.Boolean(arg4), arg5});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (byte[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.ApprovalException) {
              throw (org.ejbca.core.protocol.ws.ApprovalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.CADoesntExistsException) {
              throw (org.ejbca.core.protocol.ws.CADoesntExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.WaitingForApprovalException) {
              throw (org.ejbca.core.protocol.ws.WaitingForApprovalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.ejbca.core.protocol.ws.CertificateResponse certificateRequest(org.ejbca.core.protocol.ws.UserDataVOWS arg0, java.lang.String arg1, int arg2, java.lang.String arg3, java.lang.String arg4) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.ApprovalException, org.ejbca.core.protocol.ws.NotFoundException, org.ejbca.core.protocol.ws.UserDoesntFullfillEndEntityProfile, org.ejbca.core.protocol.ws.CADoesntExistsException, org.ejbca.core.protocol.ws.WaitingForApprovalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "certificateRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, new java.lang.Integer(arg2), arg3, arg4});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.ejbca.core.protocol.ws.CertificateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.ejbca.core.protocol.ws.CertificateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.ejbca.core.protocol.ws.CertificateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.ApprovalException) {
              throw (org.ejbca.core.protocol.ws.ApprovalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.NotFoundException) {
              throw (org.ejbca.core.protocol.ws.NotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.UserDoesntFullfillEndEntityProfile) {
              throw (org.ejbca.core.protocol.ws.UserDoesntFullfillEndEntityProfile) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.CADoesntExistsException) {
              throw (org.ejbca.core.protocol.ws.CADoesntExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.WaitingForApprovalException) {
              throw (org.ejbca.core.protocol.ws.WaitingForApprovalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.ejbca.core.protocol.ws.RevokeStatus checkRevokationStatus(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.CADoesntExistsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "checkRevokationStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.ejbca.core.protocol.ws.RevokeStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.ejbca.core.protocol.ws.RevokeStatus) org.apache.axis.utils.JavaUtils.convert(_resp, org.ejbca.core.protocol.ws.RevokeStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.CADoesntExistsException) {
              throw (org.ejbca.core.protocol.ws.CADoesntExistsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void createCRL(java.lang.String arg0) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.ApprovalRequestExpiredException, org.ejbca.core.protocol.ws.ApprovalException, org.ejbca.core.protocol.ws.CADoesntExistsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "createCRL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.ApprovalRequestExpiredException) {
              throw (org.ejbca.core.protocol.ws.ApprovalRequestExpiredException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.ApprovalException) {
              throw (org.ejbca.core.protocol.ws.ApprovalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.CADoesntExistsException) {
              throw (org.ejbca.core.protocol.ws.CADoesntExistsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.ejbca.core.protocol.ws.CertificateResponse crmfRequest(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.NotFoundException, org.ejbca.core.protocol.ws.CADoesntExistsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "crmfRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2, arg3, arg4});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.ejbca.core.protocol.ws.CertificateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.ejbca.core.protocol.ws.CertificateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.ejbca.core.protocol.ws.CertificateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.NotFoundException) {
              throw (org.ejbca.core.protocol.ws.NotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.CADoesntExistsException) {
              throw (org.ejbca.core.protocol.ws.CADoesntExistsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void customLog(int arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, org.ejbca.core.protocol.ws.Certificate arg4, java.lang.String arg5) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.CADoesntExistsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "customLog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(arg0), arg1, arg2, arg3, arg4, arg5});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.CADoesntExistsException) {
              throw (org.ejbca.core.protocol.ws.CADoesntExistsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.ejbca.core.protocol.ws.Certificate[] cvcRequest(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.CertificateExpiredException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.ApprovalException, org.ejbca.core.protocol.ws.SignRequestException, org.ejbca.core.protocol.ws.UserDoesntFullfillEndEntityProfile, org.ejbca.core.protocol.ws.NotFoundException, org.ejbca.core.protocol.ws.CADoesntExistsException, org.ejbca.core.protocol.ws.WaitingForApprovalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "cvcRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.ejbca.core.protocol.ws.Certificate[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.ejbca.core.protocol.ws.Certificate[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.ejbca.core.protocol.ws.Certificate[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.CertificateExpiredException) {
              throw (org.ejbca.core.protocol.ws.CertificateExpiredException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.ApprovalException) {
              throw (org.ejbca.core.protocol.ws.ApprovalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.SignRequestException) {
              throw (org.ejbca.core.protocol.ws.SignRequestException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.UserDoesntFullfillEndEntityProfile) {
              throw (org.ejbca.core.protocol.ws.UserDoesntFullfillEndEntityProfile) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.NotFoundException) {
              throw (org.ejbca.core.protocol.ws.NotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.CADoesntExistsException) {
              throw (org.ejbca.core.protocol.ws.CADoesntExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.WaitingForApprovalException) {
              throw (org.ejbca.core.protocol.ws.WaitingForApprovalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean deleteUserDataFromSource(java.lang.String[] arg0, java.lang.String arg1, boolean arg2) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.MultipleMatchException, org.ejbca.core.protocol.ws.UserDataSourceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "deleteUserDataFromSource"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, new java.lang.Boolean(arg2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.MultipleMatchException) {
              throw (org.ejbca.core.protocol.ws.MultipleMatchException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.UserDataSourceException) {
              throw (org.ejbca.core.protocol.ws.UserDataSourceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void editUser(org.ejbca.core.protocol.ws.UserDataVOWS arg0) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.ApprovalException, org.ejbca.core.protocol.ws.UserDoesntFullfillEndEntityProfile, org.ejbca.core.protocol.ws.CADoesntExistsException, org.ejbca.core.protocol.ws.WaitingForApprovalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "editUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.ApprovalException) {
              throw (org.ejbca.core.protocol.ws.ApprovalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.UserDoesntFullfillEndEntityProfile) {
              throw (org.ejbca.core.protocol.ws.UserDoesntFullfillEndEntityProfile) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.CADoesntExistsException) {
              throw (org.ejbca.core.protocol.ws.CADoesntExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.WaitingForApprovalException) {
              throw (org.ejbca.core.protocol.ws.WaitingForApprovalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean existsHardToken(java.lang.String arg0) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "existsHardToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.ejbca.core.protocol.ws.UserDataSourceVOWS[] fetchUserData(java.lang.String[] arg0, java.lang.String arg1) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.UserDataSourceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "fetchUserData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.ejbca.core.protocol.ws.UserDataSourceVOWS[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.ejbca.core.protocol.ws.UserDataSourceVOWS[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.ejbca.core.protocol.ws.UserDataSourceVOWS[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.UserDataSourceException) {
              throw (org.ejbca.core.protocol.ws.UserDataSourceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.ejbca.core.protocol.ws.Certificate[] findCerts(java.lang.String arg0, boolean arg1) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "findCerts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, new java.lang.Boolean(arg1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.ejbca.core.protocol.ws.Certificate[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.ejbca.core.protocol.ws.Certificate[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.ejbca.core.protocol.ws.Certificate[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.ejbca.core.protocol.ws.UserDataVOWS[] findUser(org.ejbca.core.protocol.ws.UserMatch arg0) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.IllegalQueryException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "findUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.ejbca.core.protocol.ws.UserDataVOWS[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.ejbca.core.protocol.ws.UserDataVOWS[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.ejbca.core.protocol.ws.UserDataVOWS[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.IllegalQueryException) {
              throw (org.ejbca.core.protocol.ws.IllegalQueryException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.ejbca.core.protocol.ws.TokenCertificateResponseWS[] genTokenCertificates(org.ejbca.core.protocol.ws.UserDataVOWS arg0, org.ejbca.core.protocol.ws.TokenCertificateRequestWS[] arg1, org.ejbca.core.protocol.ws.HardTokenDataWS arg2, boolean arg3, boolean arg4) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.HardTokenExistsException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.ApprovalRequestExpiredException, org.ejbca.core.protocol.ws.ApprovalException, org.ejbca.core.protocol.ws.UserDoesntFullfillEndEntityProfile, org.ejbca.core.protocol.ws.CADoesntExistsException, org.ejbca.core.protocol.ws.WaitingForApprovalException, org.ejbca.core.protocol.ws.ApprovalRequestExecutionException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "genTokenCertificates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2, new java.lang.Boolean(arg3), new java.lang.Boolean(arg4)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.ejbca.core.protocol.ws.TokenCertificateResponseWS[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.ejbca.core.protocol.ws.TokenCertificateResponseWS[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.ejbca.core.protocol.ws.TokenCertificateResponseWS[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.HardTokenExistsException) {
              throw (org.ejbca.core.protocol.ws.HardTokenExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.ApprovalRequestExpiredException) {
              throw (org.ejbca.core.protocol.ws.ApprovalRequestExpiredException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.ApprovalException) {
              throw (org.ejbca.core.protocol.ws.ApprovalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.UserDoesntFullfillEndEntityProfile) {
              throw (org.ejbca.core.protocol.ws.UserDoesntFullfillEndEntityProfile) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.CADoesntExistsException) {
              throw (org.ejbca.core.protocol.ws.CADoesntExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.WaitingForApprovalException) {
              throw (org.ejbca.core.protocol.ws.WaitingForApprovalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.ApprovalRequestExecutionException) {
              throw (org.ejbca.core.protocol.ws.ApprovalRequestExecutionException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.ejbca.core.protocol.ws.NameAndId[] getAuthorizedEndEntityProfiles() throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "getAuthorizedEndEntityProfiles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.ejbca.core.protocol.ws.NameAndId[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.ejbca.core.protocol.ws.NameAndId[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.ejbca.core.protocol.ws.NameAndId[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.ejbca.core.protocol.ws.NameAndId[] getAvailableCAs() throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "getAvailableCAs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.ejbca.core.protocol.ws.NameAndId[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.ejbca.core.protocol.ws.NameAndId[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.ejbca.core.protocol.ws.NameAndId[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.ejbca.core.protocol.ws.NameAndId[] getAvailableCAsInProfile(int arg0) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "getAvailableCAsInProfile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(arg0)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.ejbca.core.protocol.ws.NameAndId[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.ejbca.core.protocol.ws.NameAndId[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.ejbca.core.protocol.ws.NameAndId[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.ejbca.core.protocol.ws.NameAndId[] getAvailableCertificateProfiles(int arg0) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "getAvailableCertificateProfiles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(arg0)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.ejbca.core.protocol.ws.NameAndId[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.ejbca.core.protocol.ws.NameAndId[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.ejbca.core.protocol.ws.NameAndId[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.ejbca.core.protocol.ws.Certificate getCertificate(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.CADoesntExistsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "getCertificate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.ejbca.core.protocol.ws.Certificate) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.ejbca.core.protocol.ws.Certificate) org.apache.axis.utils.JavaUtils.convert(_resp, org.ejbca.core.protocol.ws.Certificate.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.CADoesntExistsException) {
              throw (org.ejbca.core.protocol.ws.CADoesntExistsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getEjbcaVersion() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "getEjbcaVersion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.ejbca.core.protocol.ws.HardTokenDataWS getHardTokenData(java.lang.String arg0, boolean arg1, boolean arg2) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.ApprovalRequestExpiredException, org.ejbca.core.protocol.ws.NotFoundException, org.ejbca.core.protocol.ws.CADoesntExistsException, org.ejbca.core.protocol.ws.HardTokenDoesntExistsException, org.ejbca.core.protocol.ws.WaitingForApprovalException, org.ejbca.core.protocol.ws.ApprovalRequestExecutionException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "getHardTokenData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, new java.lang.Boolean(arg1), new java.lang.Boolean(arg2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.ejbca.core.protocol.ws.HardTokenDataWS) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.ejbca.core.protocol.ws.HardTokenDataWS) org.apache.axis.utils.JavaUtils.convert(_resp, org.ejbca.core.protocol.ws.HardTokenDataWS.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.ApprovalRequestExpiredException) {
              throw (org.ejbca.core.protocol.ws.ApprovalRequestExpiredException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.NotFoundException) {
              throw (org.ejbca.core.protocol.ws.NotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.CADoesntExistsException) {
              throw (org.ejbca.core.protocol.ws.CADoesntExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.HardTokenDoesntExistsException) {
              throw (org.ejbca.core.protocol.ws.HardTokenDoesntExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.WaitingForApprovalException) {
              throw (org.ejbca.core.protocol.ws.WaitingForApprovalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.ApprovalRequestExecutionException) {
              throw (org.ejbca.core.protocol.ws.ApprovalRequestExecutionException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.ejbca.core.protocol.ws.HardTokenDataWS[] getHardTokenDatas(java.lang.String arg0, boolean arg1, boolean arg2) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.CADoesntExistsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "getHardTokenDatas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, new java.lang.Boolean(arg1), new java.lang.Boolean(arg2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.ejbca.core.protocol.ws.HardTokenDataWS[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.ejbca.core.protocol.ws.HardTokenDataWS[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.ejbca.core.protocol.ws.HardTokenDataWS[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.CADoesntExistsException) {
              throw (org.ejbca.core.protocol.ws.CADoesntExistsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.ejbca.core.protocol.ws.Certificate[] getLastCAChain(java.lang.String arg0) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.CADoesntExistsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "getLastCAChain"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.ejbca.core.protocol.ws.Certificate[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.ejbca.core.protocol.ws.Certificate[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.ejbca.core.protocol.ws.Certificate[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.CADoesntExistsException) {
              throw (org.ejbca.core.protocol.ws.CADoesntExistsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.ejbca.core.protocol.ws.Certificate[] getLastCertChain(java.lang.String arg0) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "getLastCertChain"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.ejbca.core.protocol.ws.Certificate[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.ejbca.core.protocol.ws.Certificate[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.ejbca.core.protocol.ws.Certificate[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int getPublisherQueueLength(java.lang.String arg0) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "getPublisherQueueLength"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int isApproved(int arg0) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.ApprovalRequestExpiredException, org.ejbca.core.protocol.ws.ApprovalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "isApproved"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(arg0)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.ApprovalRequestExpiredException) {
              throw (org.ejbca.core.protocol.ws.ApprovalRequestExpiredException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.ApprovalException) {
              throw (org.ejbca.core.protocol.ws.ApprovalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean isAuthorized(java.lang.String arg0) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "isAuthorized"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void keyRecoverNewest(java.lang.String arg0) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.ApprovalException, org.ejbca.core.protocol.ws.NotFoundException, org.ejbca.core.protocol.ws.CADoesntExistsException, org.ejbca.core.protocol.ws.WaitingForApprovalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "keyRecoverNewest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.ApprovalException) {
              throw (org.ejbca.core.protocol.ws.ApprovalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.NotFoundException) {
              throw (org.ejbca.core.protocol.ws.NotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.CADoesntExistsException) {
              throw (org.ejbca.core.protocol.ws.CADoesntExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.WaitingForApprovalException) {
              throw (org.ejbca.core.protocol.ws.WaitingForApprovalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.ejbca.core.protocol.ws.CertificateResponse pkcs10Request(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.NotFoundException, org.ejbca.core.protocol.ws.CADoesntExistsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "pkcs10Request"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2, arg3, arg4});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.ejbca.core.protocol.ws.CertificateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.ejbca.core.protocol.ws.CertificateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.ejbca.core.protocol.ws.CertificateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.NotFoundException) {
              throw (org.ejbca.core.protocol.ws.NotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.CADoesntExistsException) {
              throw (org.ejbca.core.protocol.ws.CADoesntExistsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.ejbca.core.protocol.ws.KeyStore pkcs12Req(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.NotFoundException, org.ejbca.core.protocol.ws.CADoesntExistsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "pkcs12Req"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2, arg3, arg4});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.ejbca.core.protocol.ws.KeyStore) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.ejbca.core.protocol.ws.KeyStore) org.apache.axis.utils.JavaUtils.convert(_resp, org.ejbca.core.protocol.ws.KeyStore.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.NotFoundException) {
              throw (org.ejbca.core.protocol.ws.NotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.CADoesntExistsException) {
              throw (org.ejbca.core.protocol.ws.CADoesntExistsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void republishCertificate(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.PublisherException, org.ejbca.core.protocol.ws.CADoesntExistsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "republishCertificate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.PublisherException) {
              throw (org.ejbca.core.protocol.ws.PublisherException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.CADoesntExistsException) {
              throw (org.ejbca.core.protocol.ws.CADoesntExistsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void revokeCert(java.lang.String arg0, java.lang.String arg1, int arg2) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.AlreadyRevokedException, org.ejbca.core.protocol.ws.ApprovalException, org.ejbca.core.protocol.ws.NotFoundException, org.ejbca.core.protocol.ws.CADoesntExistsException, org.ejbca.core.protocol.ws.WaitingForApprovalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "revokeCert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, new java.lang.Integer(arg2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AlreadyRevokedException) {
              throw (org.ejbca.core.protocol.ws.AlreadyRevokedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.ApprovalException) {
              throw (org.ejbca.core.protocol.ws.ApprovalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.NotFoundException) {
              throw (org.ejbca.core.protocol.ws.NotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.CADoesntExistsException) {
              throw (org.ejbca.core.protocol.ws.CADoesntExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.WaitingForApprovalException) {
              throw (org.ejbca.core.protocol.ws.WaitingForApprovalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void revokeCertBackdated(java.lang.String arg0, java.lang.String arg1, int arg2, java.lang.String arg3) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.RevokeBackDateNotAllowedForProfileException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.AlreadyRevokedException, org.ejbca.core.protocol.ws.ApprovalException, org.ejbca.core.protocol.ws.DateNotValidException, org.ejbca.core.protocol.ws.NotFoundException, org.ejbca.core.protocol.ws.CADoesntExistsException, org.ejbca.core.protocol.ws.WaitingForApprovalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "revokeCertBackdated"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, new java.lang.Integer(arg2), arg3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.RevokeBackDateNotAllowedForProfileException) {
              throw (org.ejbca.core.protocol.ws.RevokeBackDateNotAllowedForProfileException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AlreadyRevokedException) {
              throw (org.ejbca.core.protocol.ws.AlreadyRevokedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.ApprovalException) {
              throw (org.ejbca.core.protocol.ws.ApprovalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.DateNotValidException) {
              throw (org.ejbca.core.protocol.ws.DateNotValidException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.NotFoundException) {
              throw (org.ejbca.core.protocol.ws.NotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.CADoesntExistsException) {
              throw (org.ejbca.core.protocol.ws.CADoesntExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.WaitingForApprovalException) {
              throw (org.ejbca.core.protocol.ws.WaitingForApprovalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void revokeToken(java.lang.String arg0, int arg1) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.AlreadyRevokedException, org.ejbca.core.protocol.ws.ApprovalException, org.ejbca.core.protocol.ws.NotFoundException, org.ejbca.core.protocol.ws.CADoesntExistsException, org.ejbca.core.protocol.ws.WaitingForApprovalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "revokeToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, new java.lang.Integer(arg1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AlreadyRevokedException) {
              throw (org.ejbca.core.protocol.ws.AlreadyRevokedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.ApprovalException) {
              throw (org.ejbca.core.protocol.ws.ApprovalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.NotFoundException) {
              throw (org.ejbca.core.protocol.ws.NotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.CADoesntExistsException) {
              throw (org.ejbca.core.protocol.ws.CADoesntExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.WaitingForApprovalException) {
              throw (org.ejbca.core.protocol.ws.WaitingForApprovalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void revokeUser(java.lang.String arg0, int arg1, boolean arg2) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.AlreadyRevokedException, org.ejbca.core.protocol.ws.ApprovalException, org.ejbca.core.protocol.ws.NotFoundException, org.ejbca.core.protocol.ws.CADoesntExistsException, org.ejbca.core.protocol.ws.WaitingForApprovalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "revokeUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, new java.lang.Integer(arg1), new java.lang.Boolean(arg2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AlreadyRevokedException) {
              throw (org.ejbca.core.protocol.ws.AlreadyRevokedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.ApprovalException) {
              throw (org.ejbca.core.protocol.ws.ApprovalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.NotFoundException) {
              throw (org.ejbca.core.protocol.ws.NotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.CADoesntExistsException) {
              throw (org.ejbca.core.protocol.ws.CADoesntExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.WaitingForApprovalException) {
              throw (org.ejbca.core.protocol.ws.WaitingForApprovalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.ejbca.core.protocol.ws.KeyStore softTokenRequest(org.ejbca.core.protocol.ws.UserDataVOWS arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.ApprovalException, org.ejbca.core.protocol.ws.NotFoundException, org.ejbca.core.protocol.ws.UserDoesntFullfillEndEntityProfile, org.ejbca.core.protocol.ws.CADoesntExistsException, org.ejbca.core.protocol.ws.WaitingForApprovalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "softTokenRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2, arg3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.ejbca.core.protocol.ws.KeyStore) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.ejbca.core.protocol.ws.KeyStore) org.apache.axis.utils.JavaUtils.convert(_resp, org.ejbca.core.protocol.ws.KeyStore.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.ApprovalException) {
              throw (org.ejbca.core.protocol.ws.ApprovalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.NotFoundException) {
              throw (org.ejbca.core.protocol.ws.NotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.UserDoesntFullfillEndEntityProfile) {
              throw (org.ejbca.core.protocol.ws.UserDoesntFullfillEndEntityProfile) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.CADoesntExistsException) {
              throw (org.ejbca.core.protocol.ws.CADoesntExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.WaitingForApprovalException) {
              throw (org.ejbca.core.protocol.ws.WaitingForApprovalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.ejbca.core.protocol.ws.CertificateResponse spkacRequest(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.NotFoundException, org.ejbca.core.protocol.ws.CADoesntExistsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "spkacRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, arg2, arg3, arg4});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.ejbca.core.protocol.ws.CertificateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.ejbca.core.protocol.ws.CertificateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.ejbca.core.protocol.ws.CertificateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.EjbcaException) {
              throw (org.ejbca.core.protocol.ws.EjbcaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.AuthorizationDeniedException) {
              throw (org.ejbca.core.protocol.ws.AuthorizationDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.NotFoundException) {
              throw (org.ejbca.core.protocol.ws.NotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.ejbca.core.protocol.ws.CADoesntExistsException) {
              throw (org.ejbca.core.protocol.ws.CADoesntExistsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
