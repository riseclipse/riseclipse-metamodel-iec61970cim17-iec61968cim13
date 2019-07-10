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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenericAction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GenericActionImpl#getSwitchingStepGroup <em>Switching Step Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericActionImpl extends SwitchingStepImpl implements GenericAction {
    /**
     * The cached value of the '{@link #getSwitchingStepGroup() <em>Switching Step Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchingStepGroup()
     * @generated
     * @ordered
     */
    protected SwitchingStepGroup switchingStepGroup;

    /**
     * This is true if the Switching Step Group reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean switchingStepGroupESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GenericActionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getGenericAction();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SwitchingStepGroup getSwitchingStepGroup() {
        return switchingStepGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSwitchingStepGroup( SwitchingStepGroup newSwitchingStepGroup,
            NotificationChain msgs ) {
        SwitchingStepGroup oldSwitchingStepGroup = switchingStepGroup;
        switchingStepGroup = newSwitchingStepGroup;
        boolean oldSwitchingStepGroupESet = switchingStepGroupESet;
        switchingStepGroupESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.GENERIC_ACTION__SWITCHING_STEP_GROUP, oldSwitchingStepGroup, newSwitchingStepGroup,
                    !oldSwitchingStepGroupESet );
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
    public void setSwitchingStepGroup( SwitchingStepGroup newSwitchingStepGroup ) {
        if( newSwitchingStepGroup != switchingStepGroup ) {
            NotificationChain msgs = null;
            if( switchingStepGroup != null ) msgs = ( ( InternalEObject ) switchingStepGroup ).eInverseRemove( this,
                    CimPackage.SWITCHING_STEP_GROUP__GENERIC_ACTIONS, SwitchingStepGroup.class, msgs );
            if( newSwitchingStepGroup != null ) msgs = ( ( InternalEObject ) newSwitchingStepGroup ).eInverseAdd( this,
                    CimPackage.SWITCHING_STEP_GROUP__GENERIC_ACTIONS, SwitchingStepGroup.class, msgs );
            msgs = basicSetSwitchingStepGroup( newSwitchingStepGroup, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSwitchingStepGroupESet = switchingStepGroupESet;
            switchingStepGroupESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERIC_ACTION__SWITCHING_STEP_GROUP,
                        newSwitchingStepGroup, newSwitchingStepGroup, !oldSwitchingStepGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSwitchingStepGroup( NotificationChain msgs ) {
        SwitchingStepGroup oldSwitchingStepGroup = switchingStepGroup;
        switchingStepGroup = null;
        boolean oldSwitchingStepGroupESet = switchingStepGroupESet;
        switchingStepGroupESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.GENERIC_ACTION__SWITCHING_STEP_GROUP, oldSwitchingStepGroup, null,
                    oldSwitchingStepGroupESet );
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
    public void unsetSwitchingStepGroup() {
        if( switchingStepGroup != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) switchingStepGroup ).eInverseRemove( this,
                    CimPackage.SWITCHING_STEP_GROUP__GENERIC_ACTIONS, SwitchingStepGroup.class, msgs );
            msgs = basicUnsetSwitchingStepGroup( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSwitchingStepGroupESet = switchingStepGroupESet;
            switchingStepGroupESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.GENERIC_ACTION__SWITCHING_STEP_GROUP, null, null, oldSwitchingStepGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSwitchingStepGroup() {
        return switchingStepGroupESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.GENERIC_ACTION__SWITCHING_STEP_GROUP:
            if( switchingStepGroup != null ) msgs = ( ( InternalEObject ) switchingStepGroup ).eInverseRemove( this,
                    CimPackage.SWITCHING_STEP_GROUP__GENERIC_ACTIONS, SwitchingStepGroup.class, msgs );
            return basicSetSwitchingStepGroup( ( SwitchingStepGroup ) otherEnd, msgs );
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
        case CimPackage.GENERIC_ACTION__SWITCHING_STEP_GROUP:
            return basicUnsetSwitchingStepGroup( msgs );
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
        case CimPackage.GENERIC_ACTION__SWITCHING_STEP_GROUP:
            return getSwitchingStepGroup();
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
        case CimPackage.GENERIC_ACTION__SWITCHING_STEP_GROUP:
            setSwitchingStepGroup( ( SwitchingStepGroup ) newValue );
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
        case CimPackage.GENERIC_ACTION__SWITCHING_STEP_GROUP:
            unsetSwitchingStepGroup();
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
        case CimPackage.GENERIC_ACTION__SWITCHING_STEP_GROUP:
            return isSetSwitchingStepGroup();
        }
        return super.eIsSet( featureID );
    }

} //GenericActionImpl
