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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConformLoad;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConformLoadGroup;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conform Load</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConformLoadImpl#getLoadGroup <em>Load Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConformLoadImpl extends EnergyConsumerImpl implements ConformLoad {
    /**
     * The cached value of the '{@link #getLoadGroup() <em>Load Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoadGroup()
     * @generated
     * @ordered
     */
    protected ConformLoadGroup loadGroup;

    /**
     * This is true if the Load Group reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean loadGroupESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConformLoadImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getConformLoad();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConformLoadGroup getLoadGroup() {
        return loadGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLoadGroup( ConformLoadGroup newLoadGroup, NotificationChain msgs ) {
        ConformLoadGroup oldLoadGroup = loadGroup;
        loadGroup = newLoadGroup;
        boolean oldLoadGroupESet = loadGroupESet;
        loadGroupESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONFORM_LOAD__LOAD_GROUP, oldLoadGroup, newLoadGroup, !oldLoadGroupESet );
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
    public void setLoadGroup( ConformLoadGroup newLoadGroup ) {
        if( newLoadGroup != loadGroup ) {
            NotificationChain msgs = null;
            if( loadGroup != null ) msgs = ( ( InternalEObject ) loadGroup ).eInverseRemove( this,
                    CimPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS, ConformLoadGroup.class, msgs );
            if( newLoadGroup != null ) msgs = ( ( InternalEObject ) newLoadGroup ).eInverseAdd( this,
                    CimPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS, ConformLoadGroup.class, msgs );
            msgs = basicSetLoadGroup( newLoadGroup, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLoadGroupESet = loadGroupESet;
            loadGroupESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONFORM_LOAD__LOAD_GROUP, newLoadGroup, newLoadGroup, !oldLoadGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLoadGroup( NotificationChain msgs ) {
        ConformLoadGroup oldLoadGroup = loadGroup;
        loadGroup = null;
        boolean oldLoadGroupESet = loadGroupESet;
        loadGroupESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONFORM_LOAD__LOAD_GROUP, oldLoadGroup, null, oldLoadGroupESet );
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
    public void unsetLoadGroup() {
        if( loadGroup != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) loadGroup ).eInverseRemove( this,
                    CimPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS, ConformLoadGroup.class, msgs );
            msgs = basicUnsetLoadGroup( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLoadGroupESet = loadGroupESet;
            loadGroupESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONFORM_LOAD__LOAD_GROUP, null, null, oldLoadGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLoadGroup() {
        return loadGroupESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.CONFORM_LOAD__LOAD_GROUP:
            if( loadGroup != null ) msgs = ( ( InternalEObject ) loadGroup ).eInverseRemove( this,
                    CimPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS, ConformLoadGroup.class, msgs );
            return basicSetLoadGroup( ( ConformLoadGroup ) otherEnd, msgs );
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
        case CimPackage.CONFORM_LOAD__LOAD_GROUP:
            return basicUnsetLoadGroup( msgs );
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
        case CimPackage.CONFORM_LOAD__LOAD_GROUP:
            return getLoadGroup();
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
        case CimPackage.CONFORM_LOAD__LOAD_GROUP:
            setLoadGroup( ( ConformLoadGroup ) newValue );
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
        case CimPackage.CONFORM_LOAD__LOAD_GROUP:
            unsetLoadGroup();
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
        case CimPackage.CONFORM_LOAD__LOAD_GROUP:
            return isSetLoadGroup();
        }
        return super.eIsSet( featureID );
    }

} //ConformLoadImpl
