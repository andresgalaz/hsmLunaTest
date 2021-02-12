package org.ejbca.core.protocol.ws;

public class EjbcaWSProxy implements org.ejbca.core.protocol.ws.EjbcaWS {
  private String _endpoint = null;
  private org.ejbca.core.protocol.ws.EjbcaWS ejbcaWS = null;
  
  public EjbcaWSProxy() {
    _initEjbcaWSProxy();
  }
  
  public EjbcaWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initEjbcaWSProxy();
  }
  
  private void _initEjbcaWSProxy() {
    try {
      ejbcaWS = (new org.ejbca.core.protocol.ws.EjbcaWSServiceLocator()).getEjbcaWSPort();
      if (ejbcaWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)ejbcaWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)ejbcaWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (ejbcaWS != null)
      ((javax.xml.rpc.Stub)ejbcaWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.ejbca.core.protocol.ws.EjbcaWS getEjbcaWS() {
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    return ejbcaWS;
  }
  
  public void caCertResponse(java.lang.String arg0, byte[] arg1, byte[][] arg2, java.lang.String arg3) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.ApprovalException, org.ejbca.core.protocol.ws.CADoesntExistsException, org.ejbca.core.protocol.ws.WaitingForApprovalException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    ejbcaWS.caCertResponse(arg0, arg1, arg2, arg3);
  }
  
  public byte[] caRenewCertRequest(java.lang.String arg0, byte[][] arg1, boolean arg2, boolean arg3, boolean arg4, java.lang.String arg5) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.ApprovalException, org.ejbca.core.protocol.ws.CADoesntExistsException, org.ejbca.core.protocol.ws.WaitingForApprovalException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    return ejbcaWS.caRenewCertRequest(arg0, arg1, arg2, arg3, arg4, arg5);
  }
  
  public org.ejbca.core.protocol.ws.CertificateResponse certificateRequest(org.ejbca.core.protocol.ws.UserDataVOWS arg0, java.lang.String arg1, int arg2, java.lang.String arg3, java.lang.String arg4) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.ApprovalException, org.ejbca.core.protocol.ws.NotFoundException, org.ejbca.core.protocol.ws.UserDoesntFullfillEndEntityProfile, org.ejbca.core.protocol.ws.CADoesntExistsException, org.ejbca.core.protocol.ws.WaitingForApprovalException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    return ejbcaWS.certificateRequest(arg0, arg1, arg2, arg3, arg4);
  }
  
  public org.ejbca.core.protocol.ws.RevokeStatus checkRevokationStatus(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.CADoesntExistsException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    return ejbcaWS.checkRevokationStatus(arg0, arg1);
  }
  
  public void createCRL(java.lang.String arg0) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.ApprovalRequestExpiredException, org.ejbca.core.protocol.ws.ApprovalException, org.ejbca.core.protocol.ws.CADoesntExistsException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    ejbcaWS.createCRL(arg0);
  }
  
  public org.ejbca.core.protocol.ws.CertificateResponse crmfRequest(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.NotFoundException, org.ejbca.core.protocol.ws.CADoesntExistsException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    return ejbcaWS.crmfRequest(arg0, arg1, arg2, arg3, arg4);
  }
  
  public void customLog(int arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, org.ejbca.core.protocol.ws.Certificate arg4, java.lang.String arg5) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.CADoesntExistsException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    ejbcaWS.customLog(arg0, arg1, arg2, arg3, arg4, arg5);
  }
  
  public org.ejbca.core.protocol.ws.Certificate[] cvcRequest(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.CertificateExpiredException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.ApprovalException, org.ejbca.core.protocol.ws.SignRequestException, org.ejbca.core.protocol.ws.UserDoesntFullfillEndEntityProfile, org.ejbca.core.protocol.ws.NotFoundException, org.ejbca.core.protocol.ws.CADoesntExistsException, org.ejbca.core.protocol.ws.WaitingForApprovalException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    return ejbcaWS.cvcRequest(arg0, arg1, arg2);
  }
  
  public boolean deleteUserDataFromSource(java.lang.String[] arg0, java.lang.String arg1, boolean arg2) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.MultipleMatchException, org.ejbca.core.protocol.ws.UserDataSourceException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    return ejbcaWS.deleteUserDataFromSource(arg0, arg1, arg2);
  }
  
  public void editUser(org.ejbca.core.protocol.ws.UserDataVOWS arg0) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.ApprovalException, org.ejbca.core.protocol.ws.UserDoesntFullfillEndEntityProfile, org.ejbca.core.protocol.ws.CADoesntExistsException, org.ejbca.core.protocol.ws.WaitingForApprovalException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    ejbcaWS.editUser(arg0);
  }
  
  public boolean existsHardToken(java.lang.String arg0) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    return ejbcaWS.existsHardToken(arg0);
  }
  
  public org.ejbca.core.protocol.ws.UserDataSourceVOWS[] fetchUserData(java.lang.String[] arg0, java.lang.String arg1) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.UserDataSourceException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    return ejbcaWS.fetchUserData(arg0, arg1);
  }
  
  public org.ejbca.core.protocol.ws.Certificate[] findCerts(java.lang.String arg0, boolean arg1) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    return ejbcaWS.findCerts(arg0, arg1);
  }
  
  public org.ejbca.core.protocol.ws.UserDataVOWS[] findUser(org.ejbca.core.protocol.ws.UserMatch arg0) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.IllegalQueryException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    return ejbcaWS.findUser(arg0);
  }
  
  public org.ejbca.core.protocol.ws.TokenCertificateResponseWS[] genTokenCertificates(org.ejbca.core.protocol.ws.UserDataVOWS arg0, org.ejbca.core.protocol.ws.TokenCertificateRequestWS[] arg1, org.ejbca.core.protocol.ws.HardTokenDataWS arg2, boolean arg3, boolean arg4) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.HardTokenExistsException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.ApprovalRequestExpiredException, org.ejbca.core.protocol.ws.ApprovalException, org.ejbca.core.protocol.ws.UserDoesntFullfillEndEntityProfile, org.ejbca.core.protocol.ws.CADoesntExistsException, org.ejbca.core.protocol.ws.WaitingForApprovalException, org.ejbca.core.protocol.ws.ApprovalRequestExecutionException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    return ejbcaWS.genTokenCertificates(arg0, arg1, arg2, arg3, arg4);
  }
  
  public org.ejbca.core.protocol.ws.NameAndId[] getAuthorizedEndEntityProfiles() throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    return ejbcaWS.getAuthorizedEndEntityProfiles();
  }
  
  public org.ejbca.core.protocol.ws.NameAndId[] getAvailableCAs() throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    return ejbcaWS.getAvailableCAs();
  }
  
  public org.ejbca.core.protocol.ws.NameAndId[] getAvailableCAsInProfile(int arg0) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    return ejbcaWS.getAvailableCAsInProfile(arg0);
  }
  
  public org.ejbca.core.protocol.ws.NameAndId[] getAvailableCertificateProfiles(int arg0) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    return ejbcaWS.getAvailableCertificateProfiles(arg0);
  }
  
  public org.ejbca.core.protocol.ws.Certificate getCertificate(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.CADoesntExistsException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    return ejbcaWS.getCertificate(arg0, arg1);
  }
  
  public java.lang.String getEjbcaVersion() throws java.rmi.RemoteException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    return ejbcaWS.getEjbcaVersion();
  }
  
  public org.ejbca.core.protocol.ws.HardTokenDataWS getHardTokenData(java.lang.String arg0, boolean arg1, boolean arg2) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.ApprovalRequestExpiredException, org.ejbca.core.protocol.ws.NotFoundException, org.ejbca.core.protocol.ws.CADoesntExistsException, org.ejbca.core.protocol.ws.HardTokenDoesntExistsException, org.ejbca.core.protocol.ws.WaitingForApprovalException, org.ejbca.core.protocol.ws.ApprovalRequestExecutionException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    return ejbcaWS.getHardTokenData(arg0, arg1, arg2);
  }
  
  public org.ejbca.core.protocol.ws.HardTokenDataWS[] getHardTokenDatas(java.lang.String arg0, boolean arg1, boolean arg2) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.CADoesntExistsException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    return ejbcaWS.getHardTokenDatas(arg0, arg1, arg2);
  }
  
  public org.ejbca.core.protocol.ws.Certificate[] getLastCAChain(java.lang.String arg0) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.CADoesntExistsException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    return ejbcaWS.getLastCAChain(arg0);
  }
  
  public org.ejbca.core.protocol.ws.Certificate[] getLastCertChain(java.lang.String arg0) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    return ejbcaWS.getLastCertChain(arg0);
  }
  
  public int getPublisherQueueLength(java.lang.String arg0) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    return ejbcaWS.getPublisherQueueLength(arg0);
  }
  
  public int isApproved(int arg0) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.ApprovalRequestExpiredException, org.ejbca.core.protocol.ws.ApprovalException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    return ejbcaWS.isApproved(arg0);
  }
  
  public boolean isAuthorized(java.lang.String arg0) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    return ejbcaWS.isAuthorized(arg0);
  }
  
  public void keyRecoverNewest(java.lang.String arg0) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.ApprovalException, org.ejbca.core.protocol.ws.NotFoundException, org.ejbca.core.protocol.ws.CADoesntExistsException, org.ejbca.core.protocol.ws.WaitingForApprovalException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    ejbcaWS.keyRecoverNewest(arg0);
  }
  
  public org.ejbca.core.protocol.ws.CertificateResponse pkcs10Request(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.NotFoundException, org.ejbca.core.protocol.ws.CADoesntExistsException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    return ejbcaWS.pkcs10Request(arg0, arg1, arg2, arg3, arg4);
  }
  
  public org.ejbca.core.protocol.ws.KeyStore pkcs12Req(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.NotFoundException, org.ejbca.core.protocol.ws.CADoesntExistsException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    return ejbcaWS.pkcs12Req(arg0, arg1, arg2, arg3, arg4);
  }
  
  public void republishCertificate(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.PublisherException, org.ejbca.core.protocol.ws.CADoesntExistsException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    ejbcaWS.republishCertificate(arg0, arg1);
  }
  
  public void revokeCert(java.lang.String arg0, java.lang.String arg1, int arg2) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.AlreadyRevokedException, org.ejbca.core.protocol.ws.ApprovalException, org.ejbca.core.protocol.ws.NotFoundException, org.ejbca.core.protocol.ws.CADoesntExistsException, org.ejbca.core.protocol.ws.WaitingForApprovalException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    ejbcaWS.revokeCert(arg0, arg1, arg2);
  }
  
  public void revokeCertBackdated(java.lang.String arg0, java.lang.String arg1, int arg2, java.lang.String arg3) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.RevokeBackDateNotAllowedForProfileException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.AlreadyRevokedException, org.ejbca.core.protocol.ws.ApprovalException, org.ejbca.core.protocol.ws.DateNotValidException, org.ejbca.core.protocol.ws.NotFoundException, org.ejbca.core.protocol.ws.CADoesntExistsException, org.ejbca.core.protocol.ws.WaitingForApprovalException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    ejbcaWS.revokeCertBackdated(arg0, arg1, arg2, arg3);
  }
  
  public void revokeToken(java.lang.String arg0, int arg1) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.AlreadyRevokedException, org.ejbca.core.protocol.ws.ApprovalException, org.ejbca.core.protocol.ws.NotFoundException, org.ejbca.core.protocol.ws.CADoesntExistsException, org.ejbca.core.protocol.ws.WaitingForApprovalException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    ejbcaWS.revokeToken(arg0, arg1);
  }
  
  public void revokeUser(java.lang.String arg0, int arg1, boolean arg2) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.AlreadyRevokedException, org.ejbca.core.protocol.ws.ApprovalException, org.ejbca.core.protocol.ws.NotFoundException, org.ejbca.core.protocol.ws.CADoesntExistsException, org.ejbca.core.protocol.ws.WaitingForApprovalException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    ejbcaWS.revokeUser(arg0, arg1, arg2);
  }
  
  public org.ejbca.core.protocol.ws.KeyStore softTokenRequest(org.ejbca.core.protocol.ws.UserDataVOWS arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.ApprovalException, org.ejbca.core.protocol.ws.NotFoundException, org.ejbca.core.protocol.ws.UserDoesntFullfillEndEntityProfile, org.ejbca.core.protocol.ws.CADoesntExistsException, org.ejbca.core.protocol.ws.WaitingForApprovalException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    return ejbcaWS.softTokenRequest(arg0, arg1, arg2, arg3);
  }
  
  public org.ejbca.core.protocol.ws.CertificateResponse spkacRequest(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws java.rmi.RemoteException, org.ejbca.core.protocol.ws.EjbcaException, org.ejbca.core.protocol.ws.AuthorizationDeniedException, org.ejbca.core.protocol.ws.NotFoundException, org.ejbca.core.protocol.ws.CADoesntExistsException{
    if (ejbcaWS == null)
      _initEjbcaWSProxy();
    return ejbcaWS.spkacRequest(arg0, arg1, arg2, arg3, arg4);
  }
  
  
}