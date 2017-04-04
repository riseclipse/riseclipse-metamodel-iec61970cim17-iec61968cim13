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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Jumper;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.JumperAction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jumper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.JumperImpl#getJumperAction <em>Jumper Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JumperImpl extends SwitchImpl implements Jumper {
    /**
     * The cached value of the '{@link #getJumperAction() <em>Jumper Action</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJumperAction()
     * @generated
     * @ordered
     */
    protected JumperAction jumperAction;

    /**
     * This is true if the Jumper Action reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean jumperActionESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JumperImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getJumper();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public JumperAction getJumperAction() {
        return jumperAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetJumperAction( JumperAction newJumperAction, NotificationChain msgs ) {
        JumperAction oldJumperAction = jumperAction;
        jumperAction = newJumperAction;
        boolean oldJumperActionESet = jumperActionESet;
        jumperActionESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.JUMPER__JUMPER_ACTION, oldJumperAction, newJumperAction, !oldJumperActionESet );
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
    public void setJumperAction( JumperAction newJumperAction ) {
        if( newJumperAction != jumperAction ) {
            NotificationChain msgs = null;
            if( jumperAction != null ) msgs = ( ( InternalEObject ) jumperAction ).eInverseRemove( this,
                    CimPackage.JUMPER_ACTION__JUMPER, JumperAction.class, msgs );
            if( newJumperAction != null ) msgs = ( ( InternalEObject ) newJumperAction ).eInverseAdd( this,
                    CimPackage.JUMPER_ACTION__JUMPER, JumperAction.class, msgs );
            msgs = basicSetJumperAction( newJumperAction, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldJumperActionESet = jumperActionESet;
            jumperActionESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.JUMPER__JUMPER_ACTION, newJumperAction, newJumperAction, !oldJumperActionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetJumperAction( NotificationChain msgs ) {
        JumperAction oldJumperAction = jumperAction;
        jumperAction = null;
        boolean oldJumperActionESet = jumperActionESet;
        jumperActionESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.JUMPER__JUMPER_ACTION, oldJumperAction, null, oldJumperActionESet );
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
    public void unsetJumperAction() {
        if( jumperAction != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) jumperAction ).eInverseRemove( this, CimPackage.JUMPER_ACTION__JUMPER,
                    JumperAction.class, msgs );
            msgs = basicUnsetJumperAction( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldJumperActionESet = jumperActionESet;
            jumperActionESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.JUMPER__JUMPER_ACTION, null, null, oldJumperActionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetJumperAction() {
        return jumperActionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.JUMPER__JUMPER_ACTION:
            if( jumperAction != null ) msgs = ( ( InternalEObject ) jumperAction ).eInverseRemove( this,
                    CimPackage.JUMPER_ACTION__JUMPER, JumperAction.class, msgs );
            return basicSetJumperAction( ( JumperAction ) otherEnd, msgs );
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
        case CimPackage.JUMPER__JUMPER_ACTION:
            return basicUnsetJumperAction( msgs );
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
        case CimPackage.JUMPER__JUMPER_ACTION:
            return getJumperAction();
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
        case CimPackage.JUMPER__JUMPER_ACTION:
            setJumperAction( ( JumperAction ) newValue );
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
        case CimPackage.JUMPER__JUMPER_ACTION:
            unsetJumperAction();
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
        case CimPackage.JUMPER__JUMPER_ACTION:
            return isSetJumperAction();
        }
        return super.eIsSet( featureID );
    }

} //JumperImpl
