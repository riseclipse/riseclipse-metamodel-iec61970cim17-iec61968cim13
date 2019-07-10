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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteControl;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitMultiplier;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitSymbol;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ControlImpl#getControlType <em>Control Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ControlImpl#getOperationInProgress <em>Operation In Progress</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ControlImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ControlImpl#getUnitMultiplier <em>Unit Multiplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ControlImpl#getUnitSymbol <em>Unit Symbol</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ControlImpl#getPowerSystemResource <em>Power System Resource</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ControlImpl#getRemoteControl <em>Remote Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlImpl extends IOPointImpl implements Control {
    /**
     * The default value of the '{@link #getControlType() <em>Control Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlType()
     * @generated
     * @ordered
     */
    protected static final String CONTROL_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getControlType() <em>Control Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlType()
     * @generated
     * @ordered
     */
    protected String controlType = CONTROL_TYPE_EDEFAULT;

    /**
     * This is true if the Control Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean controlTypeESet;

    /**
     * The default value of the '{@link #getOperationInProgress() <em>Operation In Progress</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperationInProgress()
     * @generated
     * @ordered
     */
    protected static final Boolean OPERATION_IN_PROGRESS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOperationInProgress() <em>Operation In Progress</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperationInProgress()
     * @generated
     * @ordered
     */
    protected Boolean operationInProgress = OPERATION_IN_PROGRESS_EDEFAULT;

    /**
     * This is true if the Operation In Progress attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean operationInProgressESet;

    /**
     * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeStamp()
     * @generated
     * @ordered
     */
    protected static final Date TIME_STAMP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeStamp()
     * @generated
     * @ordered
     */
    protected Date timeStamp = TIME_STAMP_EDEFAULT;

    /**
     * This is true if the Time Stamp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean timeStampESet;

    /**
     * The default value of the '{@link #getUnitMultiplier() <em>Unit Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnitMultiplier()
     * @generated
     * @ordered
     */
    protected static final UnitMultiplier UNIT_MULTIPLIER_EDEFAULT = UnitMultiplier.YOCTO;

    /**
     * The cached value of the '{@link #getUnitMultiplier() <em>Unit Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnitMultiplier()
     * @generated
     * @ordered
     */
    protected UnitMultiplier unitMultiplier = UNIT_MULTIPLIER_EDEFAULT;

    /**
     * This is true if the Unit Multiplier attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean unitMultiplierESet;

    /**
     * The default value of the '{@link #getUnitSymbol() <em>Unit Symbol</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnitSymbol()
     * @generated
     * @ordered
     */
    protected static final UnitSymbol UNIT_SYMBOL_EDEFAULT = UnitSymbol.NONE;

    /**
     * The cached value of the '{@link #getUnitSymbol() <em>Unit Symbol</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnitSymbol()
     * @generated
     * @ordered
     */
    protected UnitSymbol unitSymbol = UNIT_SYMBOL_EDEFAULT;

    /**
     * This is true if the Unit Symbol attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean unitSymbolESet;

    /**
     * The cached value of the '{@link #getPowerSystemResource() <em>Power System Resource</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerSystemResource()
     * @generated
     * @ordered
     */
    protected PowerSystemResource powerSystemResource;

    /**
     * This is true if the Power System Resource reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean powerSystemResourceESet;

    /**
     * The cached value of the '{@link #getRemoteControl() <em>Remote Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemoteControl()
     * @generated
     * @ordered
     */
    protected RemoteControl remoteControl;

    /**
     * This is true if the Remote Control reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean remoteControlESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ControlImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getControl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getControlType() {
        return controlType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setControlType( String newControlType ) {
        String oldControlType = controlType;
        controlType = newControlType;
        boolean oldControlTypeESet = controlTypeESet;
        controlTypeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONTROL__CONTROL_TYPE, oldControlType, controlType, !oldControlTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetControlType() {
        String oldControlType = controlType;
        boolean oldControlTypeESet = controlTypeESet;
        controlType = CONTROL_TYPE_EDEFAULT;
        controlTypeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CONTROL__CONTROL_TYPE, oldControlType, CONTROL_TYPE_EDEFAULT, oldControlTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetControlType() {
        return controlTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getOperationInProgress() {
        return operationInProgress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOperationInProgress( Boolean newOperationInProgress ) {
        Boolean oldOperationInProgress = operationInProgress;
        operationInProgress = newOperationInProgress;
        boolean oldOperationInProgressESet = operationInProgressESet;
        operationInProgressESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CONTROL__OPERATION_IN_PROGRESS,
                    oldOperationInProgress, operationInProgress, !oldOperationInProgressESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOperationInProgress() {
        Boolean oldOperationInProgress = operationInProgress;
        boolean oldOperationInProgressESet = operationInProgressESet;
        operationInProgress = OPERATION_IN_PROGRESS_EDEFAULT;
        operationInProgressESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CONTROL__OPERATION_IN_PROGRESS,
                    oldOperationInProgress, OPERATION_IN_PROGRESS_EDEFAULT, oldOperationInProgressESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOperationInProgress() {
        return operationInProgressESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getTimeStamp() {
        return timeStamp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTimeStamp( Date newTimeStamp ) {
        Date oldTimeStamp = timeStamp;
        timeStamp = newTimeStamp;
        boolean oldTimeStampESet = timeStampESet;
        timeStampESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONTROL__TIME_STAMP, oldTimeStamp, timeStamp, !oldTimeStampESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTimeStamp() {
        Date oldTimeStamp = timeStamp;
        boolean oldTimeStampESet = timeStampESet;
        timeStamp = TIME_STAMP_EDEFAULT;
        timeStampESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CONTROL__TIME_STAMP, oldTimeStamp, TIME_STAMP_EDEFAULT, oldTimeStampESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTimeStamp() {
        return timeStampESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnitMultiplier getUnitMultiplier() {
        return unitMultiplier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUnitMultiplier( UnitMultiplier newUnitMultiplier ) {
        UnitMultiplier oldUnitMultiplier = unitMultiplier;
        unitMultiplier = newUnitMultiplier == null ? UNIT_MULTIPLIER_EDEFAULT : newUnitMultiplier;
        boolean oldUnitMultiplierESet = unitMultiplierESet;
        unitMultiplierESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONTROL__UNIT_MULTIPLIER, oldUnitMultiplier, unitMultiplier, !oldUnitMultiplierESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUnitMultiplier() {
        UnitMultiplier oldUnitMultiplier = unitMultiplier;
        boolean oldUnitMultiplierESet = unitMultiplierESet;
        unitMultiplier = UNIT_MULTIPLIER_EDEFAULT;
        unitMultiplierESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CONTROL__UNIT_MULTIPLIER,
                    oldUnitMultiplier, UNIT_MULTIPLIER_EDEFAULT, oldUnitMultiplierESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUnitMultiplier() {
        return unitMultiplierESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnitSymbol getUnitSymbol() {
        return unitSymbol;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUnitSymbol( UnitSymbol newUnitSymbol ) {
        UnitSymbol oldUnitSymbol = unitSymbol;
        unitSymbol = newUnitSymbol == null ? UNIT_SYMBOL_EDEFAULT : newUnitSymbol;
        boolean oldUnitSymbolESet = unitSymbolESet;
        unitSymbolESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONTROL__UNIT_SYMBOL, oldUnitSymbol, unitSymbol, !oldUnitSymbolESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUnitSymbol() {
        UnitSymbol oldUnitSymbol = unitSymbol;
        boolean oldUnitSymbolESet = unitSymbolESet;
        unitSymbol = UNIT_SYMBOL_EDEFAULT;
        unitSymbolESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CONTROL__UNIT_SYMBOL, oldUnitSymbol, UNIT_SYMBOL_EDEFAULT, oldUnitSymbolESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUnitSymbol() {
        return unitSymbolESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerSystemResource getPowerSystemResource() {
        return powerSystemResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPowerSystemResource( PowerSystemResource newPowerSystemResource,
            NotificationChain msgs ) {
        PowerSystemResource oldPowerSystemResource = powerSystemResource;
        powerSystemResource = newPowerSystemResource;
        boolean oldPowerSystemResourceESet = powerSystemResourceESet;
        powerSystemResourceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONTROL__POWER_SYSTEM_RESOURCE, oldPowerSystemResource, newPowerSystemResource,
                    !oldPowerSystemResourceESet );
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
    public void setPowerSystemResource( PowerSystemResource newPowerSystemResource ) {
        if( newPowerSystemResource != powerSystemResource ) {
            NotificationChain msgs = null;
            if( powerSystemResource != null ) msgs = ( ( InternalEObject ) powerSystemResource ).eInverseRemove( this,
                    CimPackage.POWER_SYSTEM_RESOURCE__CONTROLS, PowerSystemResource.class, msgs );
            if( newPowerSystemResource != null ) msgs = ( ( InternalEObject ) newPowerSystemResource )
                    .eInverseAdd( this, CimPackage.POWER_SYSTEM_RESOURCE__CONTROLS, PowerSystemResource.class, msgs );
            msgs = basicSetPowerSystemResource( newPowerSystemResource, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerSystemResourceESet = powerSystemResourceESet;
            powerSystemResourceESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CONTROL__POWER_SYSTEM_RESOURCE,
                        newPowerSystemResource, newPowerSystemResource, !oldPowerSystemResourceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPowerSystemResource( NotificationChain msgs ) {
        PowerSystemResource oldPowerSystemResource = powerSystemResource;
        powerSystemResource = null;
        boolean oldPowerSystemResourceESet = powerSystemResourceESet;
        powerSystemResourceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONTROL__POWER_SYSTEM_RESOURCE, oldPowerSystemResource, null,
                    oldPowerSystemResourceESet );
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
    public void unsetPowerSystemResource() {
        if( powerSystemResource != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) powerSystemResource ).eInverseRemove( this,
                    CimPackage.POWER_SYSTEM_RESOURCE__CONTROLS, PowerSystemResource.class, msgs );
            msgs = basicUnsetPowerSystemResource( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerSystemResourceESet = powerSystemResourceESet;
            powerSystemResourceESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONTROL__POWER_SYSTEM_RESOURCE, null, null, oldPowerSystemResourceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerSystemResource() {
        return powerSystemResourceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RemoteControl getRemoteControl() {
        if( remoteControl != null && remoteControl.eIsProxy() ) {
            InternalEObject oldRemoteControl = ( InternalEObject ) remoteControl;
            remoteControl = ( RemoteControl ) eResolveProxy( oldRemoteControl );
            if( remoteControl != oldRemoteControl ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.CONTROL__REMOTE_CONTROL, oldRemoteControl, remoteControl ) );
            }
        }
        return remoteControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RemoteControl basicGetRemoteControl() {
        return remoteControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRemoteControl( RemoteControl newRemoteControl, NotificationChain msgs ) {
        RemoteControl oldRemoteControl = remoteControl;
        remoteControl = newRemoteControl;
        boolean oldRemoteControlESet = remoteControlESet;
        remoteControlESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONTROL__REMOTE_CONTROL, oldRemoteControl, newRemoteControl, !oldRemoteControlESet );
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
    public void setRemoteControl( RemoteControl newRemoteControl ) {
        if( newRemoteControl != remoteControl ) {
            NotificationChain msgs = null;
            if( remoteControl != null ) msgs = ( ( InternalEObject ) remoteControl ).eInverseRemove( this,
                    CimPackage.REMOTE_CONTROL__CONTROL, RemoteControl.class, msgs );
            if( newRemoteControl != null ) msgs = ( ( InternalEObject ) newRemoteControl ).eInverseAdd( this,
                    CimPackage.REMOTE_CONTROL__CONTROL, RemoteControl.class, msgs );
            msgs = basicSetRemoteControl( newRemoteControl, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRemoteControlESet = remoteControlESet;
            remoteControlESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONTROL__REMOTE_CONTROL, newRemoteControl, newRemoteControl, !oldRemoteControlESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRemoteControl( NotificationChain msgs ) {
        RemoteControl oldRemoteControl = remoteControl;
        remoteControl = null;
        boolean oldRemoteControlESet = remoteControlESet;
        remoteControlESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONTROL__REMOTE_CONTROL, oldRemoteControl, null, oldRemoteControlESet );
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
    public void unsetRemoteControl() {
        if( remoteControl != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) remoteControl ).eInverseRemove( this, CimPackage.REMOTE_CONTROL__CONTROL,
                    RemoteControl.class, msgs );
            msgs = basicUnsetRemoteControl( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRemoteControlESet = remoteControlESet;
            remoteControlESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONTROL__REMOTE_CONTROL, null, null, oldRemoteControlESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRemoteControl() {
        return remoteControlESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.CONTROL__POWER_SYSTEM_RESOURCE:
            if( powerSystemResource != null ) msgs = ( ( InternalEObject ) powerSystemResource ).eInverseRemove( this,
                    CimPackage.POWER_SYSTEM_RESOURCE__CONTROLS, PowerSystemResource.class, msgs );
            return basicSetPowerSystemResource( ( PowerSystemResource ) otherEnd, msgs );
        case CimPackage.CONTROL__REMOTE_CONTROL:
            if( remoteControl != null ) msgs = ( ( InternalEObject ) remoteControl ).eInverseRemove( this,
                    CimPackage.REMOTE_CONTROL__CONTROL, RemoteControl.class, msgs );
            return basicSetRemoteControl( ( RemoteControl ) otherEnd, msgs );
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
        case CimPackage.CONTROL__POWER_SYSTEM_RESOURCE:
            return basicUnsetPowerSystemResource( msgs );
        case CimPackage.CONTROL__REMOTE_CONTROL:
            return basicUnsetRemoteControl( msgs );
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
        case CimPackage.CONTROL__CONTROL_TYPE:
            return getControlType();
        case CimPackage.CONTROL__OPERATION_IN_PROGRESS:
            return getOperationInProgress();
        case CimPackage.CONTROL__TIME_STAMP:
            return getTimeStamp();
        case CimPackage.CONTROL__UNIT_MULTIPLIER:
            return getUnitMultiplier();
        case CimPackage.CONTROL__UNIT_SYMBOL:
            return getUnitSymbol();
        case CimPackage.CONTROL__POWER_SYSTEM_RESOURCE:
            return getPowerSystemResource();
        case CimPackage.CONTROL__REMOTE_CONTROL:
            if( resolve ) return getRemoteControl();
            return basicGetRemoteControl();
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
        case CimPackage.CONTROL__CONTROL_TYPE:
            setControlType( ( String ) newValue );
            return;
        case CimPackage.CONTROL__OPERATION_IN_PROGRESS:
            setOperationInProgress( ( Boolean ) newValue );
            return;
        case CimPackage.CONTROL__TIME_STAMP:
            setTimeStamp( ( Date ) newValue );
            return;
        case CimPackage.CONTROL__UNIT_MULTIPLIER:
            setUnitMultiplier( ( UnitMultiplier ) newValue );
            return;
        case CimPackage.CONTROL__UNIT_SYMBOL:
            setUnitSymbol( ( UnitSymbol ) newValue );
            return;
        case CimPackage.CONTROL__POWER_SYSTEM_RESOURCE:
            setPowerSystemResource( ( PowerSystemResource ) newValue );
            return;
        case CimPackage.CONTROL__REMOTE_CONTROL:
            setRemoteControl( ( RemoteControl ) newValue );
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
        case CimPackage.CONTROL__CONTROL_TYPE:
            unsetControlType();
            return;
        case CimPackage.CONTROL__OPERATION_IN_PROGRESS:
            unsetOperationInProgress();
            return;
        case CimPackage.CONTROL__TIME_STAMP:
            unsetTimeStamp();
            return;
        case CimPackage.CONTROL__UNIT_MULTIPLIER:
            unsetUnitMultiplier();
            return;
        case CimPackage.CONTROL__UNIT_SYMBOL:
            unsetUnitSymbol();
            return;
        case CimPackage.CONTROL__POWER_SYSTEM_RESOURCE:
            unsetPowerSystemResource();
            return;
        case CimPackage.CONTROL__REMOTE_CONTROL:
            unsetRemoteControl();
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
        case CimPackage.CONTROL__CONTROL_TYPE:
            return isSetControlType();
        case CimPackage.CONTROL__OPERATION_IN_PROGRESS:
            return isSetOperationInProgress();
        case CimPackage.CONTROL__TIME_STAMP:
            return isSetTimeStamp();
        case CimPackage.CONTROL__UNIT_MULTIPLIER:
            return isSetUnitMultiplier();
        case CimPackage.CONTROL__UNIT_SYMBOL:
            return isSetUnitSymbol();
        case CimPackage.CONTROL__POWER_SYSTEM_RESOURCE:
            return isSetPowerSystemResource();
        case CimPackage.CONTROL__REMOTE_CONTROL:
            return isSetRemoteControl();
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
        result.append( " (controlType: " );
        if( controlTypeESet )
            result.append( controlType );
        else
            result.append( "<unset>" );
        result.append( ", operationInProgress: " );
        if( operationInProgressESet )
            result.append( operationInProgress );
        else
            result.append( "<unset>" );
        result.append( ", timeStamp: " );
        if( timeStampESet )
            result.append( timeStamp );
        else
            result.append( "<unset>" );
        result.append( ", unitMultiplier: " );
        if( unitMultiplierESet )
            result.append( unitMultiplier );
        else
            result.append( "<unset>" );
        result.append( ", unitSymbol: " );
        if( unitSymbolESet )
            result.append( unitSymbol );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ControlImpl
