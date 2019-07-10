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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ICCP Virtual Control Center</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ICCPVirtualControlCenterImpl#getCalling <em>Calling</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ICCPVirtualControlCenterImpl#getClientAndServer <em>Client And Server</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ICCPVirtualControlCenterImpl#getMinimumUpdateInterval <em>Minimum Update Interval</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ICCPVirtualControlCenterImpl#getNameOfLocalICC <em>Name Of Local ICC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ICCPVirtualControlCenterImpl#getSupportForBlock1 <em>Support For Block1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ICCPVirtualControlCenterImpl#getSupportForBlock2 <em>Support For Block2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ICCPVirtualControlCenterImpl#getSupportForBlock3 <em>Support For Block3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ICCPVirtualControlCenterImpl#getSupportForBlock4 <em>Support For Block4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ICCPVirtualControlCenterImpl#getSupportForBlock5 <em>Support For Block5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ICCPVirtualControlCenterImpl#getSupportForDepriciatedBlock8 <em>Support For Depriciated Block8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ICCPVirtualControlCenterImpl#getTransportSecurityRequirement <em>Transport Security Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ICCPVirtualControlCenterImpl extends BilateralExchangeActorImpl implements ICCPVirtualControlCenter {
    /**
     * The default value of the '{@link #getCalling() <em>Calling</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCalling()
     * @generated
     * @ordered
     */
    protected static final Boolean CALLING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCalling() <em>Calling</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCalling()
     * @generated
     * @ordered
     */
    protected Boolean calling = CALLING_EDEFAULT;

    /**
     * This is true if the Calling attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean callingESet;

    /**
     * The default value of the '{@link #getClientAndServer() <em>Client And Server</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClientAndServer()
     * @generated
     * @ordered
     */
    protected static final Boolean CLIENT_AND_SERVER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getClientAndServer() <em>Client And Server</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClientAndServer()
     * @generated
     * @ordered
     */
    protected Boolean clientAndServer = CLIENT_AND_SERVER_EDEFAULT;

    /**
     * This is true if the Client And Server attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean clientAndServerESet;

    /**
     * The default value of the '{@link #getMinimumUpdateInterval() <em>Minimum Update Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinimumUpdateInterval()
     * @generated
     * @ordered
     */
    protected static final Integer MINIMUM_UPDATE_INTERVAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinimumUpdateInterval() <em>Minimum Update Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinimumUpdateInterval()
     * @generated
     * @ordered
     */
    protected Integer minimumUpdateInterval = MINIMUM_UPDATE_INTERVAL_EDEFAULT;

    /**
     * This is true if the Minimum Update Interval attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minimumUpdateIntervalESet;

    /**
     * The default value of the '{@link #getNameOfLocalICC() <em>Name Of Local ICC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNameOfLocalICC()
     * @generated
     * @ordered
     */
    protected static final String NAME_OF_LOCAL_ICC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNameOfLocalICC() <em>Name Of Local ICC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNameOfLocalICC()
     * @generated
     * @ordered
     */
    protected String nameOfLocalICC = NAME_OF_LOCAL_ICC_EDEFAULT;

    /**
     * This is true if the Name Of Local ICC attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nameOfLocalICCESet;

    /**
     * The default value of the '{@link #getSupportForBlock1() <em>Support For Block1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSupportForBlock1()
     * @generated
     * @ordered
     */
    protected static final Boolean SUPPORT_FOR_BLOCK1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSupportForBlock1() <em>Support For Block1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSupportForBlock1()
     * @generated
     * @ordered
     */
    protected Boolean supportForBlock1 = SUPPORT_FOR_BLOCK1_EDEFAULT;

    /**
     * This is true if the Support For Block1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean supportForBlock1ESet;

    /**
     * The default value of the '{@link #getSupportForBlock2() <em>Support For Block2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSupportForBlock2()
     * @generated
     * @ordered
     */
    protected static final Boolean SUPPORT_FOR_BLOCK2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSupportForBlock2() <em>Support For Block2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSupportForBlock2()
     * @generated
     * @ordered
     */
    protected Boolean supportForBlock2 = SUPPORT_FOR_BLOCK2_EDEFAULT;

    /**
     * This is true if the Support For Block2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean supportForBlock2ESet;

    /**
     * The default value of the '{@link #getSupportForBlock3() <em>Support For Block3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSupportForBlock3()
     * @generated
     * @ordered
     */
    protected static final Boolean SUPPORT_FOR_BLOCK3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSupportForBlock3() <em>Support For Block3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSupportForBlock3()
     * @generated
     * @ordered
     */
    protected Boolean supportForBlock3 = SUPPORT_FOR_BLOCK3_EDEFAULT;

    /**
     * This is true if the Support For Block3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean supportForBlock3ESet;

    /**
     * The default value of the '{@link #getSupportForBlock4() <em>Support For Block4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSupportForBlock4()
     * @generated
     * @ordered
     */
    protected static final Boolean SUPPORT_FOR_BLOCK4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSupportForBlock4() <em>Support For Block4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSupportForBlock4()
     * @generated
     * @ordered
     */
    protected Boolean supportForBlock4 = SUPPORT_FOR_BLOCK4_EDEFAULT;

    /**
     * This is true if the Support For Block4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean supportForBlock4ESet;

    /**
     * The default value of the '{@link #getSupportForBlock5() <em>Support For Block5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSupportForBlock5()
     * @generated
     * @ordered
     */
    protected static final Boolean SUPPORT_FOR_BLOCK5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSupportForBlock5() <em>Support For Block5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSupportForBlock5()
     * @generated
     * @ordered
     */
    protected Boolean supportForBlock5 = SUPPORT_FOR_BLOCK5_EDEFAULT;

    /**
     * This is true if the Support For Block5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean supportForBlock5ESet;

    /**
     * The default value of the '{@link #getSupportForDepriciatedBlock8() <em>Support For Depriciated Block8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSupportForDepriciatedBlock8()
     * @generated
     * @ordered
     */
    protected static final Boolean SUPPORT_FOR_DEPRICIATED_BLOCK8_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSupportForDepriciatedBlock8() <em>Support For Depriciated Block8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSupportForDepriciatedBlock8()
     * @generated
     * @ordered
     */
    protected Boolean supportForDepriciatedBlock8 = SUPPORT_FOR_DEPRICIATED_BLOCK8_EDEFAULT;

    /**
     * This is true if the Support For Depriciated Block8 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean supportForDepriciatedBlock8ESet;

    /**
     * The default value of the '{@link #getTransportSecurityRequirement() <em>Transport Security Requirement</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransportSecurityRequirement()
     * @generated
     * @ordered
     */
    protected static final Boolean TRANSPORT_SECURITY_REQUIREMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTransportSecurityRequirement() <em>Transport Security Requirement</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransportSecurityRequirement()
     * @generated
     * @ordered
     */
    protected Boolean transportSecurityRequirement = TRANSPORT_SECURITY_REQUIREMENT_EDEFAULT;

    /**
     * This is true if the Transport Security Requirement attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean transportSecurityRequirementESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ICCPVirtualControlCenterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getICCPVirtualControlCenter();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getCalling() {
        return calling;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCalling( Boolean newCalling ) {
        Boolean oldCalling = calling;
        calling = newCalling;
        boolean oldCallingESet = callingESet;
        callingESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__CALLING, oldCalling, calling, !oldCallingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCalling() {
        Boolean oldCalling = calling;
        boolean oldCallingESet = callingESet;
        calling = CALLING_EDEFAULT;
        callingESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__CALLING, oldCalling, CALLING_EDEFAULT, oldCallingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCalling() {
        return callingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getClientAndServer() {
        return clientAndServer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setClientAndServer( Boolean newClientAndServer ) {
        Boolean oldClientAndServer = clientAndServer;
        clientAndServer = newClientAndServer;
        boolean oldClientAndServerESet = clientAndServerESet;
        clientAndServerESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__CLIENT_AND_SERVER, oldClientAndServer, clientAndServer,
                !oldClientAndServerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetClientAndServer() {
        Boolean oldClientAndServer = clientAndServer;
        boolean oldClientAndServerESet = clientAndServerESet;
        clientAndServer = CLIENT_AND_SERVER_EDEFAULT;
        clientAndServerESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__CLIENT_AND_SERVER, oldClientAndServer,
                CLIENT_AND_SERVER_EDEFAULT, oldClientAndServerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetClientAndServer() {
        return clientAndServerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getMinimumUpdateInterval() {
        return minimumUpdateInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinimumUpdateInterval( Integer newMinimumUpdateInterval ) {
        Integer oldMinimumUpdateInterval = minimumUpdateInterval;
        minimumUpdateInterval = newMinimumUpdateInterval;
        boolean oldMinimumUpdateIntervalESet = minimumUpdateIntervalESet;
        minimumUpdateIntervalESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__MINIMUM_UPDATE_INTERVAL, oldMinimumUpdateInterval,
                minimumUpdateInterval, !oldMinimumUpdateIntervalESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinimumUpdateInterval() {
        Integer oldMinimumUpdateInterval = minimumUpdateInterval;
        boolean oldMinimumUpdateIntervalESet = minimumUpdateIntervalESet;
        minimumUpdateInterval = MINIMUM_UPDATE_INTERVAL_EDEFAULT;
        minimumUpdateIntervalESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__MINIMUM_UPDATE_INTERVAL, oldMinimumUpdateInterval,
                MINIMUM_UPDATE_INTERVAL_EDEFAULT, oldMinimumUpdateIntervalESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinimumUpdateInterval() {
        return minimumUpdateIntervalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getNameOfLocalICC() {
        return nameOfLocalICC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNameOfLocalICC( String newNameOfLocalICC ) {
        String oldNameOfLocalICC = nameOfLocalICC;
        nameOfLocalICC = newNameOfLocalICC;
        boolean oldNameOfLocalICCESet = nameOfLocalICCESet;
        nameOfLocalICCESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__NAME_OF_LOCAL_ICC, oldNameOfLocalICC, nameOfLocalICC,
                !oldNameOfLocalICCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNameOfLocalICC() {
        String oldNameOfLocalICC = nameOfLocalICC;
        boolean oldNameOfLocalICCESet = nameOfLocalICCESet;
        nameOfLocalICC = NAME_OF_LOCAL_ICC_EDEFAULT;
        nameOfLocalICCESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__NAME_OF_LOCAL_ICC, oldNameOfLocalICC,
                NAME_OF_LOCAL_ICC_EDEFAULT, oldNameOfLocalICCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNameOfLocalICC() {
        return nameOfLocalICCESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getSupportForBlock1() {
        return supportForBlock1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSupportForBlock1( Boolean newSupportForBlock1 ) {
        Boolean oldSupportForBlock1 = supportForBlock1;
        supportForBlock1 = newSupportForBlock1;
        boolean oldSupportForBlock1ESet = supportForBlock1ESet;
        supportForBlock1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK1, oldSupportForBlock1, supportForBlock1,
                !oldSupportForBlock1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSupportForBlock1() {
        Boolean oldSupportForBlock1 = supportForBlock1;
        boolean oldSupportForBlock1ESet = supportForBlock1ESet;
        supportForBlock1 = SUPPORT_FOR_BLOCK1_EDEFAULT;
        supportForBlock1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK1, oldSupportForBlock1,
                SUPPORT_FOR_BLOCK1_EDEFAULT, oldSupportForBlock1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSupportForBlock1() {
        return supportForBlock1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getSupportForBlock2() {
        return supportForBlock2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSupportForBlock2( Boolean newSupportForBlock2 ) {
        Boolean oldSupportForBlock2 = supportForBlock2;
        supportForBlock2 = newSupportForBlock2;
        boolean oldSupportForBlock2ESet = supportForBlock2ESet;
        supportForBlock2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK2, oldSupportForBlock2, supportForBlock2,
                !oldSupportForBlock2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSupportForBlock2() {
        Boolean oldSupportForBlock2 = supportForBlock2;
        boolean oldSupportForBlock2ESet = supportForBlock2ESet;
        supportForBlock2 = SUPPORT_FOR_BLOCK2_EDEFAULT;
        supportForBlock2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK2, oldSupportForBlock2,
                SUPPORT_FOR_BLOCK2_EDEFAULT, oldSupportForBlock2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSupportForBlock2() {
        return supportForBlock2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getSupportForBlock3() {
        return supportForBlock3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSupportForBlock3( Boolean newSupportForBlock3 ) {
        Boolean oldSupportForBlock3 = supportForBlock3;
        supportForBlock3 = newSupportForBlock3;
        boolean oldSupportForBlock3ESet = supportForBlock3ESet;
        supportForBlock3ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK3, oldSupportForBlock3, supportForBlock3,
                !oldSupportForBlock3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSupportForBlock3() {
        Boolean oldSupportForBlock3 = supportForBlock3;
        boolean oldSupportForBlock3ESet = supportForBlock3ESet;
        supportForBlock3 = SUPPORT_FOR_BLOCK3_EDEFAULT;
        supportForBlock3ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK3, oldSupportForBlock3,
                SUPPORT_FOR_BLOCK3_EDEFAULT, oldSupportForBlock3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSupportForBlock3() {
        return supportForBlock3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getSupportForBlock4() {
        return supportForBlock4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSupportForBlock4( Boolean newSupportForBlock4 ) {
        Boolean oldSupportForBlock4 = supportForBlock4;
        supportForBlock4 = newSupportForBlock4;
        boolean oldSupportForBlock4ESet = supportForBlock4ESet;
        supportForBlock4ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK4, oldSupportForBlock4, supportForBlock4,
                !oldSupportForBlock4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSupportForBlock4() {
        Boolean oldSupportForBlock4 = supportForBlock4;
        boolean oldSupportForBlock4ESet = supportForBlock4ESet;
        supportForBlock4 = SUPPORT_FOR_BLOCK4_EDEFAULT;
        supportForBlock4ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK4, oldSupportForBlock4,
                SUPPORT_FOR_BLOCK4_EDEFAULT, oldSupportForBlock4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSupportForBlock4() {
        return supportForBlock4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getSupportForBlock5() {
        return supportForBlock5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSupportForBlock5( Boolean newSupportForBlock5 ) {
        Boolean oldSupportForBlock5 = supportForBlock5;
        supportForBlock5 = newSupportForBlock5;
        boolean oldSupportForBlock5ESet = supportForBlock5ESet;
        supportForBlock5ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK5, oldSupportForBlock5, supportForBlock5,
                !oldSupportForBlock5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSupportForBlock5() {
        Boolean oldSupportForBlock5 = supportForBlock5;
        boolean oldSupportForBlock5ESet = supportForBlock5ESet;
        supportForBlock5 = SUPPORT_FOR_BLOCK5_EDEFAULT;
        supportForBlock5ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK5, oldSupportForBlock5,
                SUPPORT_FOR_BLOCK5_EDEFAULT, oldSupportForBlock5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSupportForBlock5() {
        return supportForBlock5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getSupportForDepriciatedBlock8() {
        return supportForDepriciatedBlock8;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSupportForDepriciatedBlock8( Boolean newSupportForDepriciatedBlock8 ) {
        Boolean oldSupportForDepriciatedBlock8 = supportForDepriciatedBlock8;
        supportForDepriciatedBlock8 = newSupportForDepriciatedBlock8;
        boolean oldSupportForDepriciatedBlock8ESet = supportForDepriciatedBlock8ESet;
        supportForDepriciatedBlock8ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_DEPRICIATED_BLOCK8, oldSupportForDepriciatedBlock8,
                supportForDepriciatedBlock8, !oldSupportForDepriciatedBlock8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSupportForDepriciatedBlock8() {
        Boolean oldSupportForDepriciatedBlock8 = supportForDepriciatedBlock8;
        boolean oldSupportForDepriciatedBlock8ESet = supportForDepriciatedBlock8ESet;
        supportForDepriciatedBlock8 = SUPPORT_FOR_DEPRICIATED_BLOCK8_EDEFAULT;
        supportForDepriciatedBlock8ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_DEPRICIATED_BLOCK8, oldSupportForDepriciatedBlock8,
                SUPPORT_FOR_DEPRICIATED_BLOCK8_EDEFAULT, oldSupportForDepriciatedBlock8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSupportForDepriciatedBlock8() {
        return supportForDepriciatedBlock8ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getTransportSecurityRequirement() {
        return transportSecurityRequirement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTransportSecurityRequirement( Boolean newTransportSecurityRequirement ) {
        Boolean oldTransportSecurityRequirement = transportSecurityRequirement;
        transportSecurityRequirement = newTransportSecurityRequirement;
        boolean oldTransportSecurityRequirementESet = transportSecurityRequirementESet;
        transportSecurityRequirementESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__TRANSPORT_SECURITY_REQUIREMENT, oldTransportSecurityRequirement,
                transportSecurityRequirement, !oldTransportSecurityRequirementESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTransportSecurityRequirement() {
        Boolean oldTransportSecurityRequirement = transportSecurityRequirement;
        boolean oldTransportSecurityRequirementESet = transportSecurityRequirementESet;
        transportSecurityRequirement = TRANSPORT_SECURITY_REQUIREMENT_EDEFAULT;
        transportSecurityRequirementESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__TRANSPORT_SECURITY_REQUIREMENT, oldTransportSecurityRequirement,
                TRANSPORT_SECURITY_REQUIREMENT_EDEFAULT, oldTransportSecurityRequirementESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransportSecurityRequirement() {
        return transportSecurityRequirementESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__CALLING:
            return getCalling();
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__CLIENT_AND_SERVER:
            return getClientAndServer();
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__MINIMUM_UPDATE_INTERVAL:
            return getMinimumUpdateInterval();
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__NAME_OF_LOCAL_ICC:
            return getNameOfLocalICC();
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK1:
            return getSupportForBlock1();
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK2:
            return getSupportForBlock2();
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK3:
            return getSupportForBlock3();
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK4:
            return getSupportForBlock4();
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK5:
            return getSupportForBlock5();
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_DEPRICIATED_BLOCK8:
            return getSupportForDepriciatedBlock8();
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__TRANSPORT_SECURITY_REQUIREMENT:
            return getTransportSecurityRequirement();
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
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__CALLING:
            setCalling( ( Boolean ) newValue );
            return;
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__CLIENT_AND_SERVER:
            setClientAndServer( ( Boolean ) newValue );
            return;
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__MINIMUM_UPDATE_INTERVAL:
            setMinimumUpdateInterval( ( Integer ) newValue );
            return;
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__NAME_OF_LOCAL_ICC:
            setNameOfLocalICC( ( String ) newValue );
            return;
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK1:
            setSupportForBlock1( ( Boolean ) newValue );
            return;
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK2:
            setSupportForBlock2( ( Boolean ) newValue );
            return;
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK3:
            setSupportForBlock3( ( Boolean ) newValue );
            return;
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK4:
            setSupportForBlock4( ( Boolean ) newValue );
            return;
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK5:
            setSupportForBlock5( ( Boolean ) newValue );
            return;
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_DEPRICIATED_BLOCK8:
            setSupportForDepriciatedBlock8( ( Boolean ) newValue );
            return;
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__TRANSPORT_SECURITY_REQUIREMENT:
            setTransportSecurityRequirement( ( Boolean ) newValue );
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
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__CALLING:
            unsetCalling();
            return;
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__CLIENT_AND_SERVER:
            unsetClientAndServer();
            return;
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__MINIMUM_UPDATE_INTERVAL:
            unsetMinimumUpdateInterval();
            return;
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__NAME_OF_LOCAL_ICC:
            unsetNameOfLocalICC();
            return;
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK1:
            unsetSupportForBlock1();
            return;
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK2:
            unsetSupportForBlock2();
            return;
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK3:
            unsetSupportForBlock3();
            return;
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK4:
            unsetSupportForBlock4();
            return;
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK5:
            unsetSupportForBlock5();
            return;
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_DEPRICIATED_BLOCK8:
            unsetSupportForDepriciatedBlock8();
            return;
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__TRANSPORT_SECURITY_REQUIREMENT:
            unsetTransportSecurityRequirement();
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
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__CALLING:
            return isSetCalling();
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__CLIENT_AND_SERVER:
            return isSetClientAndServer();
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__MINIMUM_UPDATE_INTERVAL:
            return isSetMinimumUpdateInterval();
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__NAME_OF_LOCAL_ICC:
            return isSetNameOfLocalICC();
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK1:
            return isSetSupportForBlock1();
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK2:
            return isSetSupportForBlock2();
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK3:
            return isSetSupportForBlock3();
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK4:
            return isSetSupportForBlock4();
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_BLOCK5:
            return isSetSupportForBlock5();
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__SUPPORT_FOR_DEPRICIATED_BLOCK8:
            return isSetSupportForDepriciatedBlock8();
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER__TRANSPORT_SECURITY_REQUIREMENT:
            return isSetTransportSecurityRequirement();
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
        result.append( " (calling: " );
        if( callingESet )
            result.append( calling );
        else
            result.append( "<unset>" );
        result.append( ", clientAndServer: " );
        if( clientAndServerESet )
            result.append( clientAndServer );
        else
            result.append( "<unset>" );
        result.append( ", minimumUpdateInterval: " );
        if( minimumUpdateIntervalESet )
            result.append( minimumUpdateInterval );
        else
            result.append( "<unset>" );
        result.append( ", nameOfLocalICC: " );
        if( nameOfLocalICCESet )
            result.append( nameOfLocalICC );
        else
            result.append( "<unset>" );
        result.append( ", supportForBlock1: " );
        if( supportForBlock1ESet )
            result.append( supportForBlock1 );
        else
            result.append( "<unset>" );
        result.append( ", supportForBlock2: " );
        if( supportForBlock2ESet )
            result.append( supportForBlock2 );
        else
            result.append( "<unset>" );
        result.append( ", supportForBlock3: " );
        if( supportForBlock3ESet )
            result.append( supportForBlock3 );
        else
            result.append( "<unset>" );
        result.append( ", supportForBlock4: " );
        if( supportForBlock4ESet )
            result.append( supportForBlock4 );
        else
            result.append( "<unset>" );
        result.append( ", supportForBlock5: " );
        if( supportForBlock5ESet )
            result.append( supportForBlock5 );
        else
            result.append( "<unset>" );
        result.append( ", supportForDepriciatedBlock8: " );
        if( supportForDepriciatedBlock8ESet )
            result.append( supportForDepriciatedBlock8 );
        else
            result.append( "<unset>" );
        result.append( ", TransportSecurityRequirement: " );
        if( transportSecurityRequirementESet )
            result.append( transportSecurityRequirement );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ICCPVirtualControlCenterImpl
