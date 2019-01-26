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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Telephone Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TelephoneNumberImpl#getAreaCode <em>Area Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TelephoneNumberImpl#getCityCode <em>City Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TelephoneNumberImpl#getCountryCode <em>Country Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TelephoneNumberImpl#getDialOut <em>Dial Out</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TelephoneNumberImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TelephoneNumberImpl#getInternationalPrefix <em>International Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TelephoneNumberImpl#getItuPhone <em>Itu Phone</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TelephoneNumberImpl#getLocalNumber <em>Local Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TelephoneNumberImpl extends MinimalEObjectImpl.Container implements TelephoneNumber {
    /**
     * The default value of the '{@link #getAreaCode() <em>Area Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAreaCode()
     * @generated
     * @ordered
     */
    protected static final String AREA_CODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAreaCode() <em>Area Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAreaCode()
     * @generated
     * @ordered
     */
    protected String areaCode = AREA_CODE_EDEFAULT;

    /**
     * This is true if the Area Code attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean areaCodeESet;

    /**
     * The default value of the '{@link #getCityCode() <em>City Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCityCode()
     * @generated
     * @ordered
     */
    protected static final String CITY_CODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCityCode() <em>City Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCityCode()
     * @generated
     * @ordered
     */
    protected String cityCode = CITY_CODE_EDEFAULT;

    /**
     * This is true if the City Code attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cityCodeESet;

    /**
     * The default value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCountryCode()
     * @generated
     * @ordered
     */
    protected static final String COUNTRY_CODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCountryCode()
     * @generated
     * @ordered
     */
    protected String countryCode = COUNTRY_CODE_EDEFAULT;

    /**
     * This is true if the Country Code attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean countryCodeESet;

    /**
     * The default value of the '{@link #getDialOut() <em>Dial Out</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDialOut()
     * @generated
     * @ordered
     */
    protected static final String DIAL_OUT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDialOut() <em>Dial Out</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDialOut()
     * @generated
     * @ordered
     */
    protected String dialOut = DIAL_OUT_EDEFAULT;

    /**
     * This is true if the Dial Out attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dialOutESet;

    /**
     * The default value of the '{@link #getExtension() <em>Extension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtension()
     * @generated
     * @ordered
     */
    protected static final String EXTENSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getExtension() <em>Extension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtension()
     * @generated
     * @ordered
     */
    protected String extension = EXTENSION_EDEFAULT;

    /**
     * This is true if the Extension attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean extensionESet;

    /**
     * The default value of the '{@link #getInternationalPrefix() <em>International Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInternationalPrefix()
     * @generated
     * @ordered
     */
    protected static final String INTERNATIONAL_PREFIX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInternationalPrefix() <em>International Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInternationalPrefix()
     * @generated
     * @ordered
     */
    protected String internationalPrefix = INTERNATIONAL_PREFIX_EDEFAULT;

    /**
     * This is true if the International Prefix attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean internationalPrefixESet;

    /**
     * The default value of the '{@link #getItuPhone() <em>Itu Phone</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getItuPhone()
     * @generated
     * @ordered
     */
    protected static final String ITU_PHONE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getItuPhone() <em>Itu Phone</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getItuPhone()
     * @generated
     * @ordered
     */
    protected String ituPhone = ITU_PHONE_EDEFAULT;

    /**
     * This is true if the Itu Phone attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ituPhoneESet;

    /**
     * The default value of the '{@link #getLocalNumber() <em>Local Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalNumber()
     * @generated
     * @ordered
     */
    protected static final String LOCAL_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocalNumber() <em>Local Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalNumber()
     * @generated
     * @ordered
     */
    protected String localNumber = LOCAL_NUMBER_EDEFAULT;

    /**
     * This is true if the Local Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean localNumberESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TelephoneNumberImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTelephoneNumber();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAreaCode( String newAreaCode ) {
        String oldAreaCode = areaCode;
        areaCode = newAreaCode;
        boolean oldAreaCodeESet = areaCodeESet;
        areaCodeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TELEPHONE_NUMBER__AREA_CODE, oldAreaCode, areaCode, !oldAreaCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAreaCode() {
        String oldAreaCode = areaCode;
        boolean oldAreaCodeESet = areaCodeESet;
        areaCode = AREA_CODE_EDEFAULT;
        areaCodeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TELEPHONE_NUMBER__AREA_CODE, oldAreaCode, AREA_CODE_EDEFAULT, oldAreaCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAreaCode() {
        return areaCodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCityCode() {
        return cityCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCityCode( String newCityCode ) {
        String oldCityCode = cityCode;
        cityCode = newCityCode;
        boolean oldCityCodeESet = cityCodeESet;
        cityCodeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TELEPHONE_NUMBER__CITY_CODE, oldCityCode, cityCode, !oldCityCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCityCode() {
        String oldCityCode = cityCode;
        boolean oldCityCodeESet = cityCodeESet;
        cityCode = CITY_CODE_EDEFAULT;
        cityCodeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TELEPHONE_NUMBER__CITY_CODE, oldCityCode, CITY_CODE_EDEFAULT, oldCityCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCityCode() {
        return cityCodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCountryCode( String newCountryCode ) {
        String oldCountryCode = countryCode;
        countryCode = newCountryCode;
        boolean oldCountryCodeESet = countryCodeESet;
        countryCodeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TELEPHONE_NUMBER__COUNTRY_CODE, oldCountryCode, countryCode, !oldCountryCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCountryCode() {
        String oldCountryCode = countryCode;
        boolean oldCountryCodeESet = countryCodeESet;
        countryCode = COUNTRY_CODE_EDEFAULT;
        countryCodeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TELEPHONE_NUMBER__COUNTRY_CODE,
                    oldCountryCode, COUNTRY_CODE_EDEFAULT, oldCountryCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCountryCode() {
        return countryCodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDialOut() {
        return dialOut;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDialOut( String newDialOut ) {
        String oldDialOut = dialOut;
        dialOut = newDialOut;
        boolean oldDialOutESet = dialOutESet;
        dialOutESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TELEPHONE_NUMBER__DIAL_OUT, oldDialOut, dialOut, !oldDialOutESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDialOut() {
        String oldDialOut = dialOut;
        boolean oldDialOutESet = dialOutESet;
        dialOut = DIAL_OUT_EDEFAULT;
        dialOutESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TELEPHONE_NUMBER__DIAL_OUT, oldDialOut, DIAL_OUT_EDEFAULT, oldDialOutESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDialOut() {
        return dialOutESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getExtension() {
        return extension;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExtension( String newExtension ) {
        String oldExtension = extension;
        extension = newExtension;
        boolean oldExtensionESet = extensionESet;
        extensionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TELEPHONE_NUMBER__EXTENSION, oldExtension, extension, !oldExtensionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetExtension() {
        String oldExtension = extension;
        boolean oldExtensionESet = extensionESet;
        extension = EXTENSION_EDEFAULT;
        extensionESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TELEPHONE_NUMBER__EXTENSION, oldExtension, EXTENSION_EDEFAULT, oldExtensionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetExtension() {
        return extensionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getInternationalPrefix() {
        return internationalPrefix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInternationalPrefix( String newInternationalPrefix ) {
        String oldInternationalPrefix = internationalPrefix;
        internationalPrefix = newInternationalPrefix;
        boolean oldInternationalPrefixESet = internationalPrefixESet;
        internationalPrefixESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TELEPHONE_NUMBER__INTERNATIONAL_PREFIX,
                    oldInternationalPrefix, internationalPrefix, !oldInternationalPrefixESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInternationalPrefix() {
        String oldInternationalPrefix = internationalPrefix;
        boolean oldInternationalPrefixESet = internationalPrefixESet;
        internationalPrefix = INTERNATIONAL_PREFIX_EDEFAULT;
        internationalPrefixESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TELEPHONE_NUMBER__INTERNATIONAL_PREFIX,
                    oldInternationalPrefix, INTERNATIONAL_PREFIX_EDEFAULT, oldInternationalPrefixESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInternationalPrefix() {
        return internationalPrefixESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getItuPhone() {
        return ituPhone;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setItuPhone( String newItuPhone ) {
        String oldItuPhone = ituPhone;
        ituPhone = newItuPhone;
        boolean oldItuPhoneESet = ituPhoneESet;
        ituPhoneESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TELEPHONE_NUMBER__ITU_PHONE, oldItuPhone, ituPhone, !oldItuPhoneESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetItuPhone() {
        String oldItuPhone = ituPhone;
        boolean oldItuPhoneESet = ituPhoneESet;
        ituPhone = ITU_PHONE_EDEFAULT;
        ituPhoneESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TELEPHONE_NUMBER__ITU_PHONE, oldItuPhone, ITU_PHONE_EDEFAULT, oldItuPhoneESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetItuPhone() {
        return ituPhoneESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLocalNumber() {
        return localNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLocalNumber( String newLocalNumber ) {
        String oldLocalNumber = localNumber;
        localNumber = newLocalNumber;
        boolean oldLocalNumberESet = localNumberESet;
        localNumberESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TELEPHONE_NUMBER__LOCAL_NUMBER, oldLocalNumber, localNumber, !oldLocalNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLocalNumber() {
        String oldLocalNumber = localNumber;
        boolean oldLocalNumberESet = localNumberESet;
        localNumber = LOCAL_NUMBER_EDEFAULT;
        localNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TELEPHONE_NUMBER__LOCAL_NUMBER,
                    oldLocalNumber, LOCAL_NUMBER_EDEFAULT, oldLocalNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLocalNumber() {
        return localNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.TELEPHONE_NUMBER__AREA_CODE:
            return getAreaCode();
        case CimPackage.TELEPHONE_NUMBER__CITY_CODE:
            return getCityCode();
        case CimPackage.TELEPHONE_NUMBER__COUNTRY_CODE:
            return getCountryCode();
        case CimPackage.TELEPHONE_NUMBER__DIAL_OUT:
            return getDialOut();
        case CimPackage.TELEPHONE_NUMBER__EXTENSION:
            return getExtension();
        case CimPackage.TELEPHONE_NUMBER__INTERNATIONAL_PREFIX:
            return getInternationalPrefix();
        case CimPackage.TELEPHONE_NUMBER__ITU_PHONE:
            return getItuPhone();
        case CimPackage.TELEPHONE_NUMBER__LOCAL_NUMBER:
            return getLocalNumber();
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
        case CimPackage.TELEPHONE_NUMBER__AREA_CODE:
            setAreaCode( ( String ) newValue );
            return;
        case CimPackage.TELEPHONE_NUMBER__CITY_CODE:
            setCityCode( ( String ) newValue );
            return;
        case CimPackage.TELEPHONE_NUMBER__COUNTRY_CODE:
            setCountryCode( ( String ) newValue );
            return;
        case CimPackage.TELEPHONE_NUMBER__DIAL_OUT:
            setDialOut( ( String ) newValue );
            return;
        case CimPackage.TELEPHONE_NUMBER__EXTENSION:
            setExtension( ( String ) newValue );
            return;
        case CimPackage.TELEPHONE_NUMBER__INTERNATIONAL_PREFIX:
            setInternationalPrefix( ( String ) newValue );
            return;
        case CimPackage.TELEPHONE_NUMBER__ITU_PHONE:
            setItuPhone( ( String ) newValue );
            return;
        case CimPackage.TELEPHONE_NUMBER__LOCAL_NUMBER:
            setLocalNumber( ( String ) newValue );
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
        case CimPackage.TELEPHONE_NUMBER__AREA_CODE:
            unsetAreaCode();
            return;
        case CimPackage.TELEPHONE_NUMBER__CITY_CODE:
            unsetCityCode();
            return;
        case CimPackage.TELEPHONE_NUMBER__COUNTRY_CODE:
            unsetCountryCode();
            return;
        case CimPackage.TELEPHONE_NUMBER__DIAL_OUT:
            unsetDialOut();
            return;
        case CimPackage.TELEPHONE_NUMBER__EXTENSION:
            unsetExtension();
            return;
        case CimPackage.TELEPHONE_NUMBER__INTERNATIONAL_PREFIX:
            unsetInternationalPrefix();
            return;
        case CimPackage.TELEPHONE_NUMBER__ITU_PHONE:
            unsetItuPhone();
            return;
        case CimPackage.TELEPHONE_NUMBER__LOCAL_NUMBER:
            unsetLocalNumber();
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
        case CimPackage.TELEPHONE_NUMBER__AREA_CODE:
            return isSetAreaCode();
        case CimPackage.TELEPHONE_NUMBER__CITY_CODE:
            return isSetCityCode();
        case CimPackage.TELEPHONE_NUMBER__COUNTRY_CODE:
            return isSetCountryCode();
        case CimPackage.TELEPHONE_NUMBER__DIAL_OUT:
            return isSetDialOut();
        case CimPackage.TELEPHONE_NUMBER__EXTENSION:
            return isSetExtension();
        case CimPackage.TELEPHONE_NUMBER__INTERNATIONAL_PREFIX:
            return isSetInternationalPrefix();
        case CimPackage.TELEPHONE_NUMBER__ITU_PHONE:
            return isSetItuPhone();
        case CimPackage.TELEPHONE_NUMBER__LOCAL_NUMBER:
            return isSetLocalNumber();
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

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (areaCode: " );
        if( areaCodeESet )
            result.append( areaCode );
        else
            result.append( "<unset>" );
        result.append( ", cityCode: " );
        if( cityCodeESet )
            result.append( cityCode );
        else
            result.append( "<unset>" );
        result.append( ", countryCode: " );
        if( countryCodeESet )
            result.append( countryCode );
        else
            result.append( "<unset>" );
        result.append( ", dialOut: " );
        if( dialOutESet )
            result.append( dialOut );
        else
            result.append( "<unset>" );
        result.append( ", extension: " );
        if( extensionESet )
            result.append( extension );
        else
            result.append( "<unset>" );
        result.append( ", internationalPrefix: " );
        if( internationalPrefixESet )
            result.append( internationalPrefix );
        else
            result.append( "<unset>" );
        result.append( ", ituPhone: " );
        if( ituPhoneESet )
            result.append( ituPhone );
        else
            result.append( "<unset>" );
        result.append( ", localNumber: " );
        if( localNumberESet )
            result.append( localNumber );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TelephoneNumberImpl
