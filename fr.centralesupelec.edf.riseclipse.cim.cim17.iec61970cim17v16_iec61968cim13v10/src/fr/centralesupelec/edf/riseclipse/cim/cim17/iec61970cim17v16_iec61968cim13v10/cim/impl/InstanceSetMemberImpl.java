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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InstanceSet;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InstanceSetMember;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Set Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.InstanceSetMemberImpl#getInstanceSet <em>Instance Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceSetMemberImpl extends DataSetMemberImpl implements InstanceSetMember {
    /**
     * The cached value of the '{@link #getInstanceSet() <em>Instance Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstanceSet()
     * @generated
     * @ordered
     */
    protected InstanceSet instanceSet;

    /**
     * This is true if the Instance Set reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean instanceSetESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InstanceSetMemberImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getInstanceSetMember();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public InstanceSet getInstanceSet() {
        return instanceSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInstanceSet( InstanceSet newInstanceSet, NotificationChain msgs ) {
        InstanceSet oldInstanceSet = instanceSet;
        instanceSet = newInstanceSet;
        boolean oldInstanceSetESet = instanceSetESet;
        instanceSetESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.INSTANCE_SET_MEMBER__INSTANCE_SET, oldInstanceSet, newInstanceSet, !oldInstanceSetESet );
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
    public void setInstanceSet( InstanceSet newInstanceSet ) {
        if( newInstanceSet != instanceSet ) {
            NotificationChain msgs = null;
            if( instanceSet != null ) msgs = ( ( InternalEObject ) instanceSet ).eInverseRemove( this,
                    CimPackage.INSTANCE_SET__INSTANCE_SET_MEMBER, InstanceSet.class, msgs );
            if( newInstanceSet != null ) msgs = ( ( InternalEObject ) newInstanceSet ).eInverseAdd( this,
                    CimPackage.INSTANCE_SET__INSTANCE_SET_MEMBER, InstanceSet.class, msgs );
            msgs = basicSetInstanceSet( newInstanceSet, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldInstanceSetESet = instanceSetESet;
            instanceSetESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.INSTANCE_SET_MEMBER__INSTANCE_SET,
                        newInstanceSet, newInstanceSet, !oldInstanceSetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetInstanceSet( NotificationChain msgs ) {
        InstanceSet oldInstanceSet = instanceSet;
        instanceSet = null;
        boolean oldInstanceSetESet = instanceSetESet;
        instanceSetESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.INSTANCE_SET_MEMBER__INSTANCE_SET, oldInstanceSet, null, oldInstanceSetESet );
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
    public void unsetInstanceSet() {
        if( instanceSet != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) instanceSet ).eInverseRemove( this,
                    CimPackage.INSTANCE_SET__INSTANCE_SET_MEMBER, InstanceSet.class, msgs );
            msgs = basicUnsetInstanceSet( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldInstanceSetESet = instanceSetESet;
            instanceSetESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.INSTANCE_SET_MEMBER__INSTANCE_SET, null, null, oldInstanceSetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInstanceSet() {
        return instanceSetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.INSTANCE_SET_MEMBER__INSTANCE_SET:
            if( instanceSet != null ) msgs = ( ( InternalEObject ) instanceSet ).eInverseRemove( this,
                    CimPackage.INSTANCE_SET__INSTANCE_SET_MEMBER, InstanceSet.class, msgs );
            return basicSetInstanceSet( ( InstanceSet ) otherEnd, msgs );
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
        case CimPackage.INSTANCE_SET_MEMBER__INSTANCE_SET:
            return basicUnsetInstanceSet( msgs );
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
        case CimPackage.INSTANCE_SET_MEMBER__INSTANCE_SET:
            return getInstanceSet();
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
        case CimPackage.INSTANCE_SET_MEMBER__INSTANCE_SET:
            setInstanceSet( ( InstanceSet ) newValue );
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
        case CimPackage.INSTANCE_SET_MEMBER__INSTANCE_SET:
            unsetInstanceSet();
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
        case CimPackage.INSTANCE_SET_MEMBER__INSTANCE_SET:
            return isSetInstanceSet();
        }
        return super.eIsSet( featureID );
    }

} //InstanceSetMemberImpl
