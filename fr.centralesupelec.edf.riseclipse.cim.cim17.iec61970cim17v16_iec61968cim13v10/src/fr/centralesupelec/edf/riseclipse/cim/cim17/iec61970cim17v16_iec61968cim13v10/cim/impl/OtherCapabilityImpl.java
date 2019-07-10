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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceGroup;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions;

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
 * An implementation of the model object '<em><b>Other Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OtherCapabilityImpl#getCapabilitySubType <em>Capability Sub Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OtherCapabilityImpl#getCapabilityType <em>Capability Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OtherCapabilityImpl#getCapabilityUnits <em>Capability Units</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OtherCapabilityImpl#getCapabilityValue <em>Capability Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OtherCapabilityImpl#getEndDeviceGroup <em>End Device Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OtherCapabilityImpl#getEndDevice <em>End Device</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OtherCapabilityImpl#getDERGroupForecast <em>DER Group Forecast</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OtherCapabilityImpl extends DERCapabilitiesImpl implements OtherCapability {
    /**
     * The default value of the '{@link #getCapabilitySubType() <em>Capability Sub Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapabilitySubType()
     * @generated
     * @ordered
     */
    protected static final String CAPABILITY_SUB_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCapabilitySubType() <em>Capability Sub Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapabilitySubType()
     * @generated
     * @ordered
     */
    protected String capabilitySubType = CAPABILITY_SUB_TYPE_EDEFAULT;

    /**
     * This is true if the Capability Sub Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean capabilitySubTypeESet;

    /**
     * The default value of the '{@link #getCapabilityType() <em>Capability Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapabilityType()
     * @generated
     * @ordered
     */
    protected static final String CAPABILITY_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCapabilityType() <em>Capability Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapabilityType()
     * @generated
     * @ordered
     */
    protected String capabilityType = CAPABILITY_TYPE_EDEFAULT;

    /**
     * This is true if the Capability Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean capabilityTypeESet;

    /**
     * The default value of the '{@link #getCapabilityUnits() <em>Capability Units</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapabilityUnits()
     * @generated
     * @ordered
     */
    protected static final String CAPABILITY_UNITS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCapabilityUnits() <em>Capability Units</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapabilityUnits()
     * @generated
     * @ordered
     */
    protected String capabilityUnits = CAPABILITY_UNITS_EDEFAULT;

    /**
     * This is true if the Capability Units attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean capabilityUnitsESet;

    /**
     * The default value of the '{@link #getCapabilityValue() <em>Capability Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapabilityValue()
     * @generated
     * @ordered
     */
    protected static final String CAPABILITY_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCapabilityValue() <em>Capability Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapabilityValue()
     * @generated
     * @ordered
     */
    protected String capabilityValue = CAPABILITY_VALUE_EDEFAULT;

    /**
     * This is true if the Capability Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean capabilityValueESet;

    /**
     * The cached value of the '{@link #getEndDeviceGroup() <em>End Device Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDeviceGroup()
     * @generated
     * @ordered
     */
    protected EndDeviceGroup endDeviceGroup;

    /**
     * This is true if the End Device Group reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean endDeviceGroupESet;

    /**
     * The cached value of the '{@link #getEndDevice() <em>End Device</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDevice()
     * @generated
     * @ordered
     */
    protected EndDevice endDevice;

    /**
     * This is true if the End Device reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean endDeviceESet;

    /**
     * The cached value of the '{@link #getDERGroupForecast() <em>DER Group Forecast</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDERGroupForecast()
     * @generated
     * @ordered
     */
    protected EList< Predictions > derGroupForecast;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OtherCapabilityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getOtherCapability();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCapabilitySubType() {
        return capabilitySubType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCapabilitySubType( String newCapabilitySubType ) {
        String oldCapabilitySubType = capabilitySubType;
        capabilitySubType = newCapabilitySubType;
        boolean oldCapabilitySubTypeESet = capabilitySubTypeESet;
        capabilitySubTypeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OTHER_CAPABILITY__CAPABILITY_SUB_TYPE,
                    oldCapabilitySubType, capabilitySubType, !oldCapabilitySubTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCapabilitySubType() {
        String oldCapabilitySubType = capabilitySubType;
        boolean oldCapabilitySubTypeESet = capabilitySubTypeESet;
        capabilitySubType = CAPABILITY_SUB_TYPE_EDEFAULT;
        capabilitySubTypeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OTHER_CAPABILITY__CAPABILITY_SUB_TYPE,
                    oldCapabilitySubType, CAPABILITY_SUB_TYPE_EDEFAULT, oldCapabilitySubTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCapabilitySubType() {
        return capabilitySubTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCapabilityType() {
        return capabilityType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCapabilityType( String newCapabilityType ) {
        String oldCapabilityType = capabilityType;
        capabilityType = newCapabilityType;
        boolean oldCapabilityTypeESet = capabilityTypeESet;
        capabilityTypeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OTHER_CAPABILITY__CAPABILITY_TYPE,
                    oldCapabilityType, capabilityType, !oldCapabilityTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCapabilityType() {
        String oldCapabilityType = capabilityType;
        boolean oldCapabilityTypeESet = capabilityTypeESet;
        capabilityType = CAPABILITY_TYPE_EDEFAULT;
        capabilityTypeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OTHER_CAPABILITY__CAPABILITY_TYPE,
                    oldCapabilityType, CAPABILITY_TYPE_EDEFAULT, oldCapabilityTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCapabilityType() {
        return capabilityTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCapabilityUnits() {
        return capabilityUnits;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCapabilityUnits( String newCapabilityUnits ) {
        String oldCapabilityUnits = capabilityUnits;
        capabilityUnits = newCapabilityUnits;
        boolean oldCapabilityUnitsESet = capabilityUnitsESet;
        capabilityUnitsESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OTHER_CAPABILITY__CAPABILITY_UNITS,
                    oldCapabilityUnits, capabilityUnits, !oldCapabilityUnitsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCapabilityUnits() {
        String oldCapabilityUnits = capabilityUnits;
        boolean oldCapabilityUnitsESet = capabilityUnitsESet;
        capabilityUnits = CAPABILITY_UNITS_EDEFAULT;
        capabilityUnitsESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OTHER_CAPABILITY__CAPABILITY_UNITS,
                    oldCapabilityUnits, CAPABILITY_UNITS_EDEFAULT, oldCapabilityUnitsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCapabilityUnits() {
        return capabilityUnitsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCapabilityValue() {
        return capabilityValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCapabilityValue( String newCapabilityValue ) {
        String oldCapabilityValue = capabilityValue;
        capabilityValue = newCapabilityValue;
        boolean oldCapabilityValueESet = capabilityValueESet;
        capabilityValueESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OTHER_CAPABILITY__CAPABILITY_VALUE,
                    oldCapabilityValue, capabilityValue, !oldCapabilityValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCapabilityValue() {
        String oldCapabilityValue = capabilityValue;
        boolean oldCapabilityValueESet = capabilityValueESet;
        capabilityValue = CAPABILITY_VALUE_EDEFAULT;
        capabilityValueESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OTHER_CAPABILITY__CAPABILITY_VALUE,
                    oldCapabilityValue, CAPABILITY_VALUE_EDEFAULT, oldCapabilityValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCapabilityValue() {
        return capabilityValueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EndDeviceGroup getEndDeviceGroup() {
        return endDeviceGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEndDeviceGroup( EndDeviceGroup newEndDeviceGroup, NotificationChain msgs ) {
        EndDeviceGroup oldEndDeviceGroup = endDeviceGroup;
        endDeviceGroup = newEndDeviceGroup;
        boolean oldEndDeviceGroupESet = endDeviceGroupESet;
        endDeviceGroupESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.OTHER_CAPABILITY__END_DEVICE_GROUP, oldEndDeviceGroup, newEndDeviceGroup,
                    !oldEndDeviceGroupESet );
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
    public void setEndDeviceGroup( EndDeviceGroup newEndDeviceGroup ) {
        if( newEndDeviceGroup != endDeviceGroup ) {
            NotificationChain msgs = null;
            if( endDeviceGroup != null ) msgs = ( ( InternalEObject ) endDeviceGroup ).eInverseRemove( this,
                    CimPackage.END_DEVICE_GROUP__OTHER_CAPABILITY, EndDeviceGroup.class, msgs );
            if( newEndDeviceGroup != null ) msgs = ( ( InternalEObject ) newEndDeviceGroup ).eInverseAdd( this,
                    CimPackage.END_DEVICE_GROUP__OTHER_CAPABILITY, EndDeviceGroup.class, msgs );
            msgs = basicSetEndDeviceGroup( newEndDeviceGroup, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEndDeviceGroupESet = endDeviceGroupESet;
            endDeviceGroupESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OTHER_CAPABILITY__END_DEVICE_GROUP,
                        newEndDeviceGroup, newEndDeviceGroup, !oldEndDeviceGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEndDeviceGroup( NotificationChain msgs ) {
        EndDeviceGroup oldEndDeviceGroup = endDeviceGroup;
        endDeviceGroup = null;
        boolean oldEndDeviceGroupESet = endDeviceGroupESet;
        endDeviceGroupESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OTHER_CAPABILITY__END_DEVICE_GROUP, oldEndDeviceGroup, null, oldEndDeviceGroupESet );
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
    public void unsetEndDeviceGroup() {
        if( endDeviceGroup != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) endDeviceGroup ).eInverseRemove( this,
                    CimPackage.END_DEVICE_GROUP__OTHER_CAPABILITY, EndDeviceGroup.class, msgs );
            msgs = basicUnsetEndDeviceGroup( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEndDeviceGroupESet = endDeviceGroupESet;
            endDeviceGroupESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OTHER_CAPABILITY__END_DEVICE_GROUP, null, null, oldEndDeviceGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDeviceGroup() {
        return endDeviceGroupESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EndDevice getEndDevice() {
        return endDevice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEndDevice( EndDevice newEndDevice, NotificationChain msgs ) {
        EndDevice oldEndDevice = endDevice;
        endDevice = newEndDevice;
        boolean oldEndDeviceESet = endDeviceESet;
        endDeviceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.OTHER_CAPABILITY__END_DEVICE, oldEndDevice, newEndDevice, !oldEndDeviceESet );
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
    public void setEndDevice( EndDevice newEndDevice ) {
        if( newEndDevice != endDevice ) {
            NotificationChain msgs = null;
            if( endDevice != null ) msgs = ( ( InternalEObject ) endDevice ).eInverseRemove( this,
                    CimPackage.END_DEVICE__OTHER_CAPABILITY, EndDevice.class, msgs );
            if( newEndDevice != null ) msgs = ( ( InternalEObject ) newEndDevice ).eInverseAdd( this,
                    CimPackage.END_DEVICE__OTHER_CAPABILITY, EndDevice.class, msgs );
            msgs = basicSetEndDevice( newEndDevice, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEndDeviceESet = endDeviceESet;
            endDeviceESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.OTHER_CAPABILITY__END_DEVICE, newEndDevice, newEndDevice, !oldEndDeviceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEndDevice( NotificationChain msgs ) {
        EndDevice oldEndDevice = endDevice;
        endDevice = null;
        boolean oldEndDeviceESet = endDeviceESet;
        endDeviceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OTHER_CAPABILITY__END_DEVICE, oldEndDevice, null, oldEndDeviceESet );
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
    public void unsetEndDevice() {
        if( endDevice != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) endDevice ).eInverseRemove( this, CimPackage.END_DEVICE__OTHER_CAPABILITY,
                    EndDevice.class, msgs );
            msgs = basicUnsetEndDevice( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEndDeviceESet = endDeviceESet;
            endDeviceESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OTHER_CAPABILITY__END_DEVICE, null, null, oldEndDeviceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDevice() {
        return endDeviceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Predictions > getDERGroupForecast() {
        if( derGroupForecast == null ) {
            derGroupForecast = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< Predictions >(
                    Predictions.class, this, CimPackage.OTHER_CAPABILITY__DER_GROUP_FORECAST,
                    CimPackage.PREDICTIONS__OTHER_CAPABILITY );
        }
        return derGroupForecast;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDERGroupForecast() {
        if( derGroupForecast != null ) ( ( InternalEList.Unsettable< ? > ) derGroupForecast ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDERGroupForecast() {
        return derGroupForecast != null && ( ( InternalEList.Unsettable< ? > ) derGroupForecast ).isSet();
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
        case CimPackage.OTHER_CAPABILITY__END_DEVICE_GROUP:
            if( endDeviceGroup != null ) msgs = ( ( InternalEObject ) endDeviceGroup ).eInverseRemove( this,
                    CimPackage.END_DEVICE_GROUP__OTHER_CAPABILITY, EndDeviceGroup.class, msgs );
            return basicSetEndDeviceGroup( ( EndDeviceGroup ) otherEnd, msgs );
        case CimPackage.OTHER_CAPABILITY__END_DEVICE:
            if( endDevice != null ) msgs = ( ( InternalEObject ) endDevice ).eInverseRemove( this,
                    CimPackage.END_DEVICE__OTHER_CAPABILITY, EndDevice.class, msgs );
            return basicSetEndDevice( ( EndDevice ) otherEnd, msgs );
        case CimPackage.OTHER_CAPABILITY__DER_GROUP_FORECAST:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDERGroupForecast() )
                    .basicAdd( otherEnd, msgs );
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
        case CimPackage.OTHER_CAPABILITY__END_DEVICE_GROUP:
            return basicUnsetEndDeviceGroup( msgs );
        case CimPackage.OTHER_CAPABILITY__END_DEVICE:
            return basicUnsetEndDevice( msgs );
        case CimPackage.OTHER_CAPABILITY__DER_GROUP_FORECAST:
            return ( ( InternalEList< ? > ) getDERGroupForecast() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.OTHER_CAPABILITY__CAPABILITY_SUB_TYPE:
            return getCapabilitySubType();
        case CimPackage.OTHER_CAPABILITY__CAPABILITY_TYPE:
            return getCapabilityType();
        case CimPackage.OTHER_CAPABILITY__CAPABILITY_UNITS:
            return getCapabilityUnits();
        case CimPackage.OTHER_CAPABILITY__CAPABILITY_VALUE:
            return getCapabilityValue();
        case CimPackage.OTHER_CAPABILITY__END_DEVICE_GROUP:
            return getEndDeviceGroup();
        case CimPackage.OTHER_CAPABILITY__END_DEVICE:
            return getEndDevice();
        case CimPackage.OTHER_CAPABILITY__DER_GROUP_FORECAST:
            return getDERGroupForecast();
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
        case CimPackage.OTHER_CAPABILITY__CAPABILITY_SUB_TYPE:
            setCapabilitySubType( ( String ) newValue );
            return;
        case CimPackage.OTHER_CAPABILITY__CAPABILITY_TYPE:
            setCapabilityType( ( String ) newValue );
            return;
        case CimPackage.OTHER_CAPABILITY__CAPABILITY_UNITS:
            setCapabilityUnits( ( String ) newValue );
            return;
        case CimPackage.OTHER_CAPABILITY__CAPABILITY_VALUE:
            setCapabilityValue( ( String ) newValue );
            return;
        case CimPackage.OTHER_CAPABILITY__END_DEVICE_GROUP:
            setEndDeviceGroup( ( EndDeviceGroup ) newValue );
            return;
        case CimPackage.OTHER_CAPABILITY__END_DEVICE:
            setEndDevice( ( EndDevice ) newValue );
            return;
        case CimPackage.OTHER_CAPABILITY__DER_GROUP_FORECAST:
            getDERGroupForecast().clear();
            getDERGroupForecast().addAll( ( Collection< ? extends Predictions > ) newValue );
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
        case CimPackage.OTHER_CAPABILITY__CAPABILITY_SUB_TYPE:
            unsetCapabilitySubType();
            return;
        case CimPackage.OTHER_CAPABILITY__CAPABILITY_TYPE:
            unsetCapabilityType();
            return;
        case CimPackage.OTHER_CAPABILITY__CAPABILITY_UNITS:
            unsetCapabilityUnits();
            return;
        case CimPackage.OTHER_CAPABILITY__CAPABILITY_VALUE:
            unsetCapabilityValue();
            return;
        case CimPackage.OTHER_CAPABILITY__END_DEVICE_GROUP:
            unsetEndDeviceGroup();
            return;
        case CimPackage.OTHER_CAPABILITY__END_DEVICE:
            unsetEndDevice();
            return;
        case CimPackage.OTHER_CAPABILITY__DER_GROUP_FORECAST:
            unsetDERGroupForecast();
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
        case CimPackage.OTHER_CAPABILITY__CAPABILITY_SUB_TYPE:
            return isSetCapabilitySubType();
        case CimPackage.OTHER_CAPABILITY__CAPABILITY_TYPE:
            return isSetCapabilityType();
        case CimPackage.OTHER_CAPABILITY__CAPABILITY_UNITS:
            return isSetCapabilityUnits();
        case CimPackage.OTHER_CAPABILITY__CAPABILITY_VALUE:
            return isSetCapabilityValue();
        case CimPackage.OTHER_CAPABILITY__END_DEVICE_GROUP:
            return isSetEndDeviceGroup();
        case CimPackage.OTHER_CAPABILITY__END_DEVICE:
            return isSetEndDevice();
        case CimPackage.OTHER_CAPABILITY__DER_GROUP_FORECAST:
            return isSetDERGroupForecast();
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
        result.append( " (capabilitySubType: " );
        if( capabilitySubTypeESet )
            result.append( capabilitySubType );
        else
            result.append( "<unset>" );
        result.append( ", capabilityType: " );
        if( capabilityTypeESet )
            result.append( capabilityType );
        else
            result.append( "<unset>" );
        result.append( ", capabilityUnits: " );
        if( capabilityUnitsESet )
            result.append( capabilityUnits );
        else
            result.append( "<unset>" );
        result.append( ", capabilityValue: " );
        if( capabilityValueESet )
            result.append( capabilityValue );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //OtherCapabilityImpl
