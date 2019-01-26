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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupDispatch;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecast;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DemandResponseProgram;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceGroup;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Status;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Version;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Device Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceGroupImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceGroupImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceGroupImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceGroupImpl#getDERGroupForecast <em>DER Group Forecast</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceGroupImpl#getDERGroupDispatch <em>DER Group Dispatch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceGroupImpl#getDispatchablePowerCapability <em>Dispatchable Power Capability</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceGroupImpl#getOtherCapability <em>Other Capability</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceGroupImpl#getEndDeviceControls <em>End Device Controls</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceGroupImpl#getDemandResponsePrograms <em>Demand Response Programs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceGroupImpl#getEndDevices <em>End Devices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndDeviceGroupImpl extends IdentifiedObjectImpl implements EndDeviceGroup {
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
     * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatus()
     * @generated
     * @ordered
     */
    protected Status status;

    /**
     * This is true if the Status containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean statusESet;

    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected Version version;

    /**
     * This is true if the Version containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean versionESet;

    /**
     * The cached value of the '{@link #getDERGroupForecast() <em>DER Group Forecast</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDERGroupForecast()
     * @generated
     * @ordered
     */
    protected EList< DERGroupForecast > derGroupForecast;

    /**
     * The cached value of the '{@link #getDERGroupDispatch() <em>DER Group Dispatch</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDERGroupDispatch()
     * @generated
     * @ordered
     */
    protected EList< DERGroupDispatch > derGroupDispatch;

    /**
     * The cached value of the '{@link #getDispatchablePowerCapability() <em>Dispatchable Power Capability</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDispatchablePowerCapability()
     * @generated
     * @ordered
     */
    protected DispatchablePowerCapability dispatchablePowerCapability;

    /**
     * This is true if the Dispatchable Power Capability reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dispatchablePowerCapabilityESet;

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
     * The cached value of the '{@link #getEndDeviceControls() <em>End Device Controls</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDeviceControls()
     * @generated
     * @ordered
     */
    protected EList< EndDeviceControl > endDeviceControls;

    /**
     * The cached value of the '{@link #getDemandResponsePrograms() <em>Demand Response Programs</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDemandResponsePrograms()
     * @generated
     * @ordered
     */
    protected EList< DemandResponseProgram > demandResponsePrograms;

    /**
     * The cached value of the '{@link #getEndDevices() <em>End Devices</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDevices()
     * @generated
     * @ordered
     */
    protected EList< EndDevice > endDevices;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EndDeviceGroupImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getEndDeviceGroup();
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
                CimPackage.END_DEVICE_GROUP__TYPE, oldType, type, !oldTypeESet ) );
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
                CimPackage.END_DEVICE_GROUP__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet ) );
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
    public Status getStatus() {
        return status;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStatus( Status newStatus, NotificationChain msgs ) {
        Status oldStatus = status;
        status = newStatus;
        boolean oldStatusESet = statusESet;
        statusESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE_GROUP__STATUS, oldStatus, newStatus, !oldStatusESet );
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
    public void setStatus( Status newStatus ) {
        if( newStatus != status ) {
            NotificationChain msgs = null;
            if( status != null ) msgs = ( ( InternalEObject ) status ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.END_DEVICE_GROUP__STATUS, null, msgs );
            if( newStatus != null ) msgs = ( ( InternalEObject ) newStatus ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.END_DEVICE_GROUP__STATUS, null, msgs );
            msgs = basicSetStatus( newStatus, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStatusESet = statusESet;
            statusESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE_GROUP__STATUS, newStatus, newStatus, !oldStatusESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetStatus( NotificationChain msgs ) {
        Status oldStatus = status;
        status = null;
        boolean oldStatusESet = statusESet;
        statusESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_GROUP__STATUS, oldStatus, null, oldStatusESet );
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
    public void unsetStatus() {
        if( status != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) status ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.END_DEVICE_GROUP__STATUS, null, msgs );
            msgs = basicUnsetStatus( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStatusESet = statusESet;
            statusESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_GROUP__STATUS, null, null, oldStatusESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStatus() {
        return statusESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Version getVersion() {
        return version;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVersion( Version newVersion, NotificationChain msgs ) {
        Version oldVersion = version;
        version = newVersion;
        boolean oldVersionESet = versionESet;
        versionESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE_GROUP__VERSION, oldVersion, newVersion, !oldVersionESet );
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
    public void setVersion( Version newVersion ) {
        if( newVersion != version ) {
            NotificationChain msgs = null;
            if( version != null ) msgs = ( ( InternalEObject ) version ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.END_DEVICE_GROUP__VERSION, null, msgs );
            if( newVersion != null ) msgs = ( ( InternalEObject ) newVersion ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.END_DEVICE_GROUP__VERSION, null, msgs );
            msgs = basicSetVersion( newVersion, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVersionESet = versionESet;
            versionESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE_GROUP__VERSION, newVersion, newVersion, !oldVersionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetVersion( NotificationChain msgs ) {
        Version oldVersion = version;
        version = null;
        boolean oldVersionESet = versionESet;
        versionESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_GROUP__VERSION, oldVersion, null, oldVersionESet );
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
    public void unsetVersion() {
        if( version != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) version ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.END_DEVICE_GROUP__VERSION, null, msgs );
            msgs = basicUnsetVersion( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVersionESet = versionESet;
            versionESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_GROUP__VERSION, null, null, oldVersionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVersion() {
        return versionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DERGroupForecast > getDERGroupForecast() {
        if( derGroupForecast == null ) {
            derGroupForecast = new EObjectWithInverseEList.Unsettable.ManyInverse< DERGroupForecast >(
                    DERGroupForecast.class, this, CimPackage.END_DEVICE_GROUP__DER_GROUP_FORECAST,
                    CimPackage.DER_GROUP_FORECAST__END_DEVICE_GROUP );
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
    @Override
    public EList< DERGroupDispatch > getDERGroupDispatch() {
        if( derGroupDispatch == null ) {
            derGroupDispatch = new EObjectWithInverseEList.Unsettable.ManyInverse< DERGroupDispatch >(
                    DERGroupDispatch.class, this, CimPackage.END_DEVICE_GROUP__DER_GROUP_DISPATCH,
                    CimPackage.DER_GROUP_DISPATCH__END_DEVICE_GROUP );
        }
        return derGroupDispatch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDERGroupDispatch() {
        if( derGroupDispatch != null ) ( ( InternalEList.Unsettable< ? > ) derGroupDispatch ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDERGroupDispatch() {
        return derGroupDispatch != null && ( ( InternalEList.Unsettable< ? > ) derGroupDispatch ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DispatchablePowerCapability getDispatchablePowerCapability() {
        return dispatchablePowerCapability;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDispatchablePowerCapability(
            DispatchablePowerCapability newDispatchablePowerCapability, NotificationChain msgs ) {
        DispatchablePowerCapability oldDispatchablePowerCapability = dispatchablePowerCapability;
        dispatchablePowerCapability = newDispatchablePowerCapability;
        boolean oldDispatchablePowerCapabilityESet = dispatchablePowerCapabilityESet;
        dispatchablePowerCapabilityESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE_GROUP__DISPATCHABLE_POWER_CAPABILITY, oldDispatchablePowerCapability,
                    newDispatchablePowerCapability, !oldDispatchablePowerCapabilityESet );
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
    public void setDispatchablePowerCapability( DispatchablePowerCapability newDispatchablePowerCapability ) {
        if( newDispatchablePowerCapability != dispatchablePowerCapability ) {
            NotificationChain msgs = null;
            if( dispatchablePowerCapability != null )
                msgs = ( ( InternalEObject ) dispatchablePowerCapability ).eInverseRemove( this,
                        CimPackage.DISPATCHABLE_POWER_CAPABILITY__END_DEVICE_GROUP, DispatchablePowerCapability.class,
                        msgs );
            if( newDispatchablePowerCapability != null )
                msgs = ( ( InternalEObject ) newDispatchablePowerCapability ).eInverseAdd( this,
                        CimPackage.DISPATCHABLE_POWER_CAPABILITY__END_DEVICE_GROUP, DispatchablePowerCapability.class,
                        msgs );
            msgs = basicSetDispatchablePowerCapability( newDispatchablePowerCapability, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDispatchablePowerCapabilityESet = dispatchablePowerCapabilityESet;
            dispatchablePowerCapabilityESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE_GROUP__DISPATCHABLE_POWER_CAPABILITY, newDispatchablePowerCapability,
                    newDispatchablePowerCapability, !oldDispatchablePowerCapabilityESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetDispatchablePowerCapability( NotificationChain msgs ) {
        DispatchablePowerCapability oldDispatchablePowerCapability = dispatchablePowerCapability;
        dispatchablePowerCapability = null;
        boolean oldDispatchablePowerCapabilityESet = dispatchablePowerCapabilityESet;
        dispatchablePowerCapabilityESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_GROUP__DISPATCHABLE_POWER_CAPABILITY, oldDispatchablePowerCapability, null,
                    oldDispatchablePowerCapabilityESet );
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
    public void unsetDispatchablePowerCapability() {
        if( dispatchablePowerCapability != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) dispatchablePowerCapability ).eInverseRemove( this,
                    CimPackage.DISPATCHABLE_POWER_CAPABILITY__END_DEVICE_GROUP, DispatchablePowerCapability.class,
                    msgs );
            msgs = basicUnsetDispatchablePowerCapability( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDispatchablePowerCapabilityESet = dispatchablePowerCapabilityESet;
            dispatchablePowerCapabilityESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_GROUP__DISPATCHABLE_POWER_CAPABILITY, null, null,
                    oldDispatchablePowerCapabilityESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDispatchablePowerCapability() {
        return dispatchablePowerCapabilityESet;
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
                    this, CimPackage.END_DEVICE_GROUP__OTHER_CAPABILITY,
                    CimPackage.OTHER_CAPABILITY__END_DEVICE_GROUP );
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
    public EList< EndDeviceControl > getEndDeviceControls() {
        if( endDeviceControls == null ) {
            endDeviceControls = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< EndDeviceControl >(
                    EndDeviceControl.class, this, CimPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS,
                    CimPackage.END_DEVICE_CONTROL__END_DEVICE_GROUPS );
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
    public EList< DemandResponseProgram > getDemandResponsePrograms() {
        if( demandResponsePrograms == null ) {
            demandResponsePrograms = new EObjectWithInverseEList.Unsettable.ManyInverse< DemandResponseProgram >(
                    DemandResponseProgram.class, this, CimPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAMS,
                    CimPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS );
        }
        return demandResponsePrograms;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDemandResponsePrograms() {
        if( demandResponsePrograms != null ) ( ( InternalEList.Unsettable< ? > ) demandResponsePrograms ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDemandResponsePrograms() {
        return demandResponsePrograms != null && ( ( InternalEList.Unsettable< ? > ) demandResponsePrograms ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EndDevice > getEndDevices() {
        if( endDevices == null ) {
            endDevices = new EObjectWithInverseEList.Unsettable.ManyInverse< EndDevice >( EndDevice.class, this,
                    CimPackage.END_DEVICE_GROUP__END_DEVICES, CimPackage.END_DEVICE__END_DEVICE_GROUPS );
        }
        return endDevices;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndDevices() {
        if( endDevices != null ) ( ( InternalEList.Unsettable< ? > ) endDevices ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDevices() {
        return endDevices != null && ( ( InternalEList.Unsettable< ? > ) endDevices ).isSet();
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
        case CimPackage.END_DEVICE_GROUP__DER_GROUP_FORECAST:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDERGroupForecast() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.END_DEVICE_GROUP__DER_GROUP_DISPATCH:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDERGroupDispatch() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.END_DEVICE_GROUP__DISPATCHABLE_POWER_CAPABILITY:
            if( dispatchablePowerCapability != null )
                msgs = ( ( InternalEObject ) dispatchablePowerCapability ).eInverseRemove( this,
                        CimPackage.DISPATCHABLE_POWER_CAPABILITY__END_DEVICE_GROUP, DispatchablePowerCapability.class,
                        msgs );
            return basicSetDispatchablePowerCapability( ( DispatchablePowerCapability ) otherEnd, msgs );
        case CimPackage.END_DEVICE_GROUP__OTHER_CAPABILITY:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOtherCapability() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEndDeviceControls() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAMS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDemandResponsePrograms() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.END_DEVICE_GROUP__END_DEVICES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEndDevices() ).basicAdd( otherEnd,
                    msgs );
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
        case CimPackage.END_DEVICE_GROUP__STATUS:
            return basicUnsetStatus( msgs );
        case CimPackage.END_DEVICE_GROUP__VERSION:
            return basicUnsetVersion( msgs );
        case CimPackage.END_DEVICE_GROUP__DER_GROUP_FORECAST:
            return ( ( InternalEList< ? > ) getDERGroupForecast() ).basicRemove( otherEnd, msgs );
        case CimPackage.END_DEVICE_GROUP__DER_GROUP_DISPATCH:
            return ( ( InternalEList< ? > ) getDERGroupDispatch() ).basicRemove( otherEnd, msgs );
        case CimPackage.END_DEVICE_GROUP__DISPATCHABLE_POWER_CAPABILITY:
            return basicUnsetDispatchablePowerCapability( msgs );
        case CimPackage.END_DEVICE_GROUP__OTHER_CAPABILITY:
            return ( ( InternalEList< ? > ) getOtherCapability() ).basicRemove( otherEnd, msgs );
        case CimPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS:
            return ( ( InternalEList< ? > ) getEndDeviceControls() ).basicRemove( otherEnd, msgs );
        case CimPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAMS:
            return ( ( InternalEList< ? > ) getDemandResponsePrograms() ).basicRemove( otherEnd, msgs );
        case CimPackage.END_DEVICE_GROUP__END_DEVICES:
            return ( ( InternalEList< ? > ) getEndDevices() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.END_DEVICE_GROUP__TYPE:
            return getType();
        case CimPackage.END_DEVICE_GROUP__STATUS:
            return getStatus();
        case CimPackage.END_DEVICE_GROUP__VERSION:
            return getVersion();
        case CimPackage.END_DEVICE_GROUP__DER_GROUP_FORECAST:
            return getDERGroupForecast();
        case CimPackage.END_DEVICE_GROUP__DER_GROUP_DISPATCH:
            return getDERGroupDispatch();
        case CimPackage.END_DEVICE_GROUP__DISPATCHABLE_POWER_CAPABILITY:
            return getDispatchablePowerCapability();
        case CimPackage.END_DEVICE_GROUP__OTHER_CAPABILITY:
            return getOtherCapability();
        case CimPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS:
            return getEndDeviceControls();
        case CimPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAMS:
            return getDemandResponsePrograms();
        case CimPackage.END_DEVICE_GROUP__END_DEVICES:
            return getEndDevices();
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
        case CimPackage.END_DEVICE_GROUP__TYPE:
            setType( ( String ) newValue );
            return;
        case CimPackage.END_DEVICE_GROUP__STATUS:
            setStatus( ( Status ) newValue );
            return;
        case CimPackage.END_DEVICE_GROUP__VERSION:
            setVersion( ( Version ) newValue );
            return;
        case CimPackage.END_DEVICE_GROUP__DER_GROUP_FORECAST:
            getDERGroupForecast().clear();
            getDERGroupForecast().addAll( ( Collection< ? extends DERGroupForecast > ) newValue );
            return;
        case CimPackage.END_DEVICE_GROUP__DER_GROUP_DISPATCH:
            getDERGroupDispatch().clear();
            getDERGroupDispatch().addAll( ( Collection< ? extends DERGroupDispatch > ) newValue );
            return;
        case CimPackage.END_DEVICE_GROUP__DISPATCHABLE_POWER_CAPABILITY:
            setDispatchablePowerCapability( ( DispatchablePowerCapability ) newValue );
            return;
        case CimPackage.END_DEVICE_GROUP__OTHER_CAPABILITY:
            getOtherCapability().clear();
            getOtherCapability().addAll( ( Collection< ? extends OtherCapability > ) newValue );
            return;
        case CimPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS:
            getEndDeviceControls().clear();
            getEndDeviceControls().addAll( ( Collection< ? extends EndDeviceControl > ) newValue );
            return;
        case CimPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAMS:
            getDemandResponsePrograms().clear();
            getDemandResponsePrograms().addAll( ( Collection< ? extends DemandResponseProgram > ) newValue );
            return;
        case CimPackage.END_DEVICE_GROUP__END_DEVICES:
            getEndDevices().clear();
            getEndDevices().addAll( ( Collection< ? extends EndDevice > ) newValue );
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
        case CimPackage.END_DEVICE_GROUP__TYPE:
            unsetType();
            return;
        case CimPackage.END_DEVICE_GROUP__STATUS:
            unsetStatus();
            return;
        case CimPackage.END_DEVICE_GROUP__VERSION:
            unsetVersion();
            return;
        case CimPackage.END_DEVICE_GROUP__DER_GROUP_FORECAST:
            unsetDERGroupForecast();
            return;
        case CimPackage.END_DEVICE_GROUP__DER_GROUP_DISPATCH:
            unsetDERGroupDispatch();
            return;
        case CimPackage.END_DEVICE_GROUP__DISPATCHABLE_POWER_CAPABILITY:
            unsetDispatchablePowerCapability();
            return;
        case CimPackage.END_DEVICE_GROUP__OTHER_CAPABILITY:
            unsetOtherCapability();
            return;
        case CimPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS:
            unsetEndDeviceControls();
            return;
        case CimPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAMS:
            unsetDemandResponsePrograms();
            return;
        case CimPackage.END_DEVICE_GROUP__END_DEVICES:
            unsetEndDevices();
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
        case CimPackage.END_DEVICE_GROUP__TYPE:
            return isSetType();
        case CimPackage.END_DEVICE_GROUP__STATUS:
            return isSetStatus();
        case CimPackage.END_DEVICE_GROUP__VERSION:
            return isSetVersion();
        case CimPackage.END_DEVICE_GROUP__DER_GROUP_FORECAST:
            return isSetDERGroupForecast();
        case CimPackage.END_DEVICE_GROUP__DER_GROUP_DISPATCH:
            return isSetDERGroupDispatch();
        case CimPackage.END_DEVICE_GROUP__DISPATCHABLE_POWER_CAPABILITY:
            return isSetDispatchablePowerCapability();
        case CimPackage.END_DEVICE_GROUP__OTHER_CAPABILITY:
            return isSetOtherCapability();
        case CimPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS:
            return isSetEndDeviceControls();
        case CimPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAMS:
            return isSetDemandResponsePrograms();
        case CimPackage.END_DEVICE_GROUP__END_DEVICES:
            return isSetEndDevices();
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
        result.append( " (type: " );
        if( typeESet )
            result.append( type );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //EndDeviceGroupImpl
