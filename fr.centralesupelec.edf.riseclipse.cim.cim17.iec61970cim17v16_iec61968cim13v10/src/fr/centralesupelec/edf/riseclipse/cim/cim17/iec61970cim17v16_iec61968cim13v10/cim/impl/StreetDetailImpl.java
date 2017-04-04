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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Street Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StreetDetailImpl#getAddressGeneral <em>Address General</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StreetDetailImpl#getAddressGeneral2 <em>Address General2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StreetDetailImpl#getAddressGeneral3 <em>Address General3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StreetDetailImpl#getBuildingName <em>Building Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StreetDetailImpl#getCode <em>Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StreetDetailImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StreetDetailImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StreetDetailImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StreetDetailImpl#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StreetDetailImpl#getSuiteNumber <em>Suite Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StreetDetailImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StreetDetailImpl#getWithinTownLimits <em>Within Town Limits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StreetDetailImpl extends MinimalEObjectImpl.Container implements StreetDetail {
    /**
     * The default value of the '{@link #getAddressGeneral() <em>Address General</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddressGeneral()
     * @generated
     * @ordered
     */
    protected static final String ADDRESS_GENERAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAddressGeneral() <em>Address General</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddressGeneral()
     * @generated
     * @ordered
     */
    protected String addressGeneral = ADDRESS_GENERAL_EDEFAULT;

    /**
     * This is true if the Address General attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean addressGeneralESet;

    /**
     * The default value of the '{@link #getAddressGeneral2() <em>Address General2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddressGeneral2()
     * @generated
     * @ordered
     */
    protected static final String ADDRESS_GENERAL2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAddressGeneral2() <em>Address General2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddressGeneral2()
     * @generated
     * @ordered
     */
    protected String addressGeneral2 = ADDRESS_GENERAL2_EDEFAULT;

    /**
     * This is true if the Address General2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean addressGeneral2ESet;

    /**
     * The default value of the '{@link #getAddressGeneral3() <em>Address General3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddressGeneral3()
     * @generated
     * @ordered
     */
    protected static final String ADDRESS_GENERAL3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAddressGeneral3() <em>Address General3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddressGeneral3()
     * @generated
     * @ordered
     */
    protected String addressGeneral3 = ADDRESS_GENERAL3_EDEFAULT;

    /**
     * This is true if the Address General3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean addressGeneral3ESet;

    /**
     * The default value of the '{@link #getBuildingName() <em>Building Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBuildingName()
     * @generated
     * @ordered
     */
    protected static final String BUILDING_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBuildingName() <em>Building Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBuildingName()
     * @generated
     * @ordered
     */
    protected String buildingName = BUILDING_NAME_EDEFAULT;

    /**
     * This is true if the Building Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean buildingNameESet;

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
     * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumber()
     * @generated
     * @ordered
     */
    protected static final String NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumber()
     * @generated
     * @ordered
     */
    protected String number = NUMBER_EDEFAULT;

    /**
     * This is true if the Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean numberESet;

    /**
     * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrefix()
     * @generated
     * @ordered
     */
    protected static final String PREFIX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrefix()
     * @generated
     * @ordered
     */
    protected String prefix = PREFIX_EDEFAULT;

    /**
     * This is true if the Prefix attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean prefixESet;

    /**
     * The default value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuffix()
     * @generated
     * @ordered
     */
    protected static final String SUFFIX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuffix()
     * @generated
     * @ordered
     */
    protected String suffix = SUFFIX_EDEFAULT;

    /**
     * This is true if the Suffix attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean suffixESet;

    /**
     * The default value of the '{@link #getSuiteNumber() <em>Suite Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuiteNumber()
     * @generated
     * @ordered
     */
    protected static final String SUITE_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSuiteNumber() <em>Suite Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuiteNumber()
     * @generated
     * @ordered
     */
    protected String suiteNumber = SUITE_NUMBER_EDEFAULT;

    /**
     * This is true if the Suite Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean suiteNumberESet;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * The default value of the '{@link #getWithinTownLimits() <em>Within Town Limits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWithinTownLimits()
     * @generated
     * @ordered
     */
    protected static final Boolean WITHIN_TOWN_LIMITS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWithinTownLimits() <em>Within Town Limits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWithinTownLimits()
     * @generated
     * @ordered
     */
    protected Boolean withinTownLimits = WITHIN_TOWN_LIMITS_EDEFAULT;

    /**
     * This is true if the Within Town Limits attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean withinTownLimitsESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StreetDetailImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getStreetDetail();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAddressGeneral() {
        return addressGeneral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAddressGeneral( String newAddressGeneral ) {
        String oldAddressGeneral = addressGeneral;
        addressGeneral = newAddressGeneral;
        boolean oldAddressGeneralESet = addressGeneralESet;
        addressGeneralESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STREET_DETAIL__ADDRESS_GENERAL,
                    oldAddressGeneral, addressGeneral, !oldAddressGeneralESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAddressGeneral() {
        String oldAddressGeneral = addressGeneral;
        boolean oldAddressGeneralESet = addressGeneralESet;
        addressGeneral = ADDRESS_GENERAL_EDEFAULT;
        addressGeneralESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STREET_DETAIL__ADDRESS_GENERAL,
                    oldAddressGeneral, ADDRESS_GENERAL_EDEFAULT, oldAddressGeneralESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAddressGeneral() {
        return addressGeneralESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAddressGeneral2() {
        return addressGeneral2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAddressGeneral2( String newAddressGeneral2 ) {
        String oldAddressGeneral2 = addressGeneral2;
        addressGeneral2 = newAddressGeneral2;
        boolean oldAddressGeneral2ESet = addressGeneral2ESet;
        addressGeneral2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STREET_DETAIL__ADDRESS_GENERAL2,
                    oldAddressGeneral2, addressGeneral2, !oldAddressGeneral2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAddressGeneral2() {
        String oldAddressGeneral2 = addressGeneral2;
        boolean oldAddressGeneral2ESet = addressGeneral2ESet;
        addressGeneral2 = ADDRESS_GENERAL2_EDEFAULT;
        addressGeneral2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STREET_DETAIL__ADDRESS_GENERAL2,
                    oldAddressGeneral2, ADDRESS_GENERAL2_EDEFAULT, oldAddressGeneral2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAddressGeneral2() {
        return addressGeneral2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAddressGeneral3() {
        return addressGeneral3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAddressGeneral3( String newAddressGeneral3 ) {
        String oldAddressGeneral3 = addressGeneral3;
        addressGeneral3 = newAddressGeneral3;
        boolean oldAddressGeneral3ESet = addressGeneral3ESet;
        addressGeneral3ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STREET_DETAIL__ADDRESS_GENERAL3,
                    oldAddressGeneral3, addressGeneral3, !oldAddressGeneral3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAddressGeneral3() {
        String oldAddressGeneral3 = addressGeneral3;
        boolean oldAddressGeneral3ESet = addressGeneral3ESet;
        addressGeneral3 = ADDRESS_GENERAL3_EDEFAULT;
        addressGeneral3ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STREET_DETAIL__ADDRESS_GENERAL3,
                    oldAddressGeneral3, ADDRESS_GENERAL3_EDEFAULT, oldAddressGeneral3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAddressGeneral3() {
        return addressGeneral3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBuildingName( String newBuildingName ) {
        String oldBuildingName = buildingName;
        buildingName = newBuildingName;
        boolean oldBuildingNameESet = buildingNameESet;
        buildingNameESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STREET_DETAIL__BUILDING_NAME, oldBuildingName, buildingName, !oldBuildingNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBuildingName() {
        String oldBuildingName = buildingName;
        boolean oldBuildingNameESet = buildingNameESet;
        buildingName = BUILDING_NAME_EDEFAULT;
        buildingNameESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STREET_DETAIL__BUILDING_NAME,
                    oldBuildingName, BUILDING_NAME_EDEFAULT, oldBuildingNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBuildingName() {
        return buildingNameESet;
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
                CimPackage.STREET_DETAIL__CODE, oldCode, code, !oldCodeESet ) );
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
                CimPackage.STREET_DETAIL__CODE, oldCode, CODE_EDEFAULT, oldCodeESet ) );
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
                CimPackage.STREET_DETAIL__NAME, oldName, name, !oldNameESet ) );
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
                CimPackage.STREET_DETAIL__NAME, oldName, NAME_EDEFAULT, oldNameESet ) );
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
    public String getNumber() {
        return number;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNumber( String newNumber ) {
        String oldNumber = number;
        number = newNumber;
        boolean oldNumberESet = numberESet;
        numberESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STREET_DETAIL__NUMBER, oldNumber, number, !oldNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNumber() {
        String oldNumber = number;
        boolean oldNumberESet = numberESet;
        number = NUMBER_EDEFAULT;
        numberESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.STREET_DETAIL__NUMBER, oldNumber, NUMBER_EDEFAULT, oldNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNumber() {
        return numberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPrefix() {
        return prefix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPrefix( String newPrefix ) {
        String oldPrefix = prefix;
        prefix = newPrefix;
        boolean oldPrefixESet = prefixESet;
        prefixESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STREET_DETAIL__PREFIX, oldPrefix, prefix, !oldPrefixESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPrefix() {
        String oldPrefix = prefix;
        boolean oldPrefixESet = prefixESet;
        prefix = PREFIX_EDEFAULT;
        prefixESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.STREET_DETAIL__PREFIX, oldPrefix, PREFIX_EDEFAULT, oldPrefixESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPrefix() {
        return prefixESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSuffix() {
        return suffix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSuffix( String newSuffix ) {
        String oldSuffix = suffix;
        suffix = newSuffix;
        boolean oldSuffixESet = suffixESet;
        suffixESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STREET_DETAIL__SUFFIX, oldSuffix, suffix, !oldSuffixESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSuffix() {
        String oldSuffix = suffix;
        boolean oldSuffixESet = suffixESet;
        suffix = SUFFIX_EDEFAULT;
        suffixESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.STREET_DETAIL__SUFFIX, oldSuffix, SUFFIX_EDEFAULT, oldSuffixESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSuffix() {
        return suffixESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSuiteNumber() {
        return suiteNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSuiteNumber( String newSuiteNumber ) {
        String oldSuiteNumber = suiteNumber;
        suiteNumber = newSuiteNumber;
        boolean oldSuiteNumberESet = suiteNumberESet;
        suiteNumberESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STREET_DETAIL__SUITE_NUMBER, oldSuiteNumber, suiteNumber, !oldSuiteNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSuiteNumber() {
        String oldSuiteNumber = suiteNumber;
        boolean oldSuiteNumberESet = suiteNumberESet;
        suiteNumber = SUITE_NUMBER_EDEFAULT;
        suiteNumberESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.STREET_DETAIL__SUITE_NUMBER, oldSuiteNumber, SUITE_NUMBER_EDEFAULT, oldSuiteNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSuiteNumber() {
        return suiteNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType( String newType ) {
        String oldType = type;
        type = newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STREET_DETAIL__TYPE, oldType, type, !oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetType() {
        String oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.STREET_DETAIL__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetType() {
        return typeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getWithinTownLimits() {
        return withinTownLimits;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWithinTownLimits( Boolean newWithinTownLimits ) {
        Boolean oldWithinTownLimits = withinTownLimits;
        withinTownLimits = newWithinTownLimits;
        boolean oldWithinTownLimitsESet = withinTownLimitsESet;
        withinTownLimitsESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STREET_DETAIL__WITHIN_TOWN_LIMITS,
                    oldWithinTownLimits, withinTownLimits, !oldWithinTownLimitsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWithinTownLimits() {
        Boolean oldWithinTownLimits = withinTownLimits;
        boolean oldWithinTownLimitsESet = withinTownLimitsESet;
        withinTownLimits = WITHIN_TOWN_LIMITS_EDEFAULT;
        withinTownLimitsESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STREET_DETAIL__WITHIN_TOWN_LIMITS,
                    oldWithinTownLimits, WITHIN_TOWN_LIMITS_EDEFAULT, oldWithinTownLimitsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWithinTownLimits() {
        return withinTownLimitsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.STREET_DETAIL__ADDRESS_GENERAL:
            return getAddressGeneral();
        case CimPackage.STREET_DETAIL__ADDRESS_GENERAL2:
            return getAddressGeneral2();
        case CimPackage.STREET_DETAIL__ADDRESS_GENERAL3:
            return getAddressGeneral3();
        case CimPackage.STREET_DETAIL__BUILDING_NAME:
            return getBuildingName();
        case CimPackage.STREET_DETAIL__CODE:
            return getCode();
        case CimPackage.STREET_DETAIL__NAME:
            return getName();
        case CimPackage.STREET_DETAIL__NUMBER:
            return getNumber();
        case CimPackage.STREET_DETAIL__PREFIX:
            return getPrefix();
        case CimPackage.STREET_DETAIL__SUFFIX:
            return getSuffix();
        case CimPackage.STREET_DETAIL__SUITE_NUMBER:
            return getSuiteNumber();
        case CimPackage.STREET_DETAIL__TYPE:
            return getType();
        case CimPackage.STREET_DETAIL__WITHIN_TOWN_LIMITS:
            return getWithinTownLimits();
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
        case CimPackage.STREET_DETAIL__ADDRESS_GENERAL:
            setAddressGeneral( ( String ) newValue );
            return;
        case CimPackage.STREET_DETAIL__ADDRESS_GENERAL2:
            setAddressGeneral2( ( String ) newValue );
            return;
        case CimPackage.STREET_DETAIL__ADDRESS_GENERAL3:
            setAddressGeneral3( ( String ) newValue );
            return;
        case CimPackage.STREET_DETAIL__BUILDING_NAME:
            setBuildingName( ( String ) newValue );
            return;
        case CimPackage.STREET_DETAIL__CODE:
            setCode( ( String ) newValue );
            return;
        case CimPackage.STREET_DETAIL__NAME:
            setName( ( String ) newValue );
            return;
        case CimPackage.STREET_DETAIL__NUMBER:
            setNumber( ( String ) newValue );
            return;
        case CimPackage.STREET_DETAIL__PREFIX:
            setPrefix( ( String ) newValue );
            return;
        case CimPackage.STREET_DETAIL__SUFFIX:
            setSuffix( ( String ) newValue );
            return;
        case CimPackage.STREET_DETAIL__SUITE_NUMBER:
            setSuiteNumber( ( String ) newValue );
            return;
        case CimPackage.STREET_DETAIL__TYPE:
            setType( ( String ) newValue );
            return;
        case CimPackage.STREET_DETAIL__WITHIN_TOWN_LIMITS:
            setWithinTownLimits( ( Boolean ) newValue );
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
        case CimPackage.STREET_DETAIL__ADDRESS_GENERAL:
            unsetAddressGeneral();
            return;
        case CimPackage.STREET_DETAIL__ADDRESS_GENERAL2:
            unsetAddressGeneral2();
            return;
        case CimPackage.STREET_DETAIL__ADDRESS_GENERAL3:
            unsetAddressGeneral3();
            return;
        case CimPackage.STREET_DETAIL__BUILDING_NAME:
            unsetBuildingName();
            return;
        case CimPackage.STREET_DETAIL__CODE:
            unsetCode();
            return;
        case CimPackage.STREET_DETAIL__NAME:
            unsetName();
            return;
        case CimPackage.STREET_DETAIL__NUMBER:
            unsetNumber();
            return;
        case CimPackage.STREET_DETAIL__PREFIX:
            unsetPrefix();
            return;
        case CimPackage.STREET_DETAIL__SUFFIX:
            unsetSuffix();
            return;
        case CimPackage.STREET_DETAIL__SUITE_NUMBER:
            unsetSuiteNumber();
            return;
        case CimPackage.STREET_DETAIL__TYPE:
            unsetType();
            return;
        case CimPackage.STREET_DETAIL__WITHIN_TOWN_LIMITS:
            unsetWithinTownLimits();
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
        case CimPackage.STREET_DETAIL__ADDRESS_GENERAL:
            return isSetAddressGeneral();
        case CimPackage.STREET_DETAIL__ADDRESS_GENERAL2:
            return isSetAddressGeneral2();
        case CimPackage.STREET_DETAIL__ADDRESS_GENERAL3:
            return isSetAddressGeneral3();
        case CimPackage.STREET_DETAIL__BUILDING_NAME:
            return isSetBuildingName();
        case CimPackage.STREET_DETAIL__CODE:
            return isSetCode();
        case CimPackage.STREET_DETAIL__NAME:
            return isSetName();
        case CimPackage.STREET_DETAIL__NUMBER:
            return isSetNumber();
        case CimPackage.STREET_DETAIL__PREFIX:
            return isSetPrefix();
        case CimPackage.STREET_DETAIL__SUFFIX:
            return isSetSuffix();
        case CimPackage.STREET_DETAIL__SUITE_NUMBER:
            return isSetSuiteNumber();
        case CimPackage.STREET_DETAIL__TYPE:
            return isSetType();
        case CimPackage.STREET_DETAIL__WITHIN_TOWN_LIMITS:
            return isSetWithinTownLimits();
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
        result.append( " (addressGeneral: " );
        if( addressGeneralESet )
            result.append( addressGeneral );
        else
            result.append( "<unset>" );
        result.append( ", addressGeneral2: " );
        if( addressGeneral2ESet )
            result.append( addressGeneral2 );
        else
            result.append( "<unset>" );
        result.append( ", addressGeneral3: " );
        if( addressGeneral3ESet )
            result.append( addressGeneral3 );
        else
            result.append( "<unset>" );
        result.append( ", buildingName: " );
        if( buildingNameESet )
            result.append( buildingName );
        else
            result.append( "<unset>" );
        result.append( ", code: " );
        if( codeESet )
            result.append( code );
        else
            result.append( "<unset>" );
        result.append( ", name: " );
        if( nameESet )
            result.append( name );
        else
            result.append( "<unset>" );
        result.append( ", number: " );
        if( numberESet )
            result.append( number );
        else
            result.append( "<unset>" );
        result.append( ", prefix: " );
        if( prefixESet )
            result.append( prefix );
        else
            result.append( "<unset>" );
        result.append( ", suffix: " );
        if( suffixESet )
            result.append( suffix );
        else
            result.append( "<unset>" );
        result.append( ", suiteNumber: " );
        if( suiteNumberESet )
            result.append( suiteNumber );
        else
            result.append( "<unset>" );
        result.append( ", type: " );
        if( typeESet )
            result.append( type );
        else
            result.append( "<unset>" );
        result.append( ", withinTownLimits: " );
        if( withinTownLimitsESet )
            result.append( withinTownLimits );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //StreetDetailImpl
