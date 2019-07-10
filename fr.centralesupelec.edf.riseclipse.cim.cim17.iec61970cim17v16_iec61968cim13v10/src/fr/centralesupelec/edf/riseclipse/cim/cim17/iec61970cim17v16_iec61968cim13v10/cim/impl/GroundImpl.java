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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Ground;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GroundAction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ground</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GroundImpl#getGroundAction <em>Ground Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroundImpl extends ConductingEquipmentImpl implements Ground {
    /**
     * The cached value of the '{@link #getGroundAction() <em>Ground Action</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroundAction()
     * @generated
     * @ordered
     */
    protected GroundAction groundAction;

    /**
     * This is true if the Ground Action reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean groundActionESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GroundImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getGround();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GroundAction getGroundAction() {
        return groundAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGroundAction( GroundAction newGroundAction, NotificationChain msgs ) {
        GroundAction oldGroundAction = groundAction;
        groundAction = newGroundAction;
        boolean oldGroundActionESet = groundActionESet;
        groundActionESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.GROUND__GROUND_ACTION, oldGroundAction, newGroundAction, !oldGroundActionESet );
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
    public void setGroundAction( GroundAction newGroundAction ) {
        if( newGroundAction != groundAction ) {
            NotificationChain msgs = null;
            if( groundAction != null ) msgs = ( ( InternalEObject ) groundAction ).eInverseRemove( this,
                    CimPackage.GROUND_ACTION__GROUND, GroundAction.class, msgs );
            if( newGroundAction != null ) msgs = ( ( InternalEObject ) newGroundAction ).eInverseAdd( this,
                    CimPackage.GROUND_ACTION__GROUND, GroundAction.class, msgs );
            msgs = basicSetGroundAction( newGroundAction, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldGroundActionESet = groundActionESet;
            groundActionESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.GROUND__GROUND_ACTION, newGroundAction, newGroundAction, !oldGroundActionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetGroundAction( NotificationChain msgs ) {
        GroundAction oldGroundAction = groundAction;
        groundAction = null;
        boolean oldGroundActionESet = groundActionESet;
        groundActionESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.GROUND__GROUND_ACTION, oldGroundAction, null, oldGroundActionESet );
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
    public void unsetGroundAction() {
        if( groundAction != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) groundAction ).eInverseRemove( this, CimPackage.GROUND_ACTION__GROUND,
                    GroundAction.class, msgs );
            msgs = basicUnsetGroundAction( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldGroundActionESet = groundActionESet;
            groundActionESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.GROUND__GROUND_ACTION, null, null, oldGroundActionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGroundAction() {
        return groundActionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.GROUND__GROUND_ACTION:
            if( groundAction != null ) msgs = ( ( InternalEObject ) groundAction ).eInverseRemove( this,
                    CimPackage.GROUND_ACTION__GROUND, GroundAction.class, msgs );
            return basicSetGroundAction( ( GroundAction ) otherEnd, msgs );
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
        case CimPackage.GROUND__GROUND_ACTION:
            return basicUnsetGroundAction( msgs );
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
        case CimPackage.GROUND__GROUND_ACTION:
            return getGroundAction();
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
        case CimPackage.GROUND__GROUND_ACTION:
            setGroundAction( ( GroundAction ) newValue );
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
        case CimPackage.GROUND__GROUND_ACTION:
            unsetGroundAction();
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
        case CimPackage.GROUND__GROUND_ACTION:
            return isSetGroundAction();
        }
        return super.eIsSet( featureID );
    }

} //GroundImpl
