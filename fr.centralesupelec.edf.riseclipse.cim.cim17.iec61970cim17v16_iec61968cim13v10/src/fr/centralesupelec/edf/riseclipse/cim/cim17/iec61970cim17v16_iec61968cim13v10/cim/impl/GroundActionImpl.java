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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ACLineSegment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Ground;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GroundAction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TempEquipActionKind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ground Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GroundActionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GroundActionImpl#getGround <em>Ground</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GroundActionImpl#getSwitchingStepGroup <em>Switching Step Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GroundActionImpl#getAlongACLineSegment <em>Along AC Line Segment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GroundActionImpl#getGroundedEquipment <em>Grounded Equipment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroundActionImpl extends SwitchingStepImpl implements GroundAction {
    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final TempEquipActionKind KIND_EDEFAULT = TempEquipActionKind.PLACE;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected TempEquipActionKind kind = KIND_EDEFAULT;

    /**
     * This is true if the Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kindESet;

    /**
     * The cached value of the '{@link #getGround() <em>Ground</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGround()
     * @generated
     * @ordered
     */
    protected Ground ground;

    /**
     * This is true if the Ground reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean groundESet;

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
     * The cached value of the '{@link #getAlongACLineSegment() <em>Along AC Line Segment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlongACLineSegment()
     * @generated
     * @ordered
     */
    protected ACLineSegment alongACLineSegment;

    /**
     * This is true if the Along AC Line Segment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean alongACLineSegmentESet;

    /**
     * The cached value of the '{@link #getGroundedEquipment() <em>Grounded Equipment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroundedEquipment()
     * @generated
     * @ordered
     */
    protected ConductingEquipment groundedEquipment;

    /**
     * This is true if the Grounded Equipment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean groundedEquipmentESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GroundActionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getGroundAction();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TempEquipActionKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKind( TempEquipActionKind newKind ) {
        TempEquipActionKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        boolean oldKindESet = kindESet;
        kindESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GROUND_ACTION__KIND, oldKind, kind, !oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKind() {
        TempEquipActionKind oldKind = kind;
        boolean oldKindESet = kindESet;
        kind = KIND_EDEFAULT;
        kindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GROUND_ACTION__KIND, oldKind, KIND_EDEFAULT, oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKind() {
        return kindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Ground getGround() {
        if( ground != null && ground.eIsProxy() ) {
            InternalEObject oldGround = ( InternalEObject ) ground;
            ground = ( Ground ) eResolveProxy( oldGround );
            if( ground != oldGround ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.GROUND_ACTION__GROUND, oldGround, ground ) );
            }
        }
        return ground;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Ground basicGetGround() {
        return ground;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGround( Ground newGround, NotificationChain msgs ) {
        Ground oldGround = ground;
        ground = newGround;
        boolean oldGroundESet = groundESet;
        groundESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.GROUND_ACTION__GROUND, oldGround, newGround, !oldGroundESet );
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
    public void setGround( Ground newGround ) {
        if( newGround != ground ) {
            NotificationChain msgs = null;
            if( ground != null ) msgs = ( ( InternalEObject ) ground ).eInverseRemove( this,
                    CimPackage.GROUND__GROUND_ACTION, Ground.class, msgs );
            if( newGround != null ) msgs = ( ( InternalEObject ) newGround ).eInverseAdd( this,
                    CimPackage.GROUND__GROUND_ACTION, Ground.class, msgs );
            msgs = basicSetGround( newGround, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldGroundESet = groundESet;
            groundESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.GROUND_ACTION__GROUND, newGround, newGround, !oldGroundESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetGround( NotificationChain msgs ) {
        Ground oldGround = ground;
        ground = null;
        boolean oldGroundESet = groundESet;
        groundESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.GROUND_ACTION__GROUND, oldGround, null, oldGroundESet );
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
    public void unsetGround() {
        if( ground != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) ground ).eInverseRemove( this, CimPackage.GROUND__GROUND_ACTION, Ground.class,
                    msgs );
            msgs = basicUnsetGround( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldGroundESet = groundESet;
            groundESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.GROUND_ACTION__GROUND, null, null, oldGroundESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGround() {
        return groundESet;
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
                    CimPackage.GROUND_ACTION__SWITCHING_STEP_GROUP, oldSwitchingStepGroup, newSwitchingStepGroup,
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
                    CimPackage.SWITCHING_STEP_GROUP__GROUND_ACTIONS, SwitchingStepGroup.class, msgs );
            if( newSwitchingStepGroup != null ) msgs = ( ( InternalEObject ) newSwitchingStepGroup ).eInverseAdd( this,
                    CimPackage.SWITCHING_STEP_GROUP__GROUND_ACTIONS, SwitchingStepGroup.class, msgs );
            msgs = basicSetSwitchingStepGroup( newSwitchingStepGroup, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSwitchingStepGroupESet = switchingStepGroupESet;
            switchingStepGroupESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GROUND_ACTION__SWITCHING_STEP_GROUP,
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
                    CimPackage.GROUND_ACTION__SWITCHING_STEP_GROUP, oldSwitchingStepGroup, null,
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
                    CimPackage.SWITCHING_STEP_GROUP__GROUND_ACTIONS, SwitchingStepGroup.class, msgs );
            msgs = basicUnsetSwitchingStepGroup( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSwitchingStepGroupESet = switchingStepGroupESet;
            switchingStepGroupESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.GROUND_ACTION__SWITCHING_STEP_GROUP, null, null, oldSwitchingStepGroupESet ) );
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
    public ACLineSegment getAlongACLineSegment() {
        if( alongACLineSegment != null && alongACLineSegment.eIsProxy() ) {
            InternalEObject oldAlongACLineSegment = ( InternalEObject ) alongACLineSegment;
            alongACLineSegment = ( ACLineSegment ) eResolveProxy( oldAlongACLineSegment );
            if( alongACLineSegment != oldAlongACLineSegment ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.GROUND_ACTION__ALONG_AC_LINE_SEGMENT, oldAlongACLineSegment, alongACLineSegment ) );
            }
        }
        return alongACLineSegment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ACLineSegment basicGetAlongACLineSegment() {
        return alongACLineSegment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAlongACLineSegment( ACLineSegment newAlongACLineSegment, NotificationChain msgs ) {
        ACLineSegment oldAlongACLineSegment = alongACLineSegment;
        alongACLineSegment = newAlongACLineSegment;
        boolean oldAlongACLineSegmentESet = alongACLineSegmentESet;
        alongACLineSegmentESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.GROUND_ACTION__ALONG_AC_LINE_SEGMENT, oldAlongACLineSegment, newAlongACLineSegment,
                    !oldAlongACLineSegmentESet );
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
    public void setAlongACLineSegment( ACLineSegment newAlongACLineSegment ) {
        if( newAlongACLineSegment != alongACLineSegment ) {
            NotificationChain msgs = null;
            if( alongACLineSegment != null ) msgs = ( ( InternalEObject ) alongACLineSegment ).eInverseRemove( this,
                    CimPackage.AC_LINE_SEGMENT__LINE_GROUNDING_ACTION, ACLineSegment.class, msgs );
            if( newAlongACLineSegment != null ) msgs = ( ( InternalEObject ) newAlongACLineSegment ).eInverseAdd( this,
                    CimPackage.AC_LINE_SEGMENT__LINE_GROUNDING_ACTION, ACLineSegment.class, msgs );
            msgs = basicSetAlongACLineSegment( newAlongACLineSegment, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAlongACLineSegmentESet = alongACLineSegmentESet;
            alongACLineSegmentESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GROUND_ACTION__ALONG_AC_LINE_SEGMENT,
                        newAlongACLineSegment, newAlongACLineSegment, !oldAlongACLineSegmentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAlongACLineSegment( NotificationChain msgs ) {
        ACLineSegment oldAlongACLineSegment = alongACLineSegment;
        alongACLineSegment = null;
        boolean oldAlongACLineSegmentESet = alongACLineSegmentESet;
        alongACLineSegmentESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.GROUND_ACTION__ALONG_AC_LINE_SEGMENT, oldAlongACLineSegment, null,
                    oldAlongACLineSegmentESet );
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
    public void unsetAlongACLineSegment() {
        if( alongACLineSegment != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) alongACLineSegment ).eInverseRemove( this,
                    CimPackage.AC_LINE_SEGMENT__LINE_GROUNDING_ACTION, ACLineSegment.class, msgs );
            msgs = basicUnsetAlongACLineSegment( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAlongACLineSegmentESet = alongACLineSegmentESet;
            alongACLineSegmentESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.GROUND_ACTION__ALONG_AC_LINE_SEGMENT, null, null, oldAlongACLineSegmentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAlongACLineSegment() {
        return alongACLineSegmentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConductingEquipment getGroundedEquipment() {
        if( groundedEquipment != null && groundedEquipment.eIsProxy() ) {
            InternalEObject oldGroundedEquipment = ( InternalEObject ) groundedEquipment;
            groundedEquipment = ( ConductingEquipment ) eResolveProxy( oldGroundedEquipment );
            if( groundedEquipment != oldGroundedEquipment ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.GROUND_ACTION__GROUNDED_EQUIPMENT, oldGroundedEquipment, groundedEquipment ) );
            }
        }
        return groundedEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConductingEquipment basicGetGroundedEquipment() {
        return groundedEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGroundedEquipment( ConductingEquipment newGroundedEquipment,
            NotificationChain msgs ) {
        ConductingEquipment oldGroundedEquipment = groundedEquipment;
        groundedEquipment = newGroundedEquipment;
        boolean oldGroundedEquipmentESet = groundedEquipmentESet;
        groundedEquipmentESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.GROUND_ACTION__GROUNDED_EQUIPMENT, oldGroundedEquipment, newGroundedEquipment,
                    !oldGroundedEquipmentESet );
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
    public void setGroundedEquipment( ConductingEquipment newGroundedEquipment ) {
        if( newGroundedEquipment != groundedEquipment ) {
            NotificationChain msgs = null;
            if( groundedEquipment != null ) msgs = ( ( InternalEObject ) groundedEquipment ).eInverseRemove( this,
                    CimPackage.CONDUCTING_EQUIPMENT__GROUNDING_ACTION, ConductingEquipment.class, msgs );
            if( newGroundedEquipment != null ) msgs = ( ( InternalEObject ) newGroundedEquipment ).eInverseAdd( this,
                    CimPackage.CONDUCTING_EQUIPMENT__GROUNDING_ACTION, ConductingEquipment.class, msgs );
            msgs = basicSetGroundedEquipment( newGroundedEquipment, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldGroundedEquipmentESet = groundedEquipmentESet;
            groundedEquipmentESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GROUND_ACTION__GROUNDED_EQUIPMENT,
                        newGroundedEquipment, newGroundedEquipment, !oldGroundedEquipmentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetGroundedEquipment( NotificationChain msgs ) {
        ConductingEquipment oldGroundedEquipment = groundedEquipment;
        groundedEquipment = null;
        boolean oldGroundedEquipmentESet = groundedEquipmentESet;
        groundedEquipmentESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.GROUND_ACTION__GROUNDED_EQUIPMENT, oldGroundedEquipment, null,
                    oldGroundedEquipmentESet );
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
    public void unsetGroundedEquipment() {
        if( groundedEquipment != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) groundedEquipment ).eInverseRemove( this,
                    CimPackage.CONDUCTING_EQUIPMENT__GROUNDING_ACTION, ConductingEquipment.class, msgs );
            msgs = basicUnsetGroundedEquipment( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldGroundedEquipmentESet = groundedEquipmentESet;
            groundedEquipmentESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.GROUND_ACTION__GROUNDED_EQUIPMENT, null, null, oldGroundedEquipmentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGroundedEquipment() {
        return groundedEquipmentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.GROUND_ACTION__GROUND:
            if( ground != null ) msgs = ( ( InternalEObject ) ground ).eInverseRemove( this,
                    CimPackage.GROUND__GROUND_ACTION, Ground.class, msgs );
            return basicSetGround( ( Ground ) otherEnd, msgs );
        case CimPackage.GROUND_ACTION__SWITCHING_STEP_GROUP:
            if( switchingStepGroup != null ) msgs = ( ( InternalEObject ) switchingStepGroup ).eInverseRemove( this,
                    CimPackage.SWITCHING_STEP_GROUP__GROUND_ACTIONS, SwitchingStepGroup.class, msgs );
            return basicSetSwitchingStepGroup( ( SwitchingStepGroup ) otherEnd, msgs );
        case CimPackage.GROUND_ACTION__ALONG_AC_LINE_SEGMENT:
            if( alongACLineSegment != null ) msgs = ( ( InternalEObject ) alongACLineSegment ).eInverseRemove( this,
                    CimPackage.AC_LINE_SEGMENT__LINE_GROUNDING_ACTION, ACLineSegment.class, msgs );
            return basicSetAlongACLineSegment( ( ACLineSegment ) otherEnd, msgs );
        case CimPackage.GROUND_ACTION__GROUNDED_EQUIPMENT:
            if( groundedEquipment != null ) msgs = ( ( InternalEObject ) groundedEquipment ).eInverseRemove( this,
                    CimPackage.CONDUCTING_EQUIPMENT__GROUNDING_ACTION, ConductingEquipment.class, msgs );
            return basicSetGroundedEquipment( ( ConductingEquipment ) otherEnd, msgs );
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
        case CimPackage.GROUND_ACTION__GROUND:
            return basicUnsetGround( msgs );
        case CimPackage.GROUND_ACTION__SWITCHING_STEP_GROUP:
            return basicUnsetSwitchingStepGroup( msgs );
        case CimPackage.GROUND_ACTION__ALONG_AC_LINE_SEGMENT:
            return basicUnsetAlongACLineSegment( msgs );
        case CimPackage.GROUND_ACTION__GROUNDED_EQUIPMENT:
            return basicUnsetGroundedEquipment( msgs );
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
        case CimPackage.GROUND_ACTION__KIND:
            return getKind();
        case CimPackage.GROUND_ACTION__GROUND:
            if( resolve ) return getGround();
            return basicGetGround();
        case CimPackage.GROUND_ACTION__SWITCHING_STEP_GROUP:
            return getSwitchingStepGroup();
        case CimPackage.GROUND_ACTION__ALONG_AC_LINE_SEGMENT:
            if( resolve ) return getAlongACLineSegment();
            return basicGetAlongACLineSegment();
        case CimPackage.GROUND_ACTION__GROUNDED_EQUIPMENT:
            if( resolve ) return getGroundedEquipment();
            return basicGetGroundedEquipment();
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
        case CimPackage.GROUND_ACTION__KIND:
            setKind( ( TempEquipActionKind ) newValue );
            return;
        case CimPackage.GROUND_ACTION__GROUND:
            setGround( ( Ground ) newValue );
            return;
        case CimPackage.GROUND_ACTION__SWITCHING_STEP_GROUP:
            setSwitchingStepGroup( ( SwitchingStepGroup ) newValue );
            return;
        case CimPackage.GROUND_ACTION__ALONG_AC_LINE_SEGMENT:
            setAlongACLineSegment( ( ACLineSegment ) newValue );
            return;
        case CimPackage.GROUND_ACTION__GROUNDED_EQUIPMENT:
            setGroundedEquipment( ( ConductingEquipment ) newValue );
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
        case CimPackage.GROUND_ACTION__KIND:
            unsetKind();
            return;
        case CimPackage.GROUND_ACTION__GROUND:
            unsetGround();
            return;
        case CimPackage.GROUND_ACTION__SWITCHING_STEP_GROUP:
            unsetSwitchingStepGroup();
            return;
        case CimPackage.GROUND_ACTION__ALONG_AC_LINE_SEGMENT:
            unsetAlongACLineSegment();
            return;
        case CimPackage.GROUND_ACTION__GROUNDED_EQUIPMENT:
            unsetGroundedEquipment();
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
        case CimPackage.GROUND_ACTION__KIND:
            return isSetKind();
        case CimPackage.GROUND_ACTION__GROUND:
            return isSetGround();
        case CimPackage.GROUND_ACTION__SWITCHING_STEP_GROUP:
            return isSetSwitchingStepGroup();
        case CimPackage.GROUND_ACTION__ALONG_AC_LINE_SEGMENT:
            return isSetAlongACLineSegment();
        case CimPackage.GROUND_ACTION__GROUNDED_EQUIPMENT:
            return isSetGroundedEquipment();
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

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (kind: " );
        if( kindESet )
            result.append( kind );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //GroundActionImpl
