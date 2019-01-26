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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Channel;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceFunction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeInterval;

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
 * An implementation of the model object '<em><b>Register</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RegisterImpl#getIsVirtual <em>Is Virtual</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RegisterImpl#getLeftDigitCount <em>Left Digit Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RegisterImpl#getRightDigitCount <em>Right Digit Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RegisterImpl#getTouTierName <em>Tou Tier Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RegisterImpl#getTouTier <em>Tou Tier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RegisterImpl#getEndDeviceFunction <em>End Device Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RegisterImpl#getChannels <em>Channels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegisterImpl extends IdentifiedObjectImpl implements Register {
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
     * The default value of the '{@link #getLeftDigitCount() <em>Left Digit Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLeftDigitCount()
     * @generated
     * @ordered
     */
    protected static final Integer LEFT_DIGIT_COUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLeftDigitCount() <em>Left Digit Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLeftDigitCount()
     * @generated
     * @ordered
     */
    protected Integer leftDigitCount = LEFT_DIGIT_COUNT_EDEFAULT;

    /**
     * This is true if the Left Digit Count attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean leftDigitCountESet;

    /**
     * The default value of the '{@link #getRightDigitCount() <em>Right Digit Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRightDigitCount()
     * @generated
     * @ordered
     */
    protected static final Integer RIGHT_DIGIT_COUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRightDigitCount() <em>Right Digit Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRightDigitCount()
     * @generated
     * @ordered
     */
    protected Integer rightDigitCount = RIGHT_DIGIT_COUNT_EDEFAULT;

    /**
     * This is true if the Right Digit Count attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rightDigitCountESet;

    /**
     * The default value of the '{@link #getTouTierName() <em>Tou Tier Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTouTierName()
     * @generated
     * @ordered
     */
    protected static final String TOU_TIER_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTouTierName() <em>Tou Tier Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTouTierName()
     * @generated
     * @ordered
     */
    protected String touTierName = TOU_TIER_NAME_EDEFAULT;

    /**
     * This is true if the Tou Tier Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean touTierNameESet;

    /**
     * The cached value of the '{@link #getTouTier() <em>Tou Tier</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTouTier()
     * @generated
     * @ordered
     */
    protected TimeInterval touTier;

    /**
     * This is true if the Tou Tier containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean touTierESet;

    /**
     * The cached value of the '{@link #getEndDeviceFunction() <em>End Device Function</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDeviceFunction()
     * @generated
     * @ordered
     */
    protected EndDeviceFunction endDeviceFunction;

    /**
     * This is true if the End Device Function reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean endDeviceFunctionESet;

    /**
     * The cached value of the '{@link #getChannels() <em>Channels</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChannels()
     * @generated
     * @ordered
     */
    protected EList< Channel > channels;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RegisterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getRegister();
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
                CimPackage.REGISTER__IS_VIRTUAL, oldIsVirtual, isVirtual, !oldIsVirtualESet ) );
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
                CimPackage.REGISTER__IS_VIRTUAL, oldIsVirtual, IS_VIRTUAL_EDEFAULT, oldIsVirtualESet ) );
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
    public Integer getLeftDigitCount() {
        return leftDigitCount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLeftDigitCount( Integer newLeftDigitCount ) {
        Integer oldLeftDigitCount = leftDigitCount;
        leftDigitCount = newLeftDigitCount;
        boolean oldLeftDigitCountESet = leftDigitCountESet;
        leftDigitCountESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.REGISTER__LEFT_DIGIT_COUNT, oldLeftDigitCount, leftDigitCount, !oldLeftDigitCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLeftDigitCount() {
        Integer oldLeftDigitCount = leftDigitCount;
        boolean oldLeftDigitCountESet = leftDigitCountESet;
        leftDigitCount = LEFT_DIGIT_COUNT_EDEFAULT;
        leftDigitCountESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.REGISTER__LEFT_DIGIT_COUNT,
                    oldLeftDigitCount, LEFT_DIGIT_COUNT_EDEFAULT, oldLeftDigitCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLeftDigitCount() {
        return leftDigitCountESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getRightDigitCount() {
        return rightDigitCount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRightDigitCount( Integer newRightDigitCount ) {
        Integer oldRightDigitCount = rightDigitCount;
        rightDigitCount = newRightDigitCount;
        boolean oldRightDigitCountESet = rightDigitCountESet;
        rightDigitCountESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.REGISTER__RIGHT_DIGIT_COUNT,
                    oldRightDigitCount, rightDigitCount, !oldRightDigitCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRightDigitCount() {
        Integer oldRightDigitCount = rightDigitCount;
        boolean oldRightDigitCountESet = rightDigitCountESet;
        rightDigitCount = RIGHT_DIGIT_COUNT_EDEFAULT;
        rightDigitCountESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.REGISTER__RIGHT_DIGIT_COUNT,
                    oldRightDigitCount, RIGHT_DIGIT_COUNT_EDEFAULT, oldRightDigitCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRightDigitCount() {
        return rightDigitCountESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getTouTierName() {
        return touTierName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTouTierName( String newTouTierName ) {
        String oldTouTierName = touTierName;
        touTierName = newTouTierName;
        boolean oldTouTierNameESet = touTierNameESet;
        touTierNameESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.REGISTER__TOU_TIER_NAME, oldTouTierName, touTierName, !oldTouTierNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTouTierName() {
        String oldTouTierName = touTierName;
        boolean oldTouTierNameESet = touTierNameESet;
        touTierName = TOU_TIER_NAME_EDEFAULT;
        touTierNameESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.REGISTER__TOU_TIER_NAME, oldTouTierName, TOU_TIER_NAME_EDEFAULT, oldTouTierNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTouTierName() {
        return touTierNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TimeInterval getTouTier() {
        return touTier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTouTier( TimeInterval newTouTier, NotificationChain msgs ) {
        TimeInterval oldTouTier = touTier;
        touTier = newTouTier;
        boolean oldTouTierESet = touTierESet;
        touTierESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.REGISTER__TOU_TIER, oldTouTier, newTouTier, !oldTouTierESet );
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
    public void setTouTier( TimeInterval newTouTier ) {
        if( newTouTier != touTier ) {
            NotificationChain msgs = null;
            if( touTier != null ) msgs = ( ( InternalEObject ) touTier ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.REGISTER__TOU_TIER, null, msgs );
            if( newTouTier != null ) msgs = ( ( InternalEObject ) newTouTier ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.REGISTER__TOU_TIER, null, msgs );
            msgs = basicSetTouTier( newTouTier, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTouTierESet = touTierESet;
            touTierESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.REGISTER__TOU_TIER, newTouTier, newTouTier, !oldTouTierESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTouTier( NotificationChain msgs ) {
        TimeInterval oldTouTier = touTier;
        touTier = null;
        boolean oldTouTierESet = touTierESet;
        touTierESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REGISTER__TOU_TIER, oldTouTier, null, oldTouTierESet );
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
    public void unsetTouTier() {
        if( touTier != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) touTier ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.REGISTER__TOU_TIER, null, msgs );
            msgs = basicUnsetTouTier( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTouTierESet = touTierESet;
            touTierESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REGISTER__TOU_TIER, null, null, oldTouTierESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTouTier() {
        return touTierESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EndDeviceFunction getEndDeviceFunction() {
        return endDeviceFunction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEndDeviceFunction( EndDeviceFunction newEndDeviceFunction,
            NotificationChain msgs ) {
        EndDeviceFunction oldEndDeviceFunction = endDeviceFunction;
        endDeviceFunction = newEndDeviceFunction;
        boolean oldEndDeviceFunctionESet = endDeviceFunctionESet;
        endDeviceFunctionESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.REGISTER__END_DEVICE_FUNCTION, oldEndDeviceFunction, newEndDeviceFunction,
                    !oldEndDeviceFunctionESet );
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
    public void setEndDeviceFunction( EndDeviceFunction newEndDeviceFunction ) {
        if( newEndDeviceFunction != endDeviceFunction ) {
            NotificationChain msgs = null;
            if( endDeviceFunction != null ) msgs = ( ( InternalEObject ) endDeviceFunction ).eInverseRemove( this,
                    CimPackage.END_DEVICE_FUNCTION__REGISTERS, EndDeviceFunction.class, msgs );
            if( newEndDeviceFunction != null ) msgs = ( ( InternalEObject ) newEndDeviceFunction ).eInverseAdd( this,
                    CimPackage.END_DEVICE_FUNCTION__REGISTERS, EndDeviceFunction.class, msgs );
            msgs = basicSetEndDeviceFunction( newEndDeviceFunction, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEndDeviceFunctionESet = endDeviceFunctionESet;
            endDeviceFunctionESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.REGISTER__END_DEVICE_FUNCTION,
                        newEndDeviceFunction, newEndDeviceFunction, !oldEndDeviceFunctionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEndDeviceFunction( NotificationChain msgs ) {
        EndDeviceFunction oldEndDeviceFunction = endDeviceFunction;
        endDeviceFunction = null;
        boolean oldEndDeviceFunctionESet = endDeviceFunctionESet;
        endDeviceFunctionESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REGISTER__END_DEVICE_FUNCTION, oldEndDeviceFunction, null, oldEndDeviceFunctionESet );
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
    public void unsetEndDeviceFunction() {
        if( endDeviceFunction != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) endDeviceFunction ).eInverseRemove( this,
                    CimPackage.END_DEVICE_FUNCTION__REGISTERS, EndDeviceFunction.class, msgs );
            msgs = basicUnsetEndDeviceFunction( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEndDeviceFunctionESet = endDeviceFunctionESet;
            endDeviceFunctionESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REGISTER__END_DEVICE_FUNCTION, null, null, oldEndDeviceFunctionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDeviceFunction() {
        return endDeviceFunctionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Channel > getChannels() {
        if( channels == null ) {
            channels = new EObjectWithInverseResolvingEList.Unsettable< Channel >( Channel.class, this,
                    CimPackage.REGISTER__CHANNELS, CimPackage.CHANNEL__REGISTER );
        }
        return channels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetChannels() {
        if( channels != null ) ( ( InternalEList.Unsettable< ? > ) channels ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetChannels() {
        return channels != null && ( ( InternalEList.Unsettable< ? > ) channels ).isSet();
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
        case CimPackage.REGISTER__END_DEVICE_FUNCTION:
            if( endDeviceFunction != null ) msgs = ( ( InternalEObject ) endDeviceFunction ).eInverseRemove( this,
                    CimPackage.END_DEVICE_FUNCTION__REGISTERS, EndDeviceFunction.class, msgs );
            return basicSetEndDeviceFunction( ( EndDeviceFunction ) otherEnd, msgs );
        case CimPackage.REGISTER__CHANNELS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getChannels() ).basicAdd( otherEnd,
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
        case CimPackage.REGISTER__TOU_TIER:
            return basicUnsetTouTier( msgs );
        case CimPackage.REGISTER__END_DEVICE_FUNCTION:
            return basicUnsetEndDeviceFunction( msgs );
        case CimPackage.REGISTER__CHANNELS:
            return ( ( InternalEList< ? > ) getChannels() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.REGISTER__IS_VIRTUAL:
            return getIsVirtual();
        case CimPackage.REGISTER__LEFT_DIGIT_COUNT:
            return getLeftDigitCount();
        case CimPackage.REGISTER__RIGHT_DIGIT_COUNT:
            return getRightDigitCount();
        case CimPackage.REGISTER__TOU_TIER_NAME:
            return getTouTierName();
        case CimPackage.REGISTER__TOU_TIER:
            return getTouTier();
        case CimPackage.REGISTER__END_DEVICE_FUNCTION:
            return getEndDeviceFunction();
        case CimPackage.REGISTER__CHANNELS:
            return getChannels();
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
        case CimPackage.REGISTER__IS_VIRTUAL:
            setIsVirtual( ( Boolean ) newValue );
            return;
        case CimPackage.REGISTER__LEFT_DIGIT_COUNT:
            setLeftDigitCount( ( Integer ) newValue );
            return;
        case CimPackage.REGISTER__RIGHT_DIGIT_COUNT:
            setRightDigitCount( ( Integer ) newValue );
            return;
        case CimPackage.REGISTER__TOU_TIER_NAME:
            setTouTierName( ( String ) newValue );
            return;
        case CimPackage.REGISTER__TOU_TIER:
            setTouTier( ( TimeInterval ) newValue );
            return;
        case CimPackage.REGISTER__END_DEVICE_FUNCTION:
            setEndDeviceFunction( ( EndDeviceFunction ) newValue );
            return;
        case CimPackage.REGISTER__CHANNELS:
            getChannels().clear();
            getChannels().addAll( ( Collection< ? extends Channel > ) newValue );
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
        case CimPackage.REGISTER__IS_VIRTUAL:
            unsetIsVirtual();
            return;
        case CimPackage.REGISTER__LEFT_DIGIT_COUNT:
            unsetLeftDigitCount();
            return;
        case CimPackage.REGISTER__RIGHT_DIGIT_COUNT:
            unsetRightDigitCount();
            return;
        case CimPackage.REGISTER__TOU_TIER_NAME:
            unsetTouTierName();
            return;
        case CimPackage.REGISTER__TOU_TIER:
            unsetTouTier();
            return;
        case CimPackage.REGISTER__END_DEVICE_FUNCTION:
            unsetEndDeviceFunction();
            return;
        case CimPackage.REGISTER__CHANNELS:
            unsetChannels();
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
        case CimPackage.REGISTER__IS_VIRTUAL:
            return isSetIsVirtual();
        case CimPackage.REGISTER__LEFT_DIGIT_COUNT:
            return isSetLeftDigitCount();
        case CimPackage.REGISTER__RIGHT_DIGIT_COUNT:
            return isSetRightDigitCount();
        case CimPackage.REGISTER__TOU_TIER_NAME:
            return isSetTouTierName();
        case CimPackage.REGISTER__TOU_TIER:
            return isSetTouTier();
        case CimPackage.REGISTER__END_DEVICE_FUNCTION:
            return isSetEndDeviceFunction();
        case CimPackage.REGISTER__CHANNELS:
            return isSetChannels();
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
        result.append( " (isVirtual: " );
        if( isVirtualESet )
            result.append( isVirtual );
        else
            result.append( "<unset>" );
        result.append( ", leftDigitCount: " );
        if( leftDigitCountESet )
            result.append( leftDigitCount );
        else
            result.append( "<unset>" );
        result.append( ", rightDigitCount: " );
        if( rightDigitCountESet )
            result.append( rightDigitCount );
        else
            result.append( "<unset>" );
        result.append( ", touTierName: " );
        if( touTierNameESet )
            result.append( touTierName );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //RegisterImpl
