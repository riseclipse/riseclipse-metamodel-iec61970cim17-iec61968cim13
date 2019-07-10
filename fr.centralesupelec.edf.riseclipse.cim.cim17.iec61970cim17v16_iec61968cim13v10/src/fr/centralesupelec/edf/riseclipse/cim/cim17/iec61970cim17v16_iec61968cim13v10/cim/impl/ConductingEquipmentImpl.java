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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseVoltage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GroundAction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.JumperAction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvStatus;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal;

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
 * An implementation of the model object '<em><b>Conducting Equipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConductingEquipmentImpl#getSvStatus <em>Sv Status</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConductingEquipmentImpl#getTerminals <em>Terminals</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConductingEquipmentImpl#getJumpingAction <em>Jumping Action</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConductingEquipmentImpl#getProtectionEquipments <em>Protection Equipments</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConductingEquipmentImpl#getBaseVoltage <em>Base Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConductingEquipmentImpl#getGroundingAction <em>Grounding Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConductingEquipmentImpl extends EquipmentImpl implements ConductingEquipment {
    /**
     * The cached value of the '{@link #getSvStatus() <em>Sv Status</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSvStatus()
     * @generated
     * @ordered
     */
    protected EList< SvStatus > svStatus;

    /**
     * The cached value of the '{@link #getTerminals() <em>Terminals</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTerminals()
     * @generated
     * @ordered
     */
    protected EList< Terminal > terminals;

    /**
     * The cached value of the '{@link #getJumpingAction() <em>Jumping Action</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJumpingAction()
     * @generated
     * @ordered
     */
    protected JumperAction jumpingAction;

    /**
     * This is true if the Jumping Action reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean jumpingActionESet;

    /**
     * The cached value of the '{@link #getProtectionEquipments() <em>Protection Equipments</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProtectionEquipments()
     * @generated
     * @ordered
     */
    protected EList< ProtectionEquipment > protectionEquipments;

    /**
     * The cached value of the '{@link #getBaseVoltage() <em>Base Voltage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBaseVoltage()
     * @generated
     * @ordered
     */
    protected BaseVoltage baseVoltage;

    /**
     * This is true if the Base Voltage reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean baseVoltageESet;

    /**
     * The cached value of the '{@link #getGroundingAction() <em>Grounding Action</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroundingAction()
     * @generated
     * @ordered
     */
    protected GroundAction groundingAction;

    /**
     * This is true if the Grounding Action reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean groundingActionESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConductingEquipmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getConductingEquipment();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SvStatus > getSvStatus() {
        if( svStatus == null ) {
            svStatus = new EObjectWithInverseResolvingEList.Unsettable< SvStatus >( SvStatus.class, this,
                    CimPackage.CONDUCTING_EQUIPMENT__SV_STATUS, CimPackage.SV_STATUS__CONDUCTING_EQUIPMENT );
        }
        return svStatus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSvStatus() {
        if( svStatus != null ) ( ( InternalEList.Unsettable< ? > ) svStatus ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSvStatus() {
        return svStatus != null && ( ( InternalEList.Unsettable< ? > ) svStatus ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Terminal > getTerminals() {
        if( terminals == null ) {
            terminals = new EObjectWithInverseResolvingEList.Unsettable< Terminal >( Terminal.class, this,
                    CimPackage.CONDUCTING_EQUIPMENT__TERMINALS, CimPackage.TERMINAL__CONDUCTING_EQUIPMENT );
        }
        return terminals;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTerminals() {
        if( terminals != null ) ( ( InternalEList.Unsettable< ? > ) terminals ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTerminals() {
        return terminals != null && ( ( InternalEList.Unsettable< ? > ) terminals ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public JumperAction getJumpingAction() {
        return jumpingAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetJumpingAction( JumperAction newJumpingAction, NotificationChain msgs ) {
        JumperAction oldJumpingAction = jumpingAction;
        jumpingAction = newJumpingAction;
        boolean oldJumpingActionESet = jumpingActionESet;
        jumpingActionESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONDUCTING_EQUIPMENT__JUMPING_ACTION, oldJumpingAction, newJumpingAction,
                    !oldJumpingActionESet );
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
    public void setJumpingAction( JumperAction newJumpingAction ) {
        if( newJumpingAction != jumpingAction ) {
            NotificationChain msgs = null;
            if( jumpingAction != null ) msgs = ( ( InternalEObject ) jumpingAction ).eInverseRemove( this,
                    CimPackage.JUMPER_ACTION__JUMPED_EQUIPMENTS, JumperAction.class, msgs );
            if( newJumpingAction != null ) msgs = ( ( InternalEObject ) newJumpingAction ).eInverseAdd( this,
                    CimPackage.JUMPER_ACTION__JUMPED_EQUIPMENTS, JumperAction.class, msgs );
            msgs = basicSetJumpingAction( newJumpingAction, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldJumpingActionESet = jumpingActionESet;
            jumpingActionESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CONDUCTING_EQUIPMENT__JUMPING_ACTION,
                        newJumpingAction, newJumpingAction, !oldJumpingActionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetJumpingAction( NotificationChain msgs ) {
        JumperAction oldJumpingAction = jumpingAction;
        jumpingAction = null;
        boolean oldJumpingActionESet = jumpingActionESet;
        jumpingActionESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONDUCTING_EQUIPMENT__JUMPING_ACTION, oldJumpingAction, null, oldJumpingActionESet );
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
    public void unsetJumpingAction() {
        if( jumpingAction != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) jumpingAction ).eInverseRemove( this,
                    CimPackage.JUMPER_ACTION__JUMPED_EQUIPMENTS, JumperAction.class, msgs );
            msgs = basicUnsetJumpingAction( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldJumpingActionESet = jumpingActionESet;
            jumpingActionESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONDUCTING_EQUIPMENT__JUMPING_ACTION, null, null, oldJumpingActionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetJumpingAction() {
        return jumpingActionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ProtectionEquipment > getProtectionEquipments() {
        if( protectionEquipments == null ) {
            protectionEquipments = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< ProtectionEquipment >(
                    ProtectionEquipment.class, this, CimPackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS,
                    CimPackage.PROTECTION_EQUIPMENT__CONDUCTING_EQUIPMENTS );
        }
        return protectionEquipments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetProtectionEquipments() {
        if( protectionEquipments != null ) ( ( InternalEList.Unsettable< ? > ) protectionEquipments ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProtectionEquipments() {
        return protectionEquipments != null && ( ( InternalEList.Unsettable< ? > ) protectionEquipments ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BaseVoltage getBaseVoltage() {
        return baseVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBaseVoltage( BaseVoltage newBaseVoltage, NotificationChain msgs ) {
        BaseVoltage oldBaseVoltage = baseVoltage;
        baseVoltage = newBaseVoltage;
        boolean oldBaseVoltageESet = baseVoltageESet;
        baseVoltageESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE, oldBaseVoltage, newBaseVoltage,
                    !oldBaseVoltageESet );
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
    public void setBaseVoltage( BaseVoltage newBaseVoltage ) {
        if( newBaseVoltage != baseVoltage ) {
            NotificationChain msgs = null;
            if( baseVoltage != null ) msgs = ( ( InternalEObject ) baseVoltage ).eInverseRemove( this,
                    CimPackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT, BaseVoltage.class, msgs );
            if( newBaseVoltage != null ) msgs = ( ( InternalEObject ) newBaseVoltage ).eInverseAdd( this,
                    CimPackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT, BaseVoltage.class, msgs );
            msgs = basicSetBaseVoltage( newBaseVoltage, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBaseVoltageESet = baseVoltageESet;
            baseVoltageESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE,
                        newBaseVoltage, newBaseVoltage, !oldBaseVoltageESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetBaseVoltage( NotificationChain msgs ) {
        BaseVoltage oldBaseVoltage = baseVoltage;
        baseVoltage = null;
        boolean oldBaseVoltageESet = baseVoltageESet;
        baseVoltageESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE, oldBaseVoltage, null, oldBaseVoltageESet );
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
    public void unsetBaseVoltage() {
        if( baseVoltage != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) baseVoltage ).eInverseRemove( this,
                    CimPackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT, BaseVoltage.class, msgs );
            msgs = basicUnsetBaseVoltage( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBaseVoltageESet = baseVoltageESet;
            baseVoltageESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE, null, null, oldBaseVoltageESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBaseVoltage() {
        return baseVoltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GroundAction getGroundingAction() {
        return groundingAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGroundingAction( GroundAction newGroundingAction, NotificationChain msgs ) {
        GroundAction oldGroundingAction = groundingAction;
        groundingAction = newGroundingAction;
        boolean oldGroundingActionESet = groundingActionESet;
        groundingActionESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONDUCTING_EQUIPMENT__GROUNDING_ACTION, oldGroundingAction, newGroundingAction,
                    !oldGroundingActionESet );
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
    public void setGroundingAction( GroundAction newGroundingAction ) {
        if( newGroundingAction != groundingAction ) {
            NotificationChain msgs = null;
            if( groundingAction != null ) msgs = ( ( InternalEObject ) groundingAction ).eInverseRemove( this,
                    CimPackage.GROUND_ACTION__GROUNDED_EQUIPMENT, GroundAction.class, msgs );
            if( newGroundingAction != null ) msgs = ( ( InternalEObject ) newGroundingAction ).eInverseAdd( this,
                    CimPackage.GROUND_ACTION__GROUNDED_EQUIPMENT, GroundAction.class, msgs );
            msgs = basicSetGroundingAction( newGroundingAction, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldGroundingActionESet = groundingActionESet;
            groundingActionESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.CONDUCTING_EQUIPMENT__GROUNDING_ACTION,
                            newGroundingAction, newGroundingAction, !oldGroundingActionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetGroundingAction( NotificationChain msgs ) {
        GroundAction oldGroundingAction = groundingAction;
        groundingAction = null;
        boolean oldGroundingActionESet = groundingActionESet;
        groundingActionESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONDUCTING_EQUIPMENT__GROUNDING_ACTION, oldGroundingAction, null,
                    oldGroundingActionESet );
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
    public void unsetGroundingAction() {
        if( groundingAction != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) groundingAction ).eInverseRemove( this,
                    CimPackage.GROUND_ACTION__GROUNDED_EQUIPMENT, GroundAction.class, msgs );
            msgs = basicUnsetGroundingAction( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldGroundingActionESet = groundingActionESet;
            groundingActionESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONDUCTING_EQUIPMENT__GROUNDING_ACTION, null, null, oldGroundingActionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGroundingAction() {
        return groundingActionESet;
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
        case CimPackage.CONDUCTING_EQUIPMENT__SV_STATUS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSvStatus() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.CONDUCTING_EQUIPMENT__TERMINALS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTerminals() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.CONDUCTING_EQUIPMENT__JUMPING_ACTION:
            if( jumpingAction != null ) msgs = ( ( InternalEObject ) jumpingAction ).eInverseRemove( this,
                    CimPackage.JUMPER_ACTION__JUMPED_EQUIPMENTS, JumperAction.class, msgs );
            return basicSetJumpingAction( ( JumperAction ) otherEnd, msgs );
        case CimPackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getProtectionEquipments() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
            if( baseVoltage != null ) msgs = ( ( InternalEObject ) baseVoltage ).eInverseRemove( this,
                    CimPackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT, BaseVoltage.class, msgs );
            return basicSetBaseVoltage( ( BaseVoltage ) otherEnd, msgs );
        case CimPackage.CONDUCTING_EQUIPMENT__GROUNDING_ACTION:
            if( groundingAction != null ) msgs = ( ( InternalEObject ) groundingAction ).eInverseRemove( this,
                    CimPackage.GROUND_ACTION__GROUNDED_EQUIPMENT, GroundAction.class, msgs );
            return basicSetGroundingAction( ( GroundAction ) otherEnd, msgs );
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
        case CimPackage.CONDUCTING_EQUIPMENT__SV_STATUS:
            return ( ( InternalEList< ? > ) getSvStatus() ).basicRemove( otherEnd, msgs );
        case CimPackage.CONDUCTING_EQUIPMENT__TERMINALS:
            return ( ( InternalEList< ? > ) getTerminals() ).basicRemove( otherEnd, msgs );
        case CimPackage.CONDUCTING_EQUIPMENT__JUMPING_ACTION:
            return basicUnsetJumpingAction( msgs );
        case CimPackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS:
            return ( ( InternalEList< ? > ) getProtectionEquipments() ).basicRemove( otherEnd, msgs );
        case CimPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
            return basicUnsetBaseVoltage( msgs );
        case CimPackage.CONDUCTING_EQUIPMENT__GROUNDING_ACTION:
            return basicUnsetGroundingAction( msgs );
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
        case CimPackage.CONDUCTING_EQUIPMENT__SV_STATUS:
            return getSvStatus();
        case CimPackage.CONDUCTING_EQUIPMENT__TERMINALS:
            return getTerminals();
        case CimPackage.CONDUCTING_EQUIPMENT__JUMPING_ACTION:
            return getJumpingAction();
        case CimPackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS:
            return getProtectionEquipments();
        case CimPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
            return getBaseVoltage();
        case CimPackage.CONDUCTING_EQUIPMENT__GROUNDING_ACTION:
            return getGroundingAction();
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
        case CimPackage.CONDUCTING_EQUIPMENT__SV_STATUS:
            getSvStatus().clear();
            getSvStatus().addAll( ( Collection< ? extends SvStatus > ) newValue );
            return;
        case CimPackage.CONDUCTING_EQUIPMENT__TERMINALS:
            getTerminals().clear();
            getTerminals().addAll( ( Collection< ? extends Terminal > ) newValue );
            return;
        case CimPackage.CONDUCTING_EQUIPMENT__JUMPING_ACTION:
            setJumpingAction( ( JumperAction ) newValue );
            return;
        case CimPackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS:
            getProtectionEquipments().clear();
            getProtectionEquipments().addAll( ( Collection< ? extends ProtectionEquipment > ) newValue );
            return;
        case CimPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
            setBaseVoltage( ( BaseVoltage ) newValue );
            return;
        case CimPackage.CONDUCTING_EQUIPMENT__GROUNDING_ACTION:
            setGroundingAction( ( GroundAction ) newValue );
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
        case CimPackage.CONDUCTING_EQUIPMENT__SV_STATUS:
            unsetSvStatus();
            return;
        case CimPackage.CONDUCTING_EQUIPMENT__TERMINALS:
            unsetTerminals();
            return;
        case CimPackage.CONDUCTING_EQUIPMENT__JUMPING_ACTION:
            unsetJumpingAction();
            return;
        case CimPackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS:
            unsetProtectionEquipments();
            return;
        case CimPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
            unsetBaseVoltage();
            return;
        case CimPackage.CONDUCTING_EQUIPMENT__GROUNDING_ACTION:
            unsetGroundingAction();
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
        case CimPackage.CONDUCTING_EQUIPMENT__SV_STATUS:
            return isSetSvStatus();
        case CimPackage.CONDUCTING_EQUIPMENT__TERMINALS:
            return isSetTerminals();
        case CimPackage.CONDUCTING_EQUIPMENT__JUMPING_ACTION:
            return isSetJumpingAction();
        case CimPackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS:
            return isSetProtectionEquipments();
        case CimPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
            return isSetBaseVoltage();
        case CimPackage.CONDUCTING_EQUIPMENT__GROUNDING_ACTION:
            return isSetGroundingAction();
        }
        return super.eIsSet( featureID );
    }

} //ConductingEquipmentImpl
