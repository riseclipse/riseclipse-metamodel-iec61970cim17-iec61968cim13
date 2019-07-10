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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ACLineSegment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Jumper;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.JumperAction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TempEquipActionKind;

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
 * An implementation of the model object '<em><b>Jumper Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.JumperActionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.JumperActionImpl#getJumpedEquipments <em>Jumped Equipments</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.JumperActionImpl#getJumper <em>Jumper</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.JumperActionImpl#getSwitchingStepGroup <em>Switching Step Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.JumperActionImpl#getAlongACLineSegments <em>Along AC Line Segments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JumperActionImpl extends SwitchingStepImpl implements JumperAction {
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
     * The cached value of the '{@link #getJumpedEquipments() <em>Jumped Equipments</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJumpedEquipments()
     * @generated
     * @ordered
     */
    protected EList< ConductingEquipment > jumpedEquipments;

    /**
     * The cached value of the '{@link #getJumper() <em>Jumper</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJumper()
     * @generated
     * @ordered
     */
    protected Jumper jumper;

    /**
     * This is true if the Jumper reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean jumperESet;

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
     * The cached value of the '{@link #getAlongACLineSegments() <em>Along AC Line Segments</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlongACLineSegments()
     * @generated
     * @ordered
     */
    protected EList< ACLineSegment > alongACLineSegments;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JumperActionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getJumperAction();
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
                CimPackage.JUMPER_ACTION__KIND, oldKind, kind, !oldKindESet ) );
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
                CimPackage.JUMPER_ACTION__KIND, oldKind, KIND_EDEFAULT, oldKindESet ) );
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
    public EList< ConductingEquipment > getJumpedEquipments() {
        if( jumpedEquipments == null ) {
            jumpedEquipments = new EObjectWithInverseResolvingEList.Unsettable< ConductingEquipment >(
                    ConductingEquipment.class, this, CimPackage.JUMPER_ACTION__JUMPED_EQUIPMENTS,
                    CimPackage.CONDUCTING_EQUIPMENT__JUMPING_ACTION );
        }
        return jumpedEquipments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetJumpedEquipments() {
        if( jumpedEquipments != null ) ( ( InternalEList.Unsettable< ? > ) jumpedEquipments ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetJumpedEquipments() {
        return jumpedEquipments != null && ( ( InternalEList.Unsettable< ? > ) jumpedEquipments ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Jumper getJumper() {
        if( jumper != null && jumper.eIsProxy() ) {
            InternalEObject oldJumper = ( InternalEObject ) jumper;
            jumper = ( Jumper ) eResolveProxy( oldJumper );
            if( jumper != oldJumper ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.JUMPER_ACTION__JUMPER, oldJumper, jumper ) );
            }
        }
        return jumper;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Jumper basicGetJumper() {
        return jumper;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetJumper( Jumper newJumper, NotificationChain msgs ) {
        Jumper oldJumper = jumper;
        jumper = newJumper;
        boolean oldJumperESet = jumperESet;
        jumperESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.JUMPER_ACTION__JUMPER, oldJumper, newJumper, !oldJumperESet );
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
    public void setJumper( Jumper newJumper ) {
        if( newJumper != jumper ) {
            NotificationChain msgs = null;
            if( jumper != null ) msgs = ( ( InternalEObject ) jumper ).eInverseRemove( this,
                    CimPackage.JUMPER__JUMPER_ACTION, Jumper.class, msgs );
            if( newJumper != null ) msgs = ( ( InternalEObject ) newJumper ).eInverseAdd( this,
                    CimPackage.JUMPER__JUMPER_ACTION, Jumper.class, msgs );
            msgs = basicSetJumper( newJumper, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldJumperESet = jumperESet;
            jumperESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.JUMPER_ACTION__JUMPER, newJumper, newJumper, !oldJumperESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetJumper( NotificationChain msgs ) {
        Jumper oldJumper = jumper;
        jumper = null;
        boolean oldJumperESet = jumperESet;
        jumperESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.JUMPER_ACTION__JUMPER, oldJumper, null, oldJumperESet );
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
    public void unsetJumper() {
        if( jumper != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) jumper ).eInverseRemove( this, CimPackage.JUMPER__JUMPER_ACTION, Jumper.class,
                    msgs );
            msgs = basicUnsetJumper( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldJumperESet = jumperESet;
            jumperESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.JUMPER_ACTION__JUMPER, null, null, oldJumperESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetJumper() {
        return jumperESet;
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
                    CimPackage.JUMPER_ACTION__SWITCHING_STEP_GROUP, oldSwitchingStepGroup, newSwitchingStepGroup,
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
                    CimPackage.SWITCHING_STEP_GROUP__JUMPER_ACTIONS, SwitchingStepGroup.class, msgs );
            if( newSwitchingStepGroup != null ) msgs = ( ( InternalEObject ) newSwitchingStepGroup ).eInverseAdd( this,
                    CimPackage.SWITCHING_STEP_GROUP__JUMPER_ACTIONS, SwitchingStepGroup.class, msgs );
            msgs = basicSetSwitchingStepGroup( newSwitchingStepGroup, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSwitchingStepGroupESet = switchingStepGroupESet;
            switchingStepGroupESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.JUMPER_ACTION__SWITCHING_STEP_GROUP,
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
                    CimPackage.JUMPER_ACTION__SWITCHING_STEP_GROUP, oldSwitchingStepGroup, null,
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
                    CimPackage.SWITCHING_STEP_GROUP__JUMPER_ACTIONS, SwitchingStepGroup.class, msgs );
            msgs = basicUnsetSwitchingStepGroup( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSwitchingStepGroupESet = switchingStepGroupESet;
            switchingStepGroupESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.JUMPER_ACTION__SWITCHING_STEP_GROUP, null, null, oldSwitchingStepGroupESet ) );
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
    public EList< ACLineSegment > getAlongACLineSegments() {
        if( alongACLineSegments == null ) {
            alongACLineSegments = new EObjectWithInverseResolvingEList.Unsettable< ACLineSegment >( ACLineSegment.class,
                    this, CimPackage.JUMPER_ACTION__ALONG_AC_LINE_SEGMENTS,
                    CimPackage.AC_LINE_SEGMENT__LINE_JUMPING_ACTION );
        }
        return alongACLineSegments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAlongACLineSegments() {
        if( alongACLineSegments != null ) ( ( InternalEList.Unsettable< ? > ) alongACLineSegments ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAlongACLineSegments() {
        return alongACLineSegments != null && ( ( InternalEList.Unsettable< ? > ) alongACLineSegments ).isSet();
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
        case CimPackage.JUMPER_ACTION__JUMPED_EQUIPMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getJumpedEquipments() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.JUMPER_ACTION__JUMPER:
            if( jumper != null ) msgs = ( ( InternalEObject ) jumper ).eInverseRemove( this,
                    CimPackage.JUMPER__JUMPER_ACTION, Jumper.class, msgs );
            return basicSetJumper( ( Jumper ) otherEnd, msgs );
        case CimPackage.JUMPER_ACTION__SWITCHING_STEP_GROUP:
            if( switchingStepGroup != null ) msgs = ( ( InternalEObject ) switchingStepGroup ).eInverseRemove( this,
                    CimPackage.SWITCHING_STEP_GROUP__JUMPER_ACTIONS, SwitchingStepGroup.class, msgs );
            return basicSetSwitchingStepGroup( ( SwitchingStepGroup ) otherEnd, msgs );
        case CimPackage.JUMPER_ACTION__ALONG_AC_LINE_SEGMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAlongACLineSegments() )
                    .basicAdd( otherEnd, msgs );
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
        case CimPackage.JUMPER_ACTION__JUMPED_EQUIPMENTS:
            return ( ( InternalEList< ? > ) getJumpedEquipments() ).basicRemove( otherEnd, msgs );
        case CimPackage.JUMPER_ACTION__JUMPER:
            return basicUnsetJumper( msgs );
        case CimPackage.JUMPER_ACTION__SWITCHING_STEP_GROUP:
            return basicUnsetSwitchingStepGroup( msgs );
        case CimPackage.JUMPER_ACTION__ALONG_AC_LINE_SEGMENTS:
            return ( ( InternalEList< ? > ) getAlongACLineSegments() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.JUMPER_ACTION__KIND:
            return getKind();
        case CimPackage.JUMPER_ACTION__JUMPED_EQUIPMENTS:
            return getJumpedEquipments();
        case CimPackage.JUMPER_ACTION__JUMPER:
            if( resolve ) return getJumper();
            return basicGetJumper();
        case CimPackage.JUMPER_ACTION__SWITCHING_STEP_GROUP:
            return getSwitchingStepGroup();
        case CimPackage.JUMPER_ACTION__ALONG_AC_LINE_SEGMENTS:
            return getAlongACLineSegments();
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
        case CimPackage.JUMPER_ACTION__KIND:
            setKind( ( TempEquipActionKind ) newValue );
            return;
        case CimPackage.JUMPER_ACTION__JUMPED_EQUIPMENTS:
            getJumpedEquipments().clear();
            getJumpedEquipments().addAll( ( Collection< ? extends ConductingEquipment > ) newValue );
            return;
        case CimPackage.JUMPER_ACTION__JUMPER:
            setJumper( ( Jumper ) newValue );
            return;
        case CimPackage.JUMPER_ACTION__SWITCHING_STEP_GROUP:
            setSwitchingStepGroup( ( SwitchingStepGroup ) newValue );
            return;
        case CimPackage.JUMPER_ACTION__ALONG_AC_LINE_SEGMENTS:
            getAlongACLineSegments().clear();
            getAlongACLineSegments().addAll( ( Collection< ? extends ACLineSegment > ) newValue );
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
        case CimPackage.JUMPER_ACTION__KIND:
            unsetKind();
            return;
        case CimPackage.JUMPER_ACTION__JUMPED_EQUIPMENTS:
            unsetJumpedEquipments();
            return;
        case CimPackage.JUMPER_ACTION__JUMPER:
            unsetJumper();
            return;
        case CimPackage.JUMPER_ACTION__SWITCHING_STEP_GROUP:
            unsetSwitchingStepGroup();
            return;
        case CimPackage.JUMPER_ACTION__ALONG_AC_LINE_SEGMENTS:
            unsetAlongACLineSegments();
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
        case CimPackage.JUMPER_ACTION__KIND:
            return isSetKind();
        case CimPackage.JUMPER_ACTION__JUMPED_EQUIPMENTS:
            return isSetJumpedEquipments();
        case CimPackage.JUMPER_ACTION__JUMPER:
            return isSetJumper();
        case CimPackage.JUMPER_ACTION__SWITCHING_STEP_GROUP:
            return isSetSwitchingStepGroup();
        case CimPackage.JUMPER_ACTION__ALONG_AC_LINE_SEGMENTS:
            return isSetAlongACLineSegments();
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
        result.append( " (kind: " );
        if( kindESet )
            result.append( kind );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //JumperActionImpl
