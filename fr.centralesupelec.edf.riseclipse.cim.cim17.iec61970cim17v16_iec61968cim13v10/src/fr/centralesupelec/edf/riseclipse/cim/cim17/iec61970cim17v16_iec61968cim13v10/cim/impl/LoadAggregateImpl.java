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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadAggregate;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Aggregate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadAggregateImpl#getLoadStatic <em>Load Static</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadAggregateImpl#getLoadMotor <em>Load Motor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadAggregateImpl extends LoadDynamicsImpl implements LoadAggregate {
    /**
     * The cached value of the '{@link #getLoadStatic() <em>Load Static</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoadStatic()
     * @generated
     * @ordered
     */
    protected LoadStatic loadStatic;

    /**
     * This is true if the Load Static reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean loadStaticESet;

    /**
     * The cached value of the '{@link #getLoadMotor() <em>Load Motor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoadMotor()
     * @generated
     * @ordered
     */
    protected LoadMotor loadMotor;

    /**
     * This is true if the Load Motor reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean loadMotorESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LoadAggregateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getLoadAggregate();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoadStatic getLoadStatic() {
        if( loadStatic != null && loadStatic.eIsProxy() ) {
            InternalEObject oldLoadStatic = ( InternalEObject ) loadStatic;
            loadStatic = ( LoadStatic ) eResolveProxy( oldLoadStatic );
            if( loadStatic != oldLoadStatic ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.LOAD_AGGREGATE__LOAD_STATIC, oldLoadStatic, loadStatic ) );
            }
        }
        return loadStatic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LoadStatic basicGetLoadStatic() {
        return loadStatic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLoadStatic( LoadStatic newLoadStatic, NotificationChain msgs ) {
        LoadStatic oldLoadStatic = loadStatic;
        loadStatic = newLoadStatic;
        boolean oldLoadStaticESet = loadStaticESet;
        loadStaticESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.LOAD_AGGREGATE__LOAD_STATIC, oldLoadStatic, newLoadStatic, !oldLoadStaticESet );
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
    public void setLoadStatic( LoadStatic newLoadStatic ) {
        if( newLoadStatic != loadStatic ) {
            NotificationChain msgs = null;
            if( loadStatic != null ) msgs = ( ( InternalEObject ) loadStatic ).eInverseRemove( this,
                    CimPackage.LOAD_STATIC__LOAD_AGGREGATE, LoadStatic.class, msgs );
            if( newLoadStatic != null ) msgs = ( ( InternalEObject ) newLoadStatic ).eInverseAdd( this,
                    CimPackage.LOAD_STATIC__LOAD_AGGREGATE, LoadStatic.class, msgs );
            msgs = basicSetLoadStatic( newLoadStatic, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLoadStaticESet = loadStaticESet;
            loadStaticESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.LOAD_AGGREGATE__LOAD_STATIC, newLoadStatic, newLoadStatic, !oldLoadStaticESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLoadStatic( NotificationChain msgs ) {
        LoadStatic oldLoadStatic = loadStatic;
        loadStatic = null;
        boolean oldLoadStaticESet = loadStaticESet;
        loadStaticESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LOAD_AGGREGATE__LOAD_STATIC, oldLoadStatic, null, oldLoadStaticESet );
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
    public void unsetLoadStatic() {
        if( loadStatic != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) loadStatic ).eInverseRemove( this, CimPackage.LOAD_STATIC__LOAD_AGGREGATE,
                    LoadStatic.class, msgs );
            msgs = basicUnsetLoadStatic( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLoadStaticESet = loadStaticESet;
            loadStaticESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LOAD_AGGREGATE__LOAD_STATIC, null, null, oldLoadStaticESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLoadStatic() {
        return loadStaticESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoadMotor getLoadMotor() {
        if( loadMotor != null && loadMotor.eIsProxy() ) {
            InternalEObject oldLoadMotor = ( InternalEObject ) loadMotor;
            loadMotor = ( LoadMotor ) eResolveProxy( oldLoadMotor );
            if( loadMotor != oldLoadMotor ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.LOAD_AGGREGATE__LOAD_MOTOR, oldLoadMotor, loadMotor ) );
            }
        }
        return loadMotor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LoadMotor basicGetLoadMotor() {
        return loadMotor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLoadMotor( LoadMotor newLoadMotor, NotificationChain msgs ) {
        LoadMotor oldLoadMotor = loadMotor;
        loadMotor = newLoadMotor;
        boolean oldLoadMotorESet = loadMotorESet;
        loadMotorESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.LOAD_AGGREGATE__LOAD_MOTOR, oldLoadMotor, newLoadMotor, !oldLoadMotorESet );
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
    public void setLoadMotor( LoadMotor newLoadMotor ) {
        if( newLoadMotor != loadMotor ) {
            NotificationChain msgs = null;
            if( loadMotor != null ) msgs = ( ( InternalEObject ) loadMotor ).eInverseRemove( this,
                    CimPackage.LOAD_MOTOR__LOAD_AGGREGATE, LoadMotor.class, msgs );
            if( newLoadMotor != null ) msgs = ( ( InternalEObject ) newLoadMotor ).eInverseAdd( this,
                    CimPackage.LOAD_MOTOR__LOAD_AGGREGATE, LoadMotor.class, msgs );
            msgs = basicSetLoadMotor( newLoadMotor, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLoadMotorESet = loadMotorESet;
            loadMotorESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.LOAD_AGGREGATE__LOAD_MOTOR, newLoadMotor, newLoadMotor, !oldLoadMotorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLoadMotor( NotificationChain msgs ) {
        LoadMotor oldLoadMotor = loadMotor;
        loadMotor = null;
        boolean oldLoadMotorESet = loadMotorESet;
        loadMotorESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LOAD_AGGREGATE__LOAD_MOTOR, oldLoadMotor, null, oldLoadMotorESet );
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
    public void unsetLoadMotor() {
        if( loadMotor != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) loadMotor ).eInverseRemove( this, CimPackage.LOAD_MOTOR__LOAD_AGGREGATE,
                    LoadMotor.class, msgs );
            msgs = basicUnsetLoadMotor( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLoadMotorESet = loadMotorESet;
            loadMotorESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LOAD_AGGREGATE__LOAD_MOTOR, null, null, oldLoadMotorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLoadMotor() {
        return loadMotorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.LOAD_AGGREGATE__LOAD_STATIC:
            if( loadStatic != null ) msgs = ( ( InternalEObject ) loadStatic ).eInverseRemove( this,
                    CimPackage.LOAD_STATIC__LOAD_AGGREGATE, LoadStatic.class, msgs );
            return basicSetLoadStatic( ( LoadStatic ) otherEnd, msgs );
        case CimPackage.LOAD_AGGREGATE__LOAD_MOTOR:
            if( loadMotor != null ) msgs = ( ( InternalEObject ) loadMotor ).eInverseRemove( this,
                    CimPackage.LOAD_MOTOR__LOAD_AGGREGATE, LoadMotor.class, msgs );
            return basicSetLoadMotor( ( LoadMotor ) otherEnd, msgs );
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
        case CimPackage.LOAD_AGGREGATE__LOAD_STATIC:
            return basicUnsetLoadStatic( msgs );
        case CimPackage.LOAD_AGGREGATE__LOAD_MOTOR:
            return basicUnsetLoadMotor( msgs );
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
        case CimPackage.LOAD_AGGREGATE__LOAD_STATIC:
            if( resolve ) return getLoadStatic();
            return basicGetLoadStatic();
        case CimPackage.LOAD_AGGREGATE__LOAD_MOTOR:
            if( resolve ) return getLoadMotor();
            return basicGetLoadMotor();
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
        case CimPackage.LOAD_AGGREGATE__LOAD_STATIC:
            setLoadStatic( ( LoadStatic ) newValue );
            return;
        case CimPackage.LOAD_AGGREGATE__LOAD_MOTOR:
            setLoadMotor( ( LoadMotor ) newValue );
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
        case CimPackage.LOAD_AGGREGATE__LOAD_STATIC:
            unsetLoadStatic();
            return;
        case CimPackage.LOAD_AGGREGATE__LOAD_MOTOR:
            unsetLoadMotor();
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
        case CimPackage.LOAD_AGGREGATE__LOAD_STATIC:
            return isSetLoadStatic();
        case CimPackage.LOAD_AGGREGATE__LOAD_MOTOR:
            return isSetLoadMotor();
        }
        return super.eIsSet( featureID );
    }

} //LoadAggregateImpl
