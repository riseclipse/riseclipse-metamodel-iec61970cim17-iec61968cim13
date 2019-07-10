/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TownDetail;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Town Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TownDetailImpl#getCode <em>Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TownDetailImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TownDetailImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TownDetailImpl#getSection <em>Section</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TownDetailImpl#getStateOrProvince <em>State Or Province</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TownDetailImpl extends MinimalEObjectImpl.Container implements TownDetail {
    /**
     * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCode()
     * @generated
     * @ordered
     */
    protected static final String CODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCode()
     * @generated
     * @ordered
     */
    protected String code = CODE_EDEFAULT;

    /**
     * This is true if the Code attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean codeESet;

    /**
     * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCountry()
     * @generated
     * @ordered
     */
    protected static final String COUNTRY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCountry()
     * @generated
     * @ordered
     */
    protected String country = COUNTRY_EDEFAULT;

    /**
     * This is true if the Country attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean countryESet;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * This is true if the Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nameESet;

    /**
     * The default value of the '{@link #getSection() <em>Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSection()
     * @generated
     * @ordered
     */
    protected static final String SECTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSection() <em>Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSection()
     * @generated
     * @ordered
     */
    protected String section = SECTION_EDEFAULT;

    /**
     * This is true if the Section attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sectionESet;

    /**
     * The default value of the '{@link #getStateOrProvince() <em>State Or Province</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStateOrProvince()
     * @generated
     * @ordered
     */
    protected static final String STATE_OR_PROVINCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStateOrProvince() <em>State Or Province</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStateOrProvince()
     * @generated
     * @ordered
     */
    protected String stateOrProvince = STATE_OR_PROVINCE_EDEFAULT;

    /**
     * This is true if the State Or Province attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean stateOrProvinceESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TownDetailImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTownDetail();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCode() {
        return code;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCode( String newCode ) {
        String oldCode = code;
        code = newCode;
        boolean oldCodeESet = codeESet;
        codeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TOWN_DETAIL__CODE, oldCode, code, !oldCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCode() {
        String oldCode = code;
        boolean oldCodeESet = codeESet;
        code = CODE_EDEFAULT;
        codeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TOWN_DETAIL__CODE, oldCode, CODE_EDEFAULT, oldCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCode() {
        return codeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCountry() {
        return country;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCountry( String newCountry ) {
        String oldCountry = country;
        country = newCountry;
        boolean oldCountryESet = countryESet;
        countryESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TOWN_DETAIL__COUNTRY, oldCountry, country, !oldCountryESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCountry() {
        String oldCountry = country;
        boolean oldCountryESet = countryESet;
        country = COUNTRY_EDEFAULT;
        countryESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TOWN_DETAIL__COUNTRY, oldCountry, COUNTRY_EDEFAULT, oldCountryESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCountry() {
        return countryESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName( String newName ) {
        String oldName = name;
        name = newName;
        boolean oldNameESet = nameESet;
        nameESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TOWN_DETAIL__NAME, oldName, name, !oldNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetName() {
        String oldName = name;
        boolean oldNameESet = nameESet;
        name = NAME_EDEFAULT;
        nameESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TOWN_DETAIL__NAME, oldName, NAME_EDEFAULT, oldNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetName() {
        return nameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSection() {
        return section;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSection( String newSection ) {
        String oldSection = section;
        section = newSection;
        boolean oldSectionESet = sectionESet;
        sectionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TOWN_DETAIL__SECTION, oldSection, section, !oldSectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSection() {
        String oldSection = section;
        boolean oldSectionESet = sectionESet;
        section = SECTION_EDEFAULT;
        sectionESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TOWN_DETAIL__SECTION, oldSection, SECTION_EDEFAULT, oldSectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSection() {
        return sectionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getStateOrProvince() {
        return stateOrProvince;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStateOrProvince( String newStateOrProvince ) {
        String oldStateOrProvince = stateOrProvince;
        stateOrProvince = newStateOrProvince;
        boolean oldStateOrProvinceESet = stateOrProvinceESet;
        stateOrProvinceESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TOWN_DETAIL__STATE_OR_PROVINCE,
                    oldStateOrProvince, stateOrProvince, !oldStateOrProvinceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStateOrProvince() {
        String oldStateOrProvince = stateOrProvince;
        boolean oldStateOrProvinceESet = stateOrProvinceESet;
        stateOrProvince = STATE_OR_PROVINCE_EDEFAULT;
        stateOrProvinceESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TOWN_DETAIL__STATE_OR_PROVINCE,
                    oldStateOrProvince, STATE_OR_PROVINCE_EDEFAULT, oldStateOrProvinceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStateOrProvince() {
        return stateOrProvinceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.TOWN_DETAIL__CODE:
            return getCode();
        case CimPackage.TOWN_DETAIL__COUNTRY:
            return getCountry();
        case CimPackage.TOWN_DETAIL__NAME:
            return getName();
        case CimPackage.TOWN_DETAIL__SECTION:
            return getSection();
        case CimPackage.TOWN_DETAIL__STATE_OR_PROVINCE:
            return getStateOrProvince();
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
        case CimPackage.TOWN_DETAIL__CODE:
            setCode( ( String ) newValue );
            return;
        case CimPackage.TOWN_DETAIL__COUNTRY:
            setCountry( ( String ) newValue );
            return;
        case CimPackage.TOWN_DETAIL__NAME:
            setName( ( String ) newValue );
            return;
        case CimPackage.TOWN_DETAIL__SECTION:
            setSection( ( String ) newValue );
            return;
        case CimPackage.TOWN_DETAIL__STATE_OR_PROVINCE:
            setStateOrProvince( ( String ) newValue );
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
        case CimPackage.TOWN_DETAIL__CODE:
            unsetCode();
            return;
        case CimPackage.TOWN_DETAIL__COUNTRY:
            unsetCountry();
            return;
        case CimPackage.TOWN_DETAIL__NAME:
            unsetName();
            return;
        case CimPackage.TOWN_DETAIL__SECTION:
            unsetSection();
            return;
        case CimPackage.TOWN_DETAIL__STATE_OR_PROVINCE:
            unsetStateOrProvince();
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
        case CimPackage.TOWN_DETAIL__CODE:
            return isSetCode();
        case CimPackage.TOWN_DETAIL__COUNTRY:
            return isSetCountry();
        case CimPackage.TOWN_DETAIL__NAME:
            return isSetName();
        case CimPackage.TOWN_DETAIL__SECTION:
            return isSetSection();
        case CimPackage.TOWN_DETAIL__STATE_OR_PROVINCE:
            return isSetStateOrProvince();
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
        result.append( " (code: " );
        if( codeESet )
            result.append( code );
        else
            result.append( "<unset>" );
        result.append( ", country: " );
        if( countryESet )
            result.append( country );
        else
            result.append( "<unset>" );
        result.append( ", name: " );
        if( nameESet )
            result.append( name );
        else
            result.append( "<unset>" );
        result.append( ", section: " );
        if( sectionESet )
            result.append( section );
        else
            result.append( "<unset>" );
        result.append( ", stateOrProvince: " );
        if( stateOrProvinceESet )
            result.append( stateOrProvince );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TownDetailImpl
