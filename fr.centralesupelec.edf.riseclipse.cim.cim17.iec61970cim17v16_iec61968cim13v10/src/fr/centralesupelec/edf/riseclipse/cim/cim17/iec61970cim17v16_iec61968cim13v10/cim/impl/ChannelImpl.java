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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Channel;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingType;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Register;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ChannelImpl#getIsVirtual <em>Is Virtual</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ChannelImpl#getReadingType <em>Reading Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ChannelImpl#getRegister <em>Register</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChannelImpl extends IdentifiedObjectImpl implements Channel {
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
     * The cached value of the '{@link #getReadingType() <em>Reading Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadingType()
     * @generated
     * @ordered
     */
    protected ReadingType readingType;

    /**
     * This is true if the Reading Type reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean readingTypeESet;

    /**
     * The cached value of the '{@link #getRegister() <em>Register</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegister()
     * @generated
     * @ordered
     */
    protected Register register;

    /**
     * This is true if the Register reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean registerESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChannelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getChannel();
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
                CimPackage.CHANNEL__IS_VIRTUAL, oldIsVirtual, isVirtual, !oldIsVirtualESet ) );
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
                CimPackage.CHANNEL__IS_VIRTUAL, oldIsVirtual, IS_VIRTUAL_EDEFAULT, oldIsVirtualESet ) );
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
    public ReadingType getReadingType() {
        if( readingType != null && readingType.eIsProxy() ) {
            InternalEObject oldReadingType = ( InternalEObject ) readingType;
            readingType = ( ReadingType ) eResolveProxy( oldReadingType );
            if( readingType != oldReadingType ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.CHANNEL__READING_TYPE, oldReadingType, readingType ) );
            }
        }
        return readingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReadingType basicGetReadingType() {
        return readingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReadingType( ReadingType newReadingType, NotificationChain msgs ) {
        ReadingType oldReadingType = readingType;
        readingType = newReadingType;
        boolean oldReadingTypeESet = readingTypeESet;
        readingTypeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CHANNEL__READING_TYPE, oldReadingType, newReadingType, !oldReadingTypeESet );
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
    public void setReadingType( ReadingType newReadingType ) {
        if( newReadingType != readingType ) {
            NotificationChain msgs = null;
            if( readingType != null ) msgs = ( ( InternalEObject ) readingType ).eInverseRemove( this,
                    CimPackage.READING_TYPE__CHANNEL, ReadingType.class, msgs );
            if( newReadingType != null ) msgs = ( ( InternalEObject ) newReadingType ).eInverseAdd( this,
                    CimPackage.READING_TYPE__CHANNEL, ReadingType.class, msgs );
            msgs = basicSetReadingType( newReadingType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReadingTypeESet = readingTypeESet;
            readingTypeESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CHANNEL__READING_TYPE, newReadingType, newReadingType, !oldReadingTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetReadingType( NotificationChain msgs ) {
        ReadingType oldReadingType = readingType;
        readingType = null;
        boolean oldReadingTypeESet = readingTypeESet;
        readingTypeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CHANNEL__READING_TYPE, oldReadingType, null, oldReadingTypeESet );
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
    public void unsetReadingType() {
        if( readingType != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) readingType ).eInverseRemove( this, CimPackage.READING_TYPE__CHANNEL,
                    ReadingType.class, msgs );
            msgs = basicUnsetReadingType( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReadingTypeESet = readingTypeESet;
            readingTypeESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CHANNEL__READING_TYPE, null, null, oldReadingTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReadingType() {
        return readingTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Register getRegister() {
        return register;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRegister( Register newRegister, NotificationChain msgs ) {
        Register oldRegister = register;
        register = newRegister;
        boolean oldRegisterESet = registerESet;
        registerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CHANNEL__REGISTER, oldRegister, newRegister, !oldRegisterESet );
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
    public void setRegister( Register newRegister ) {
        if( newRegister != register ) {
            NotificationChain msgs = null;
            if( register != null ) msgs = ( ( InternalEObject ) register ).eInverseRemove( this,
                    CimPackage.REGISTER__CHANNELS, Register.class, msgs );
            if( newRegister != null ) msgs = ( ( InternalEObject ) newRegister ).eInverseAdd( this,
                    CimPackage.REGISTER__CHANNELS, Register.class, msgs );
            msgs = basicSetRegister( newRegister, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRegisterESet = registerESet;
            registerESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CHANNEL__REGISTER, newRegister, newRegister, !oldRegisterESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRegister( NotificationChain msgs ) {
        Register oldRegister = register;
        register = null;
        boolean oldRegisterESet = registerESet;
        registerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CHANNEL__REGISTER, oldRegister, null, oldRegisterESet );
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
    public void unsetRegister() {
        if( register != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) register ).eInverseRemove( this, CimPackage.REGISTER__CHANNELS, Register.class,
                    msgs );
            msgs = basicUnsetRegister( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRegisterESet = registerESet;
            registerESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CHANNEL__REGISTER, null, null, oldRegisterESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRegister() {
        return registerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.CHANNEL__READING_TYPE:
            if( readingType != null ) msgs = ( ( InternalEObject ) readingType ).eInverseRemove( this,
                    CimPackage.READING_TYPE__CHANNEL, ReadingType.class, msgs );
            return basicSetReadingType( ( ReadingType ) otherEnd, msgs );
        case CimPackage.CHANNEL__REGISTER:
            if( register != null ) msgs = ( ( InternalEObject ) register ).eInverseRemove( this,
                    CimPackage.REGISTER__CHANNELS, Register.class, msgs );
            return basicSetRegister( ( Register ) otherEnd, msgs );
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
        case CimPackage.CHANNEL__READING_TYPE:
            return basicUnsetReadingType( msgs );
        case CimPackage.CHANNEL__REGISTER:
            return basicUnsetRegister( msgs );
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
        case CimPackage.CHANNEL__IS_VIRTUAL:
            return getIsVirtual();
        case CimPackage.CHANNEL__READING_TYPE:
            if( resolve ) return getReadingType();
            return basicGetReadingType();
        case CimPackage.CHANNEL__REGISTER:
            return getRegister();
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
        case CimPackage.CHANNEL__IS_VIRTUAL:
            setIsVirtual( ( Boolean ) newValue );
            return;
        case CimPackage.CHANNEL__READING_TYPE:
            setReadingType( ( ReadingType ) newValue );
            return;
        case CimPackage.CHANNEL__REGISTER:
            setRegister( ( Register ) newValue );
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
        case CimPackage.CHANNEL__IS_VIRTUAL:
            unsetIsVirtual();
            return;
        case CimPackage.CHANNEL__READING_TYPE:
            unsetReadingType();
            return;
        case CimPackage.CHANNEL__REGISTER:
            unsetRegister();
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
        case CimPackage.CHANNEL__IS_VIRTUAL:
            return isSetIsVirtual();
        case CimPackage.CHANNEL__READING_TYPE:
            return isSetReadingType();
        case CimPackage.CHANNEL__REGISTER:
            return isSetRegister();
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
        result.append( ')' );
        return result.toString();
    }

} //ChannelImpl
