/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ElectronicAddress;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Electronic Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ElectronicAddressImpl#getEmail1 <em>Email1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ElectronicAddressImpl#getEmail2 <em>Email2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ElectronicAddressImpl#getLan <em>Lan</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ElectronicAddressImpl#getMac <em>Mac</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ElectronicAddressImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ElectronicAddressImpl#getRadio <em>Radio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ElectronicAddressImpl#getUserID <em>User ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ElectronicAddressImpl#getWeb <em>Web</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElectronicAddressImpl extends MinimalEObjectImpl.Container implements ElectronicAddress {
    /**
     * The default value of the '{@link #getEmail1() <em>Email1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmail1()
     * @generated
     * @ordered
     */
    protected static final String EMAIL1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEmail1() <em>Email1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmail1()
     * @generated
     * @ordered
     */
    protected String email1 = EMAIL1_EDEFAULT;

    /**
     * This is true if the Email1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean email1ESet;

    /**
     * The default value of the '{@link #getEmail2() <em>Email2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmail2()
     * @generated
     * @ordered
     */
    protected static final String EMAIL2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEmail2() <em>Email2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmail2()
     * @generated
     * @ordered
     */
    protected String email2 = EMAIL2_EDEFAULT;

    /**
     * This is true if the Email2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean email2ESet;

    /**
     * The default value of the '{@link #getLan() <em>Lan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLan()
     * @generated
     * @ordered
     */
    protected static final String LAN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLan() <em>Lan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLan()
     * @generated
     * @ordered
     */
    protected String lan = LAN_EDEFAULT;

    /**
     * This is true if the Lan attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lanESet;

    /**
     * The default value of the '{@link #getMac() <em>Mac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMac()
     * @generated
     * @ordered
     */
    protected static final String MAC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMac() <em>Mac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMac()
     * @generated
     * @ordered
     */
    protected String mac = MAC_EDEFAULT;

    /**
     * This is true if the Mac attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean macESet;

    /**
     * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPassword()
     * @generated
     * @ordered
     */
    protected static final String PASSWORD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPassword()
     * @generated
     * @ordered
     */
    protected String password = PASSWORD_EDEFAULT;

    /**
     * This is true if the Password attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean passwordESet;

    /**
     * The default value of the '{@link #getRadio() <em>Radio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRadio()
     * @generated
     * @ordered
     */
    protected static final String RADIO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRadio() <em>Radio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRadio()
     * @generated
     * @ordered
     */
    protected String radio = RADIO_EDEFAULT;

    /**
     * This is true if the Radio attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean radioESet;

    /**
     * The default value of the '{@link #getUserID() <em>User ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUserID()
     * @generated
     * @ordered
     */
    protected static final String USER_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUserID() <em>User ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUserID()
     * @generated
     * @ordered
     */
    protected String userID = USER_ID_EDEFAULT;

    /**
     * This is true if the User ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean userIDESet;

    /**
     * The default value of the '{@link #getWeb() <em>Web</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWeb()
     * @generated
     * @ordered
     */
    protected static final String WEB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWeb() <em>Web</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWeb()
     * @generated
     * @ordered
     */
    protected String web = WEB_EDEFAULT;

    /**
     * This is true if the Web attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean webESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ElectronicAddressImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getElectronicAddress();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getEmail1() {
        return email1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEmail1( String newEmail1 ) {
        String oldEmail1 = email1;
        email1 = newEmail1;
        boolean oldEmail1ESet = email1ESet;
        email1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ELECTRONIC_ADDRESS__EMAIL1, oldEmail1, email1, !oldEmail1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEmail1() {
        String oldEmail1 = email1;
        boolean oldEmail1ESet = email1ESet;
        email1 = EMAIL1_EDEFAULT;
        email1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ELECTRONIC_ADDRESS__EMAIL1, oldEmail1, EMAIL1_EDEFAULT, oldEmail1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEmail1() {
        return email1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getEmail2() {
        return email2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEmail2( String newEmail2 ) {
        String oldEmail2 = email2;
        email2 = newEmail2;
        boolean oldEmail2ESet = email2ESet;
        email2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ELECTRONIC_ADDRESS__EMAIL2, oldEmail2, email2, !oldEmail2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEmail2() {
        String oldEmail2 = email2;
        boolean oldEmail2ESet = email2ESet;
        email2 = EMAIL2_EDEFAULT;
        email2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ELECTRONIC_ADDRESS__EMAIL2, oldEmail2, EMAIL2_EDEFAULT, oldEmail2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEmail2() {
        return email2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLan() {
        return lan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLan( String newLan ) {
        String oldLan = lan;
        lan = newLan;
        boolean oldLanESet = lanESet;
        lanESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ELECTRONIC_ADDRESS__LAN, oldLan, lan, !oldLanESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLan() {
        String oldLan = lan;
        boolean oldLanESet = lanESet;
        lan = LAN_EDEFAULT;
        lanESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ELECTRONIC_ADDRESS__LAN, oldLan, LAN_EDEFAULT, oldLanESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLan() {
        return lanESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getMac() {
        return mac;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMac( String newMac ) {
        String oldMac = mac;
        mac = newMac;
        boolean oldMacESet = macESet;
        macESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ELECTRONIC_ADDRESS__MAC, oldMac, mac, !oldMacESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMac() {
        String oldMac = mac;
        boolean oldMacESet = macESet;
        mac = MAC_EDEFAULT;
        macESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ELECTRONIC_ADDRESS__MAC, oldMac, MAC_EDEFAULT, oldMacESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMac() {
        return macESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPassword() {
        return password;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPassword( String newPassword ) {
        String oldPassword = password;
        password = newPassword;
        boolean oldPasswordESet = passwordESet;
        passwordESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ELECTRONIC_ADDRESS__PASSWORD, oldPassword, password, !oldPasswordESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPassword() {
        String oldPassword = password;
        boolean oldPasswordESet = passwordESet;
        password = PASSWORD_EDEFAULT;
        passwordESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ELECTRONIC_ADDRESS__PASSWORD, oldPassword, PASSWORD_EDEFAULT, oldPasswordESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPassword() {
        return passwordESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRadio() {
        return radio;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRadio( String newRadio ) {
        String oldRadio = radio;
        radio = newRadio;
        boolean oldRadioESet = radioESet;
        radioESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ELECTRONIC_ADDRESS__RADIO, oldRadio, radio, !oldRadioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRadio() {
        String oldRadio = radio;
        boolean oldRadioESet = radioESet;
        radio = RADIO_EDEFAULT;
        radioESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ELECTRONIC_ADDRESS__RADIO, oldRadio, RADIO_EDEFAULT, oldRadioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRadio() {
        return radioESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getUserID() {
        return userID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUserID( String newUserID ) {
        String oldUserID = userID;
        userID = newUserID;
        boolean oldUserIDESet = userIDESet;
        userIDESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ELECTRONIC_ADDRESS__USER_ID, oldUserID, userID, !oldUserIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUserID() {
        String oldUserID = userID;
        boolean oldUserIDESet = userIDESet;
        userID = USER_ID_EDEFAULT;
        userIDESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ELECTRONIC_ADDRESS__USER_ID, oldUserID, USER_ID_EDEFAULT, oldUserIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUserID() {
        return userIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getWeb() {
        return web;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWeb( String newWeb ) {
        String oldWeb = web;
        web = newWeb;
        boolean oldWebESet = webESet;
        webESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ELECTRONIC_ADDRESS__WEB, oldWeb, web, !oldWebESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWeb() {
        String oldWeb = web;
        boolean oldWebESet = webESet;
        web = WEB_EDEFAULT;
        webESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ELECTRONIC_ADDRESS__WEB, oldWeb, WEB_EDEFAULT, oldWebESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWeb() {
        return webESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.ELECTRONIC_ADDRESS__EMAIL1:
            return getEmail1();
        case CimPackage.ELECTRONIC_ADDRESS__EMAIL2:
            return getEmail2();
        case CimPackage.ELECTRONIC_ADDRESS__LAN:
            return getLan();
        case CimPackage.ELECTRONIC_ADDRESS__MAC:
            return getMac();
        case CimPackage.ELECTRONIC_ADDRESS__PASSWORD:
            return getPassword();
        case CimPackage.ELECTRONIC_ADDRESS__RADIO:
            return getRadio();
        case CimPackage.ELECTRONIC_ADDRESS__USER_ID:
            return getUserID();
        case CimPackage.ELECTRONIC_ADDRESS__WEB:
            return getWeb();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.ELECTRONIC_ADDRESS__EMAIL1:
            setEmail1( ( String ) newValue );
            return;
        case CimPackage.ELECTRONIC_ADDRESS__EMAIL2:
            setEmail2( ( String ) newValue );
            return;
        case CimPackage.ELECTRONIC_ADDRESS__LAN:
            setLan( ( String ) newValue );
            return;
        case CimPackage.ELECTRONIC_ADDRESS__MAC:
            setMac( ( String ) newValue );
            return;
        case CimPackage.ELECTRONIC_ADDRESS__PASSWORD:
            setPassword( ( String ) newValue );
            return;
        case CimPackage.ELECTRONIC_ADDRESS__RADIO:
            setRadio( ( String ) newValue );
            return;
        case CimPackage.ELECTRONIC_ADDRESS__USER_ID:
            setUserID( ( String ) newValue );
            return;
        case CimPackage.ELECTRONIC_ADDRESS__WEB:
            setWeb( ( String ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case CimPackage.ELECTRONIC_ADDRESS__EMAIL1:
            unsetEmail1();
            return;
        case CimPackage.ELECTRONIC_ADDRESS__EMAIL2:
            unsetEmail2();
            return;
        case CimPackage.ELECTRONIC_ADDRESS__LAN:
            unsetLan();
            return;
        case CimPackage.ELECTRONIC_ADDRESS__MAC:
            unsetMac();
            return;
        case CimPackage.ELECTRONIC_ADDRESS__PASSWORD:
            unsetPassword();
            return;
        case CimPackage.ELECTRONIC_ADDRESS__RADIO:
            unsetRadio();
            return;
        case CimPackage.ELECTRONIC_ADDRESS__USER_ID:
            unsetUserID();
            return;
        case CimPackage.ELECTRONIC_ADDRESS__WEB:
            unsetWeb();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case CimPackage.ELECTRONIC_ADDRESS__EMAIL1:
            return isSetEmail1();
        case CimPackage.ELECTRONIC_ADDRESS__EMAIL2:
            return isSetEmail2();
        case CimPackage.ELECTRONIC_ADDRESS__LAN:
            return isSetLan();
        case CimPackage.ELECTRONIC_ADDRESS__MAC:
            return isSetMac();
        case CimPackage.ELECTRONIC_ADDRESS__PASSWORD:
            return isSetPassword();
        case CimPackage.ELECTRONIC_ADDRESS__RADIO:
            return isSetRadio();
        case CimPackage.ELECTRONIC_ADDRESS__USER_ID:
            return isSetUserID();
        case CimPackage.ELECTRONIC_ADDRESS__WEB:
            return isSetWeb();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (email1: " );
        if( email1ESet )
            result.append( email1 );
        else
            result.append( "<unset>" );
        result.append( ", email2: " );
        if( email2ESet )
            result.append( email2 );
        else
            result.append( "<unset>" );
        result.append( ", lan: " );
        if( lanESet )
            result.append( lan );
        else
            result.append( "<unset>" );
        result.append( ", mac: " );
        if( macESet )
            result.append( mac );
        else
            result.append( "<unset>" );
        result.append( ", password: " );
        if( passwordESet )
            result.append( password );
        else
            result.append( "<unset>" );
        result.append( ", radio: " );
        if( radioESet )
            result.append( radio );
        else
            result.append( "<unset>" );
        result.append( ", userID: " );
        if( userIDESet )
            result.append( userID );
        else
            result.append( "<unset>" );
        result.append( ", web: " );
        if( webESet )
            result.append( web );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ElectronicAddressImpl
