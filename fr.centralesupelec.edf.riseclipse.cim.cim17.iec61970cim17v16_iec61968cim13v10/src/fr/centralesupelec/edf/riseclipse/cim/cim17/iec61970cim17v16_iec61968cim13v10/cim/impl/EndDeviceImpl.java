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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceFunction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceGroup;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ServiceLocation;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceImpl#getAmrSystem <em>Amr System</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceImpl#getInstallCode <em>Install Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceImpl#getIsPan <em>Is Pan</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceImpl#getIsSmartInverter <em>Is Smart Inverter</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceImpl#getIsVirtual <em>Is Virtual</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceImpl#getTimeZoneOffset <em>Time Zone Offset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceImpl#getEndDeviceInfo <em>End Device Info</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceImpl#getEndDeviceGroups <em>End Device Groups</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceImpl#getEndDeviceFunctions <em>End Device Functions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceImpl#getOtherCapability <em>Other Capability</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceImpl#getUsagePoint <em>Usage Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceImpl#getEndDeviceEvents <em>End Device Events</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceImpl#getEndDeviceControls <em>End Device Controls</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceImpl#getDispatchablePowerCapability <em>Dispatchable Power Capability</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceImpl#getServiceLocation <em>Service Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndDeviceImpl extends AssetContainerImpl implements EndDevice {
    /**
     * The default value of the '{@link #getAmrSystem() <em>Amr System</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAmrSystem()
     * @generated
     * @ordered
     */
    protected static final String AMR_SYSTEM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAmrSystem() <em>Amr System</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAmrSystem()
     * @generated
     * @ordered
     */
    protected String amrSystem = AMR_SYSTEM_EDEFAULT;

    /**
     * This is true if the Amr System attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean amrSystemESet;

    /**
     * The default value of the '{@link #getInstallCode() <em>Install Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstallCode()
     * @generated
     * @ordered
     */
    protected static final String INSTALL_CODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInstallCode() <em>Install Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstallCode()
     * @generated
     * @ordered
     */
    protected String installCode = INSTALL_CODE_EDEFAULT;

    /**
     * This is true if the Install Code attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean installCodeESet;

    /**
     * The default value of the '{@link #getIsPan() <em>Is Pan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsPan()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_PAN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsPan() <em>Is Pan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsPan()
     * @generated
     * @ordered
     */
    protected Boolean isPan = IS_PAN_EDEFAULT;

    /**
     * This is true if the Is Pan attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isPanESet;

    /**
     * The default value of the '{@link #getIsSmartInverter() <em>Is Smart Inverter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsSmartInverter()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_SMART_INVERTER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsSmartInverter() <em>Is Smart Inverter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsSmartInverter()
     * @generated
     * @ordered
     */
    protected Boolean isSmartInverter = IS_SMART_INVERTER_EDEFAULT;

    /**
     * This is true if the Is Smart Inverter attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isSmartInverterESet;

    /**
     * The default value of the '{@link #getIsVirtual() <em>Is Virtual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsVirtual()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_VIRTUAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsVirtual() <em>Is Virtual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsVirtual()
     * @generated
     * @ordered
     */
    protected Boolean isVirtual = IS_VIRTUAL_EDEFAULT;

    /**
     * This is true if the Is Virtual attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isVirtualESet;

    /**
     * The default value of the '{@link #getTimeZoneOffset() <em>Time Zone Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeZoneOffset()
     * @generated
     * @ordered
     */
    protected static final Float TIME_ZONE_OFFSET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTimeZoneOffset() <em>Time Zone Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeZoneOffset()
     * @generated
     * @ordered
     */
    protected Float timeZoneOffset = TIME_ZONE_OFFSET_EDEFAULT;

    /**
     * This is true if the Time Zone Offset attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean timeZoneOffsetESet;

    /**
     * The cached value of the '{@link #getEndDeviceInfo() <em>End Device Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDeviceInfo()
     * @generated
     * @ordered
     */
    protected EndDeviceInfo endDeviceInfo;

    /**
     * This is true if the End Device Info reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean endDeviceInfoESet;

    /**
     * The cached value of the '{@link #getEndDeviceGroups() <em>End Device Groups</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDeviceGroups()
     * @generated
     * @ordered
     */
    protected EList< EndDeviceGroup > endDeviceGroups;

    /**
     * The cached value of the '{@link #getEndDeviceFunctions() <em>End Device Functions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDeviceFunctions()
     * @generated
     * @ordered
     */
    protected EList< EndDeviceFunction > endDeviceFunctions;

    /**
     * The cached value of the '{@link #getOtherCapability() <em>Other Capability</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOtherCapability()
     * @generated
     * @ordered
     */
    protected EList< OtherCapability > otherCapability;

    /**
     * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomer()
     * @generated
     * @ordered
     */
    protected Customer customer;

    /**
     * This is true if the Customer reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean customerESet;

    /**
     * The cached value of the '{@link #getUsagePoint() <em>Usage Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsagePoint()
     * @generated
     * @ordered
     */
    protected UsagePoint usagePoint;

    /**
     * This is true if the Usage Point reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean usagePointESet;

    /**
     * The cached value of the '{@link #getEndDeviceEvents() <em>End Device Events</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDeviceEvents()
     * @generated
     * @ordered
     */
    protected EList< EndDeviceEvent > endDeviceEvents;

    /**
     * The cached value of the '{@link #getEndDeviceControls() <em>End Device Controls</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDeviceControls()
     * @generated
     * @ordered
     */
    protected EList< EndDeviceControl > endDeviceControls;

    /**
     * The cached value of the '{@link #getDispatchablePowerCapability() <em>Dispatchable Power Capability</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDispatchablePowerCapability()
     * @generated
     * @ordered
     */
    protected EList< DispatchablePowerCapability > dispatchablePowerCapability;

    /**
     * The cached value of the '{@link #getServiceLocation() <em>Service Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceLocation()
     * @generated
     * @ordered
     */
    protected ServiceLocation serviceLocation;

    /**
     * This is true if the Service Location reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean serviceLocationESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EndDeviceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getEndDevice();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAmrSystem() {
        return amrSystem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAmrSystem( String newAmrSystem ) {
        String oldAmrSystem = amrSystem;
        amrSystem = newAmrSystem;
        boolean oldAmrSystemESet = amrSystemESet;
        amrSystemESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.END_DEVICE__AMR_SYSTEM, oldAmrSystem, amrSystem, !oldAmrSystemESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAmrSystem() {
        String oldAmrSystem = amrSystem;
        boolean oldAmrSystemESet = amrSystemESet;
        amrSystem = AMR_SYSTEM_EDEFAULT;
        amrSystemESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.END_DEVICE__AMR_SYSTEM, oldAmrSystem, AMR_SYSTEM_EDEFAULT, oldAmrSystemESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAmrSystem() {
        return amrSystemESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getInstallCode() {
        return installCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInstallCode( String newInstallCode ) {
        String oldInstallCode = installCode;
        installCode = newInstallCode;
        boolean oldInstallCodeESet = installCodeESet;
        installCodeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.END_DEVICE__INSTALL_CODE, oldInstallCode, installCode, !oldInstallCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInstallCode() {
        String oldInstallCode = installCode;
        boolean oldInstallCodeESet = installCodeESet;
        installCode = INSTALL_CODE_EDEFAULT;
        installCodeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.END_DEVICE__INSTALL_CODE, oldInstallCode, INSTALL_CODE_EDEFAULT, oldInstallCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInstallCode() {
        return installCodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsPan() {
        return isPan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsPan( Boolean newIsPan ) {
        Boolean oldIsPan = isPan;
        isPan = newIsPan;
        boolean oldIsPanESet = isPanESet;
        isPanESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.END_DEVICE__IS_PAN, oldIsPan, isPan, !oldIsPanESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsPan() {
        Boolean oldIsPan = isPan;
        boolean oldIsPanESet = isPanESet;
        isPan = IS_PAN_EDEFAULT;
        isPanESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.END_DEVICE__IS_PAN, oldIsPan, IS_PAN_EDEFAULT, oldIsPanESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsPan() {
        return isPanESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsSmartInverter() {
        return isSmartInverter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsSmartInverter( Boolean newIsSmartInverter ) {
        Boolean oldIsSmartInverter = isSmartInverter;
        isSmartInverter = newIsSmartInverter;
        boolean oldIsSmartInverterESet = isSmartInverterESet;
        isSmartInverterESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.END_DEVICE__IS_SMART_INVERTER,
                    oldIsSmartInverter, isSmartInverter, !oldIsSmartInverterESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsSmartInverter() {
        Boolean oldIsSmartInverter = isSmartInverter;
        boolean oldIsSmartInverterESet = isSmartInverterESet;
        isSmartInverter = IS_SMART_INVERTER_EDEFAULT;
        isSmartInverterESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.END_DEVICE__IS_SMART_INVERTER,
                    oldIsSmartInverter, IS_SMART_INVERTER_EDEFAULT, oldIsSmartInverterESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsSmartInverter() {
        return isSmartInverterESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsVirtual() {
        return isVirtual;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsVirtual( Boolean newIsVirtual ) {
        Boolean oldIsVirtual = isVirtual;
        isVirtual = newIsVirtual;
        boolean oldIsVirtualESet = isVirtualESet;
        isVirtualESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.END_DEVICE__IS_VIRTUAL, oldIsVirtual, isVirtual, !oldIsVirtualESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsVirtual() {
        Boolean oldIsVirtual = isVirtual;
        boolean oldIsVirtualESet = isVirtualESet;
        isVirtual = IS_VIRTUAL_EDEFAULT;
        isVirtualESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.END_DEVICE__IS_VIRTUAL, oldIsVirtual, IS_VIRTUAL_EDEFAULT, oldIsVirtualESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsVirtual() {
        return isVirtualESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTimeZoneOffset() {
        return timeZoneOffset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTimeZoneOffset( Float newTimeZoneOffset ) {
        Float oldTimeZoneOffset = timeZoneOffset;
        timeZoneOffset = newTimeZoneOffset;
        boolean oldTimeZoneOffsetESet = timeZoneOffsetESet;
        timeZoneOffsetESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.END_DEVICE__TIME_ZONE_OFFSET, oldTimeZoneOffset, timeZoneOffset, !oldTimeZoneOffsetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTimeZoneOffset() {
        Float oldTimeZoneOffset = timeZoneOffset;
        boolean oldTimeZoneOffsetESet = timeZoneOffsetESet;
        timeZoneOffset = TIME_ZONE_OFFSET_EDEFAULT;
        timeZoneOffsetESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.END_DEVICE__TIME_ZONE_OFFSET,
                    oldTimeZoneOffset, TIME_ZONE_OFFSET_EDEFAULT, oldTimeZoneOffsetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTimeZoneOffset() {
        return timeZoneOffsetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EndDeviceInfo getEndDeviceInfo() {
        return endDeviceInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEndDeviceInfo( EndDeviceInfo newEndDeviceInfo, NotificationChain msgs ) {
        EndDeviceInfo oldEndDeviceInfo = endDeviceInfo;
        endDeviceInfo = newEndDeviceInfo;
        boolean oldEndDeviceInfoESet = endDeviceInfoESet;
        endDeviceInfoESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE__END_DEVICE_INFO, oldEndDeviceInfo, newEndDeviceInfo, !oldEndDeviceInfoESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEndDeviceInfo( EndDeviceInfo newEndDeviceInfo ) {
        if( newEndDeviceInfo != endDeviceInfo ) {
            NotificationChain msgs = null;
            if( endDeviceInfo != null ) msgs = ( ( InternalEObject ) endDeviceInfo ).eInverseRemove( this,
                    CimPackage.END_DEVICE_INFO__END_DEVICES, EndDeviceInfo.class, msgs );
            if( newEndDeviceInfo != null ) msgs = ( ( InternalEObject ) newEndDeviceInfo ).eInverseAdd( this,
                    CimPackage.END_DEVICE_INFO__END_DEVICES, EndDeviceInfo.class, msgs );
            msgs = basicSetEndDeviceInfo( newEndDeviceInfo, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEndDeviceInfoESet = endDeviceInfoESet;
            endDeviceInfoESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.END_DEVICE__END_DEVICE_INFO,
                        newEndDeviceInfo, newEndDeviceInfo, !oldEndDeviceInfoESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEndDeviceInfo( NotificationChain msgs ) {
        EndDeviceInfo oldEndDeviceInfo = endDeviceInfo;
        endDeviceInfo = null;
        boolean oldEndDeviceInfoESet = endDeviceInfoESet;
        endDeviceInfoESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE__END_DEVICE_INFO, oldEndDeviceInfo, null, oldEndDeviceInfoESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndDeviceInfo() {
        if( endDeviceInfo != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) endDeviceInfo ).eInverseRemove( this, CimPackage.END_DEVICE_INFO__END_DEVICES,
                    EndDeviceInfo.class, msgs );
            msgs = basicUnsetEndDeviceInfo( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEndDeviceInfoESet = endDeviceInfoESet;
            endDeviceInfoESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE__END_DEVICE_INFO, null, null, oldEndDeviceInfoESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDeviceInfo() {
        return endDeviceInfoESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EndDeviceGroup > getEndDeviceGroups() {
        if( endDeviceGroups == null ) {
            endDeviceGroups = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< EndDeviceGroup >(
                    EndDeviceGroup.class, this, CimPackage.END_DEVICE__END_DEVICE_GROUPS,
                    CimPackage.END_DEVICE_GROUP__END_DEVICES );
        }
        return endDeviceGroups;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndDeviceGroups() {
        if( endDeviceGroups != null ) ( ( InternalEList.Unsettable< ? > ) endDeviceGroups ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDeviceGroups() {
        return endDeviceGroups != null && ( ( InternalEList.Unsettable< ? > ) endDeviceGroups ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EndDeviceFunction > getEndDeviceFunctions() {
        if( endDeviceFunctions == null ) {
            endDeviceFunctions = new EObjectWithInverseResolvingEList.Unsettable< EndDeviceFunction >(
                    EndDeviceFunction.class, this, CimPackage.END_DEVICE__END_DEVICE_FUNCTIONS,
                    CimPackage.END_DEVICE_FUNCTION__END_DEVICE );
        }
        return endDeviceFunctions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndDeviceFunctions() {
        if( endDeviceFunctions != null ) ( ( InternalEList.Unsettable< ? > ) endDeviceFunctions ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDeviceFunctions() {
        return endDeviceFunctions != null && ( ( InternalEList.Unsettable< ? > ) endDeviceFunctions ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< OtherCapability > getOtherCapability() {
        if( otherCapability == null ) {
            otherCapability = new EObjectWithInverseResolvingEList.Unsettable< OtherCapability >( OtherCapability.class,
                    this, CimPackage.END_DEVICE__OTHER_CAPABILITY, CimPackage.OTHER_CAPABILITY__END_DEVICE );
        }
        return otherCapability;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOtherCapability() {
        if( otherCapability != null ) ( ( InternalEList.Unsettable< ? > ) otherCapability ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOtherCapability() {
        return otherCapability != null && ( ( InternalEList.Unsettable< ? > ) otherCapability ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Customer getCustomer() {
        return customer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCustomer( Customer newCustomer, NotificationChain msgs ) {
        Customer oldCustomer = customer;
        customer = newCustomer;
        boolean oldCustomerESet = customerESet;
        customerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE__CUSTOMER, oldCustomer, newCustomer, !oldCustomerESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCustomer( Customer newCustomer ) {
        if( newCustomer != customer ) {
            NotificationChain msgs = null;
            if( customer != null ) msgs = ( ( InternalEObject ) customer ).eInverseRemove( this,
                    CimPackage.CUSTOMER__END_DEVICES, Customer.class, msgs );
            if( newCustomer != null ) msgs = ( ( InternalEObject ) newCustomer ).eInverseAdd( this,
                    CimPackage.CUSTOMER__END_DEVICES, Customer.class, msgs );
            msgs = basicSetCustomer( newCustomer, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCustomerESet = customerESet;
            customerESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE__CUSTOMER, newCustomer, newCustomer, !oldCustomerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCustomer( NotificationChain msgs ) {
        Customer oldCustomer = customer;
        customer = null;
        boolean oldCustomerESet = customerESet;
        customerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE__CUSTOMER, oldCustomer, null, oldCustomerESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCustomer() {
        if( customer != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) customer ).eInverseRemove( this, CimPackage.CUSTOMER__END_DEVICES,
                    Customer.class, msgs );
            msgs = basicUnsetCustomer( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCustomerESet = customerESet;
            customerESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE__CUSTOMER, null, null, oldCustomerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCustomer() {
        return customerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UsagePoint getUsagePoint() {
        return usagePoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetUsagePoint( UsagePoint newUsagePoint, NotificationChain msgs ) {
        UsagePoint oldUsagePoint = usagePoint;
        usagePoint = newUsagePoint;
        boolean oldUsagePointESet = usagePointESet;
        usagePointESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE__USAGE_POINT, oldUsagePoint, newUsagePoint, !oldUsagePointESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUsagePoint( UsagePoint newUsagePoint ) {
        if( newUsagePoint != usagePoint ) {
            NotificationChain msgs = null;
            if( usagePoint != null ) msgs = ( ( InternalEObject ) usagePoint ).eInverseRemove( this,
                    CimPackage.USAGE_POINT__END_DEVICES, UsagePoint.class, msgs );
            if( newUsagePoint != null ) msgs = ( ( InternalEObject ) newUsagePoint ).eInverseAdd( this,
                    CimPackage.USAGE_POINT__END_DEVICES, UsagePoint.class, msgs );
            msgs = basicSetUsagePoint( newUsagePoint, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldUsagePointESet = usagePointESet;
            usagePointESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE__USAGE_POINT, newUsagePoint, newUsagePoint, !oldUsagePointESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetUsagePoint( NotificationChain msgs ) {
        UsagePoint oldUsagePoint = usagePoint;
        usagePoint = null;
        boolean oldUsagePointESet = usagePointESet;
        usagePointESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE__USAGE_POINT, oldUsagePoint, null, oldUsagePointESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUsagePoint() {
        if( usagePoint != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) usagePoint ).eInverseRemove( this, CimPackage.USAGE_POINT__END_DEVICES,
                    UsagePoint.class, msgs );
            msgs = basicUnsetUsagePoint( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldUsagePointESet = usagePointESet;
            usagePointESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE__USAGE_POINT, null, null, oldUsagePointESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUsagePoint() {
        return usagePointESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EndDeviceEvent > getEndDeviceEvents() {
        if( endDeviceEvents == null ) {
            endDeviceEvents = new EObjectWithInverseResolvingEList.Unsettable< EndDeviceEvent >( EndDeviceEvent.class,
                    this, CimPackage.END_DEVICE__END_DEVICE_EVENTS, CimPackage.END_DEVICE_EVENT__END_DEVICE );
        }
        return endDeviceEvents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndDeviceEvents() {
        if( endDeviceEvents != null ) ( ( InternalEList.Unsettable< ? > ) endDeviceEvents ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDeviceEvents() {
        return endDeviceEvents != null && ( ( InternalEList.Unsettable< ? > ) endDeviceEvents ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EndDeviceControl > getEndDeviceControls() {
        if( endDeviceControls == null ) {
            endDeviceControls = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< EndDeviceControl >(
                    EndDeviceControl.class, this, CimPackage.END_DEVICE__END_DEVICE_CONTROLS,
                    CimPackage.END_DEVICE_CONTROL__END_DEVICES );
        }
        return endDeviceControls;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndDeviceControls() {
        if( endDeviceControls != null ) ( ( InternalEList.Unsettable< ? > ) endDeviceControls ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDeviceControls() {
        return endDeviceControls != null && ( ( InternalEList.Unsettable< ? > ) endDeviceControls ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DispatchablePowerCapability > getDispatchablePowerCapability() {
        if( dispatchablePowerCapability == null ) {
            dispatchablePowerCapability = new EObjectWithInverseResolvingEList.Unsettable< DispatchablePowerCapability >(
                    DispatchablePowerCapability.class, this, CimPackage.END_DEVICE__DISPATCHABLE_POWER_CAPABILITY,
                    CimPackage.DISPATCHABLE_POWER_CAPABILITY__END_DEVICE );
        }
        return dispatchablePowerCapability;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDispatchablePowerCapability() {
        if( dispatchablePowerCapability != null )
            ( ( InternalEList.Unsettable< ? > ) dispatchablePowerCapability ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDispatchablePowerCapability() {
        return dispatchablePowerCapability != null
                && ( ( InternalEList.Unsettable< ? > ) dispatchablePowerCapability ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceLocation getServiceLocation() {
        return serviceLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetServiceLocation( ServiceLocation newServiceLocation, NotificationChain msgs ) {
        ServiceLocation oldServiceLocation = serviceLocation;
        serviceLocation = newServiceLocation;
        boolean oldServiceLocationESet = serviceLocationESet;
        serviceLocationESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE__SERVICE_LOCATION, oldServiceLocation, newServiceLocation,
                    !oldServiceLocationESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setServiceLocation( ServiceLocation newServiceLocation ) {
        if( newServiceLocation != serviceLocation ) {
            NotificationChain msgs = null;
            if( serviceLocation != null ) msgs = ( ( InternalEObject ) serviceLocation ).eInverseRemove( this,
                    CimPackage.SERVICE_LOCATION__END_DEVICES, ServiceLocation.class, msgs );
            if( newServiceLocation != null ) msgs = ( ( InternalEObject ) newServiceLocation ).eInverseAdd( this,
                    CimPackage.SERVICE_LOCATION__END_DEVICES, ServiceLocation.class, msgs );
            msgs = basicSetServiceLocation( newServiceLocation, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldServiceLocationESet = serviceLocationESet;
            serviceLocationESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.END_DEVICE__SERVICE_LOCATION,
                        newServiceLocation, newServiceLocation, !oldServiceLocationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetServiceLocation( NotificationChain msgs ) {
        ServiceLocation oldServiceLocation = serviceLocation;
        serviceLocation = null;
        boolean oldServiceLocationESet = serviceLocationESet;
        serviceLocationESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE__SERVICE_LOCATION, oldServiceLocation, null, oldServiceLocationESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetServiceLocation() {
        if( serviceLocation != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) serviceLocation ).eInverseRemove( this,
                    CimPackage.SERVICE_LOCATION__END_DEVICES, ServiceLocation.class, msgs );
            msgs = basicUnsetServiceLocation( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldServiceLocationESet = serviceLocationESet;
            serviceLocationESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE__SERVICE_LOCATION, null, null, oldServiceLocationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetServiceLocation() {
        return serviceLocationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.END_DEVICE__END_DEVICE_INFO:
            if( endDeviceInfo != null ) msgs = ( ( InternalEObject ) endDeviceInfo ).eInverseRemove( this,
                    CimPackage.END_DEVICE_INFO__END_DEVICES, EndDeviceInfo.class, msgs );
            return basicSetEndDeviceInfo( ( EndDeviceInfo ) otherEnd, msgs );
        case CimPackage.END_DEVICE__END_DEVICE_GROUPS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEndDeviceGroups() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.END_DEVICE__END_DEVICE_FUNCTIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEndDeviceFunctions() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.END_DEVICE__OTHER_CAPABILITY:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOtherCapability() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.END_DEVICE__CUSTOMER:
            if( customer != null ) msgs = ( ( InternalEObject ) customer ).eInverseRemove( this,
                    CimPackage.CUSTOMER__END_DEVICES, Customer.class, msgs );
            return basicSetCustomer( ( Customer ) otherEnd, msgs );
        case CimPackage.END_DEVICE__USAGE_POINT:
            if( usagePoint != null ) msgs = ( ( InternalEObject ) usagePoint ).eInverseRemove( this,
                    CimPackage.USAGE_POINT__END_DEVICES, UsagePoint.class, msgs );
            return basicSetUsagePoint( ( UsagePoint ) otherEnd, msgs );
        case CimPackage.END_DEVICE__END_DEVICE_EVENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEndDeviceEvents() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.END_DEVICE__END_DEVICE_CONTROLS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEndDeviceControls() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.END_DEVICE__DISPATCHABLE_POWER_CAPABILITY:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDispatchablePowerCapability() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.END_DEVICE__SERVICE_LOCATION:
            if( serviceLocation != null ) msgs = ( ( InternalEObject ) serviceLocation ).eInverseRemove( this,
                    CimPackage.SERVICE_LOCATION__END_DEVICES, ServiceLocation.class, msgs );
            return basicSetServiceLocation( ( ServiceLocation ) otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.END_DEVICE__END_DEVICE_INFO:
            return basicUnsetEndDeviceInfo( msgs );
        case CimPackage.END_DEVICE__END_DEVICE_GROUPS:
            return ( ( InternalEList< ? > ) getEndDeviceGroups() ).basicRemove( otherEnd, msgs );
        case CimPackage.END_DEVICE__END_DEVICE_FUNCTIONS:
            return ( ( InternalEList< ? > ) getEndDeviceFunctions() ).basicRemove( otherEnd, msgs );
        case CimPackage.END_DEVICE__OTHER_CAPABILITY:
            return ( ( InternalEList< ? > ) getOtherCapability() ).basicRemove( otherEnd, msgs );
        case CimPackage.END_DEVICE__CUSTOMER:
            return basicUnsetCustomer( msgs );
        case CimPackage.END_DEVICE__USAGE_POINT:
            return basicUnsetUsagePoint( msgs );
        case CimPackage.END_DEVICE__END_DEVICE_EVENTS:
            return ( ( InternalEList< ? > ) getEndDeviceEvents() ).basicRemove( otherEnd, msgs );
        case CimPackage.END_DEVICE__END_DEVICE_CONTROLS:
            return ( ( InternalEList< ? > ) getEndDeviceControls() ).basicRemove( otherEnd, msgs );
        case CimPackage.END_DEVICE__DISPATCHABLE_POWER_CAPABILITY:
            return ( ( InternalEList< ? > ) getDispatchablePowerCapability() ).basicRemove( otherEnd, msgs );
        case CimPackage.END_DEVICE__SERVICE_LOCATION:
            return basicUnsetServiceLocation( msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.END_DEVICE__AMR_SYSTEM:
            return getAmrSystem();
        case CimPackage.END_DEVICE__INSTALL_CODE:
            return getInstallCode();
        case CimPackage.END_DEVICE__IS_PAN:
            return getIsPan();
        case CimPackage.END_DEVICE__IS_SMART_INVERTER:
            return getIsSmartInverter();
        case CimPackage.END_DEVICE__IS_VIRTUAL:
            return getIsVirtual();
        case CimPackage.END_DEVICE__TIME_ZONE_OFFSET:
            return getTimeZoneOffset();
        case CimPackage.END_DEVICE__END_DEVICE_INFO:
            return getEndDeviceInfo();
        case CimPackage.END_DEVICE__END_DEVICE_GROUPS:
            return getEndDeviceGroups();
        case CimPackage.END_DEVICE__END_DEVICE_FUNCTIONS:
            return getEndDeviceFunctions();
        case CimPackage.END_DEVICE__OTHER_CAPABILITY:
            return getOtherCapability();
        case CimPackage.END_DEVICE__CUSTOMER:
            return getCustomer();
        case CimPackage.END_DEVICE__USAGE_POINT:
            return getUsagePoint();
        case CimPackage.END_DEVICE__END_DEVICE_EVENTS:
            return getEndDeviceEvents();
        case CimPackage.END_DEVICE__END_DEVICE_CONTROLS:
            return getEndDeviceControls();
        case CimPackage.END_DEVICE__DISPATCHABLE_POWER_CAPABILITY:
            return getDispatchablePowerCapability();
        case CimPackage.END_DEVICE__SERVICE_LOCATION:
            return getServiceLocation();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.END_DEVICE__AMR_SYSTEM:
            setAmrSystem( ( String ) newValue );
            return;
        case CimPackage.END_DEVICE__INSTALL_CODE:
            setInstallCode( ( String ) newValue );
            return;
        case CimPackage.END_DEVICE__IS_PAN:
            setIsPan( ( Boolean ) newValue );
            return;
        case CimPackage.END_DEVICE__IS_SMART_INVERTER:
            setIsSmartInverter( ( Boolean ) newValue );
            return;
        case CimPackage.END_DEVICE__IS_VIRTUAL:
            setIsVirtual( ( Boolean ) newValue );
            return;
        case CimPackage.END_DEVICE__TIME_ZONE_OFFSET:
            setTimeZoneOffset( ( Float ) newValue );
            return;
        case CimPackage.END_DEVICE__END_DEVICE_INFO:
            setEndDeviceInfo( ( EndDeviceInfo ) newValue );
            return;
        case CimPackage.END_DEVICE__END_DEVICE_GROUPS:
            getEndDeviceGroups().clear();
            getEndDeviceGroups().addAll( ( Collection< ? extends EndDeviceGroup > ) newValue );
            return;
        case CimPackage.END_DEVICE__END_DEVICE_FUNCTIONS:
            getEndDeviceFunctions().clear();
            getEndDeviceFunctions().addAll( ( Collection< ? extends EndDeviceFunction > ) newValue );
            return;
        case CimPackage.END_DEVICE__OTHER_CAPABILITY:
            getOtherCapability().clear();
            getOtherCapability().addAll( ( Collection< ? extends OtherCapability > ) newValue );
            return;
        case CimPackage.END_DEVICE__CUSTOMER:
            setCustomer( ( Customer ) newValue );
            return;
        case CimPackage.END_DEVICE__USAGE_POINT:
            setUsagePoint( ( UsagePoint ) newValue );
            return;
        case CimPackage.END_DEVICE__END_DEVICE_EVENTS:
            getEndDeviceEvents().clear();
            getEndDeviceEvents().addAll( ( Collection< ? extends EndDeviceEvent > ) newValue );
            return;
        case CimPackage.END_DEVICE__END_DEVICE_CONTROLS:
            getEndDeviceControls().clear();
            getEndDeviceControls().addAll( ( Collection< ? extends EndDeviceControl > ) newValue );
            return;
        case CimPackage.END_DEVICE__DISPATCHABLE_POWER_CAPABILITY:
            getDispatchablePowerCapability().clear();
            getDispatchablePowerCapability().addAll( ( Collection< ? extends DispatchablePowerCapability > ) newValue );
            return;
        case CimPackage.END_DEVICE__SERVICE_LOCATION:
            setServiceLocation( ( ServiceLocation ) newValue );
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
        case CimPackage.END_DEVICE__AMR_SYSTEM:
            unsetAmrSystem();
            return;
        case CimPackage.END_DEVICE__INSTALL_CODE:
            unsetInstallCode();
            return;
        case CimPackage.END_DEVICE__IS_PAN:
            unsetIsPan();
            return;
        case CimPackage.END_DEVICE__IS_SMART_INVERTER:
            unsetIsSmartInverter();
            return;
        case CimPackage.END_DEVICE__IS_VIRTUAL:
            unsetIsVirtual();
            return;
        case CimPackage.END_DEVICE__TIME_ZONE_OFFSET:
            unsetTimeZoneOffset();
            return;
        case CimPackage.END_DEVICE__END_DEVICE_INFO:
            unsetEndDeviceInfo();
            return;
        case CimPackage.END_DEVICE__END_DEVICE_GROUPS:
            unsetEndDeviceGroups();
            return;
        case CimPackage.END_DEVICE__END_DEVICE_FUNCTIONS:
            unsetEndDeviceFunctions();
            return;
        case CimPackage.END_DEVICE__OTHER_CAPABILITY:
            unsetOtherCapability();
            return;
        case CimPackage.END_DEVICE__CUSTOMER:
            unsetCustomer();
            return;
        case CimPackage.END_DEVICE__USAGE_POINT:
            unsetUsagePoint();
            return;
        case CimPackage.END_DEVICE__END_DEVICE_EVENTS:
            unsetEndDeviceEvents();
            return;
        case CimPackage.END_DEVICE__END_DEVICE_CONTROLS:
            unsetEndDeviceControls();
            return;
        case CimPackage.END_DEVICE__DISPATCHABLE_POWER_CAPABILITY:
            unsetDispatchablePowerCapability();
            return;
        case CimPackage.END_DEVICE__SERVICE_LOCATION:
            unsetServiceLocation();
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
        case CimPackage.END_DEVICE__AMR_SYSTEM:
            return isSetAmrSystem();
        case CimPackage.END_DEVICE__INSTALL_CODE:
            return isSetInstallCode();
        case CimPackage.END_DEVICE__IS_PAN:
            return isSetIsPan();
        case CimPackage.END_DEVICE__IS_SMART_INVERTER:
            return isSetIsSmartInverter();
        case CimPackage.END_DEVICE__IS_VIRTUAL:
            return isSetIsVirtual();
        case CimPackage.END_DEVICE__TIME_ZONE_OFFSET:
            return isSetTimeZoneOffset();
        case CimPackage.END_DEVICE__END_DEVICE_INFO:
            return isSetEndDeviceInfo();
        case CimPackage.END_DEVICE__END_DEVICE_GROUPS:
            return isSetEndDeviceGroups();
        case CimPackage.END_DEVICE__END_DEVICE_FUNCTIONS:
            return isSetEndDeviceFunctions();
        case CimPackage.END_DEVICE__OTHER_CAPABILITY:
            return isSetOtherCapability();
        case CimPackage.END_DEVICE__CUSTOMER:
            return isSetCustomer();
        case CimPackage.END_DEVICE__USAGE_POINT:
            return isSetUsagePoint();
        case CimPackage.END_DEVICE__END_DEVICE_EVENTS:
            return isSetEndDeviceEvents();
        case CimPackage.END_DEVICE__END_DEVICE_CONTROLS:
            return isSetEndDeviceControls();
        case CimPackage.END_DEVICE__DISPATCHABLE_POWER_CAPABILITY:
            return isSetDispatchablePowerCapability();
        case CimPackage.END_DEVICE__SERVICE_LOCATION:
            return isSetServiceLocation();
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
        result.append( " (amrSystem: " );
        if( amrSystemESet )
            result.append( amrSystem );
        else
            result.append( "<unset>" );
        result.append( ", installCode: " );
        if( installCodeESet )
            result.append( installCode );
        else
            result.append( "<unset>" );
        result.append( ", isPan: " );
        if( isPanESet )
            result.append( isPan );
        else
            result.append( "<unset>" );
        result.append( ", isSmartInverter: " );
        if( isSmartInverterESet )
            result.append( isSmartInverter );
        else
            result.append( "<unset>" );
        result.append( ", isVirtual: " );
        if( isVirtualESet )
            result.append( isVirtual );
        else
            result.append( "<unset>" );
        result.append( ", timeZoneOffset: " );
        if( timeZoneOffsetESet )
            result.append( timeZoneOffset );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //EndDeviceImpl
