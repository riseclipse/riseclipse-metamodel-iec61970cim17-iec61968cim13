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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalLimit;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalLimitSet;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalLimitType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OperationalLimitImpl#getOperationalLimitType <em>Operational Limit Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OperationalLimitImpl#getOperationalLimitSet <em>Operational Limit Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationalLimitImpl extends IdentifiedObjectImpl implements OperationalLimit {
    /**
     * The cached value of the '{@link #getOperationalLimitType() <em>Operational Limit Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperationalLimitType()
     * @generated
     * @ordered
     */
    protected OperationalLimitType operationalLimitType;

    /**
     * This is true if the Operational Limit Type reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean operationalLimitTypeESet;

    /**
     * The cached value of the '{@link #getOperationalLimitSet() <em>Operational Limit Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperationalLimitSet()
     * @generated
     * @ordered
     */
    protected OperationalLimitSet operationalLimitSet;

    /**
     * This is true if the Operational Limit Set reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean operationalLimitSetESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OperationalLimitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getOperationalLimit();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OperationalLimitType getOperationalLimitType() {
        return operationalLimitType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOperationalLimitType( OperationalLimitType newOperationalLimitType,
            NotificationChain msgs ) {
        OperationalLimitType oldOperationalLimitType = operationalLimitType;
        operationalLimitType = newOperationalLimitType;
        boolean oldOperationalLimitTypeESet = operationalLimitTypeESet;
        operationalLimitTypeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE, oldOperationalLimitType,
                    newOperationalLimitType, !oldOperationalLimitTypeESet );
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
    public void setOperationalLimitType( OperationalLimitType newOperationalLimitType ) {
        if( newOperationalLimitType != operationalLimitType ) {
            NotificationChain msgs = null;
            if( operationalLimitType != null ) msgs = ( ( InternalEObject ) operationalLimitType ).eInverseRemove( this,
                    CimPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT, OperationalLimitType.class, msgs );
            if( newOperationalLimitType != null )
                msgs = ( ( InternalEObject ) newOperationalLimitType ).eInverseAdd( this,
                        CimPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT, OperationalLimitType.class, msgs );
            msgs = basicSetOperationalLimitType( newOperationalLimitType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOperationalLimitTypeESet = operationalLimitTypeESet;
            operationalLimitTypeESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE,
                            newOperationalLimitType, newOperationalLimitType, !oldOperationalLimitTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetOperationalLimitType( NotificationChain msgs ) {
        OperationalLimitType oldOperationalLimitType = operationalLimitType;
        operationalLimitType = null;
        boolean oldOperationalLimitTypeESet = operationalLimitTypeESet;
        operationalLimitTypeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE, oldOperationalLimitType, null,
                    oldOperationalLimitTypeESet );
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
    public void unsetOperationalLimitType() {
        if( operationalLimitType != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) operationalLimitType ).eInverseRemove( this,
                    CimPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT, OperationalLimitType.class, msgs );
            msgs = basicUnsetOperationalLimitType( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOperationalLimitTypeESet = operationalLimitTypeESet;
            operationalLimitTypeESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE, null, null, oldOperationalLimitTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOperationalLimitType() {
        return operationalLimitTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OperationalLimitSet getOperationalLimitSet() {
        return operationalLimitSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOperationalLimitSet( OperationalLimitSet newOperationalLimitSet,
            NotificationChain msgs ) {
        OperationalLimitSet oldOperationalLimitSet = operationalLimitSet;
        operationalLimitSet = newOperationalLimitSet;
        boolean oldOperationalLimitSetESet = operationalLimitSetESet;
        operationalLimitSetESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET, oldOperationalLimitSet, newOperationalLimitSet,
                    !oldOperationalLimitSetESet );
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
    public void setOperationalLimitSet( OperationalLimitSet newOperationalLimitSet ) {
        if( newOperationalLimitSet != operationalLimitSet ) {
            NotificationChain msgs = null;
            if( operationalLimitSet != null ) msgs = ( ( InternalEObject ) operationalLimitSet ).eInverseRemove( this,
                    CimPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE, OperationalLimitSet.class, msgs );
            if( newOperationalLimitSet != null )
                msgs = ( ( InternalEObject ) newOperationalLimitSet ).eInverseAdd( this,
                        CimPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE, OperationalLimitSet.class, msgs );
            msgs = basicSetOperationalLimitSet( newOperationalLimitSet, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOperationalLimitSetESet = operationalLimitSetESet;
            operationalLimitSetESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET,
                            newOperationalLimitSet, newOperationalLimitSet, !oldOperationalLimitSetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetOperationalLimitSet( NotificationChain msgs ) {
        OperationalLimitSet oldOperationalLimitSet = operationalLimitSet;
        operationalLimitSet = null;
        boolean oldOperationalLimitSetESet = operationalLimitSetESet;
        operationalLimitSetESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET, oldOperationalLimitSet, null,
                    oldOperationalLimitSetESet );
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
    public void unsetOperationalLimitSet() {
        if( operationalLimitSet != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) operationalLimitSet ).eInverseRemove( this,
                    CimPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE, OperationalLimitSet.class, msgs );
            msgs = basicUnsetOperationalLimitSet( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOperationalLimitSetESet = operationalLimitSetESet;
            operationalLimitSetESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET, null, null, oldOperationalLimitSetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOperationalLimitSet() {
        return operationalLimitSetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE:
            if( operationalLimitType != null ) msgs = ( ( InternalEObject ) operationalLimitType ).eInverseRemove( this,
                    CimPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT, OperationalLimitType.class, msgs );
            return basicSetOperationalLimitType( ( OperationalLimitType ) otherEnd, msgs );
        case CimPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET:
            if( operationalLimitSet != null ) msgs = ( ( InternalEObject ) operationalLimitSet ).eInverseRemove( this,
                    CimPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE, OperationalLimitSet.class, msgs );
            return basicSetOperationalLimitSet( ( OperationalLimitSet ) otherEnd, msgs );
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
        case CimPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE:
            return basicUnsetOperationalLimitType( msgs );
        case CimPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET:
            return basicUnsetOperationalLimitSet( msgs );
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
        case CimPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE:
            return getOperationalLimitType();
        case CimPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET:
            return getOperationalLimitSet();
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
        case CimPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE:
            setOperationalLimitType( ( OperationalLimitType ) newValue );
            return;
        case CimPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET:
            setOperationalLimitSet( ( OperationalLimitSet ) newValue );
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
        case CimPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE:
            unsetOperationalLimitType();
            return;
        case CimPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET:
            unsetOperationalLimitSet();
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
        case CimPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE:
            return isSetOperationalLimitType();
        case CimPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET:
            return isSetOperationalLimitSet();
        }
        return super.eIsSet( featureID );
    }

} //OperationalLimitImpl
