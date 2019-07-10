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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DuctBank;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePosition;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireUsageKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wire Spacing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WireSpacingImpl#getIsCable <em>Is Cable</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WireSpacingImpl#getPhaseWireCount <em>Phase Wire Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WireSpacingImpl#getPhaseWireSpacing <em>Phase Wire Spacing</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WireSpacingImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WireSpacingImpl#getStructures <em>Structures</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WireSpacingImpl#getDuctBank <em>Duct Bank</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WireSpacingImpl#getWirePositions <em>Wire Positions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WireSpacingImpl extends IdentifiedObjectImpl implements WireSpacing {
    /**
     * The default value of the '{@link #getIsCable() <em>Is Cable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsCable()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_CABLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsCable() <em>Is Cable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsCable()
     * @generated
     * @ordered
     */
    protected Boolean isCable = IS_CABLE_EDEFAULT;

    /**
     * This is true if the Is Cable attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isCableESet;

    /**
     * The default value of the '{@link #getPhaseWireCount() <em>Phase Wire Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseWireCount()
     * @generated
     * @ordered
     */
    protected static final Integer PHASE_WIRE_COUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPhaseWireCount() <em>Phase Wire Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseWireCount()
     * @generated
     * @ordered
     */
    protected Integer phaseWireCount = PHASE_WIRE_COUNT_EDEFAULT;

    /**
     * This is true if the Phase Wire Count attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phaseWireCountESet;

    /**
     * The default value of the '{@link #getPhaseWireSpacing() <em>Phase Wire Spacing</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseWireSpacing()
     * @generated
     * @ordered
     */
    protected static final Float PHASE_WIRE_SPACING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPhaseWireSpacing() <em>Phase Wire Spacing</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseWireSpacing()
     * @generated
     * @ordered
     */
    protected Float phaseWireSpacing = PHASE_WIRE_SPACING_EDEFAULT;

    /**
     * This is true if the Phase Wire Spacing attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phaseWireSpacingESet;

    /**
     * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsage()
     * @generated
     * @ordered
     */
    protected static final WireUsageKind USAGE_EDEFAULT = WireUsageKind.TRANSMISSION;

    /**
     * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsage()
     * @generated
     * @ordered
     */
    protected WireUsageKind usage = USAGE_EDEFAULT;

    /**
     * This is true if the Usage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean usageESet;

    /**
     * The cached value of the '{@link #getStructures() <em>Structures</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStructures()
     * @generated
     * @ordered
     */
    protected EList< Structure > structures;

    /**
     * The cached value of the '{@link #getDuctBank() <em>Duct Bank</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDuctBank()
     * @generated
     * @ordered
     */
    protected DuctBank ductBank;

    /**
     * This is true if the Duct Bank reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ductBankESet;

    /**
     * The cached value of the '{@link #getWirePositions() <em>Wire Positions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWirePositions()
     * @generated
     * @ordered
     */
    protected EList< WirePosition > wirePositions;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WireSpacingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWireSpacing();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsCable() {
        return isCable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsCable( Boolean newIsCable ) {
        Boolean oldIsCable = isCable;
        isCable = newIsCable;
        boolean oldIsCableESet = isCableESet;
        isCableESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIRE_SPACING__IS_CABLE, oldIsCable, isCable, !oldIsCableESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsCable() {
        Boolean oldIsCable = isCable;
        boolean oldIsCableESet = isCableESet;
        isCable = IS_CABLE_EDEFAULT;
        isCableESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIRE_SPACING__IS_CABLE, oldIsCable, IS_CABLE_EDEFAULT, oldIsCableESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsCable() {
        return isCableESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getPhaseWireCount() {
        return phaseWireCount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPhaseWireCount( Integer newPhaseWireCount ) {
        Integer oldPhaseWireCount = phaseWireCount;
        phaseWireCount = newPhaseWireCount;
        boolean oldPhaseWireCountESet = phaseWireCountESet;
        phaseWireCountESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIRE_SPACING__PHASE_WIRE_COUNT,
                    oldPhaseWireCount, phaseWireCount, !oldPhaseWireCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhaseWireCount() {
        Integer oldPhaseWireCount = phaseWireCount;
        boolean oldPhaseWireCountESet = phaseWireCountESet;
        phaseWireCount = PHASE_WIRE_COUNT_EDEFAULT;
        phaseWireCountESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIRE_SPACING__PHASE_WIRE_COUNT,
                    oldPhaseWireCount, PHASE_WIRE_COUNT_EDEFAULT, oldPhaseWireCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhaseWireCount() {
        return phaseWireCountESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPhaseWireSpacing() {
        return phaseWireSpacing;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPhaseWireSpacing( Float newPhaseWireSpacing ) {
        Float oldPhaseWireSpacing = phaseWireSpacing;
        phaseWireSpacing = newPhaseWireSpacing;
        boolean oldPhaseWireSpacingESet = phaseWireSpacingESet;
        phaseWireSpacingESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIRE_SPACING__PHASE_WIRE_SPACING,
                    oldPhaseWireSpacing, phaseWireSpacing, !oldPhaseWireSpacingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhaseWireSpacing() {
        Float oldPhaseWireSpacing = phaseWireSpacing;
        boolean oldPhaseWireSpacingESet = phaseWireSpacingESet;
        phaseWireSpacing = PHASE_WIRE_SPACING_EDEFAULT;
        phaseWireSpacingESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIRE_SPACING__PHASE_WIRE_SPACING,
                    oldPhaseWireSpacing, PHASE_WIRE_SPACING_EDEFAULT, oldPhaseWireSpacingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhaseWireSpacing() {
        return phaseWireSpacingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WireUsageKind getUsage() {
        return usage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUsage( WireUsageKind newUsage ) {
        WireUsageKind oldUsage = usage;
        usage = newUsage == null ? USAGE_EDEFAULT : newUsage;
        boolean oldUsageESet = usageESet;
        usageESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIRE_SPACING__USAGE, oldUsage, usage, !oldUsageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUsage() {
        WireUsageKind oldUsage = usage;
        boolean oldUsageESet = usageESet;
        usage = USAGE_EDEFAULT;
        usageESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIRE_SPACING__USAGE, oldUsage, USAGE_EDEFAULT, oldUsageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUsage() {
        return usageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Structure > getStructures() {
        if( structures == null ) {
            structures = new EObjectWithInverseEList.Unsettable.ManyInverse< Structure >( Structure.class, this,
                    CimPackage.WIRE_SPACING__STRUCTURES, CimPackage.STRUCTURE__WIRE_SPACING_INFOS );
        }
        return structures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStructures() {
        if( structures != null ) ( ( InternalEList.Unsettable< ? > ) structures ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStructures() {
        return structures != null && ( ( InternalEList.Unsettable< ? > ) structures ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DuctBank getDuctBank() {
        return ductBank;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDuctBank( DuctBank newDuctBank, NotificationChain msgs ) {
        DuctBank oldDuctBank = ductBank;
        ductBank = newDuctBank;
        boolean oldDuctBankESet = ductBankESet;
        ductBankESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIRE_SPACING__DUCT_BANK, oldDuctBank, newDuctBank, !oldDuctBankESet );
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
    public void setDuctBank( DuctBank newDuctBank ) {
        if( newDuctBank != ductBank ) {
            NotificationChain msgs = null;
            if( ductBank != null ) msgs = ( ( InternalEObject ) ductBank ).eInverseRemove( this,
                    CimPackage.DUCT_BANK__WIRE_SPACING_INFOS, DuctBank.class, msgs );
            if( newDuctBank != null ) msgs = ( ( InternalEObject ) newDuctBank ).eInverseAdd( this,
                    CimPackage.DUCT_BANK__WIRE_SPACING_INFOS, DuctBank.class, msgs );
            msgs = basicSetDuctBank( newDuctBank, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDuctBankESet = ductBankESet;
            ductBankESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIRE_SPACING__DUCT_BANK, newDuctBank, newDuctBank, !oldDuctBankESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetDuctBank( NotificationChain msgs ) {
        DuctBank oldDuctBank = ductBank;
        ductBank = null;
        boolean oldDuctBankESet = ductBankESet;
        ductBankESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIRE_SPACING__DUCT_BANK, oldDuctBank, null, oldDuctBankESet );
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
    public void unsetDuctBank() {
        if( ductBank != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) ductBank ).eInverseRemove( this, CimPackage.DUCT_BANK__WIRE_SPACING_INFOS,
                    DuctBank.class, msgs );
            msgs = basicUnsetDuctBank( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDuctBankESet = ductBankESet;
            ductBankESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIRE_SPACING__DUCT_BANK, null, null, oldDuctBankESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDuctBank() {
        return ductBankESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< WirePosition > getWirePositions() {
        if( wirePositions == null ) {
            wirePositions = new EObjectWithInverseResolvingEList.Unsettable< WirePosition >( WirePosition.class, this,
                    CimPackage.WIRE_SPACING__WIRE_POSITIONS, CimPackage.WIRE_POSITION__WIRE_SPACING_INFO );
        }
        return wirePositions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWirePositions() {
        if( wirePositions != null ) ( ( InternalEList.Unsettable< ? > ) wirePositions ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWirePositions() {
        return wirePositions != null && ( ( InternalEList.Unsettable< ? > ) wirePositions ).isSet();
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
        case CimPackage.WIRE_SPACING__STRUCTURES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getStructures() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.WIRE_SPACING__DUCT_BANK:
            if( ductBank != null ) msgs = ( ( InternalEObject ) ductBank ).eInverseRemove( this,
                    CimPackage.DUCT_BANK__WIRE_SPACING_INFOS, DuctBank.class, msgs );
            return basicSetDuctBank( ( DuctBank ) otherEnd, msgs );
        case CimPackage.WIRE_SPACING__WIRE_POSITIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getWirePositions() )
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
        case CimPackage.WIRE_SPACING__STRUCTURES:
            return ( ( InternalEList< ? > ) getStructures() ).basicRemove( otherEnd, msgs );
        case CimPackage.WIRE_SPACING__DUCT_BANK:
            return basicUnsetDuctBank( msgs );
        case CimPackage.WIRE_SPACING__WIRE_POSITIONS:
            return ( ( InternalEList< ? > ) getWirePositions() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.WIRE_SPACING__IS_CABLE:
            return getIsCable();
        case CimPackage.WIRE_SPACING__PHASE_WIRE_COUNT:
            return getPhaseWireCount();
        case CimPackage.WIRE_SPACING__PHASE_WIRE_SPACING:
            return getPhaseWireSpacing();
        case CimPackage.WIRE_SPACING__USAGE:
            return getUsage();
        case CimPackage.WIRE_SPACING__STRUCTURES:
            return getStructures();
        case CimPackage.WIRE_SPACING__DUCT_BANK:
            return getDuctBank();
        case CimPackage.WIRE_SPACING__WIRE_POSITIONS:
            return getWirePositions();
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
        case CimPackage.WIRE_SPACING__IS_CABLE:
            setIsCable( ( Boolean ) newValue );
            return;
        case CimPackage.WIRE_SPACING__PHASE_WIRE_COUNT:
            setPhaseWireCount( ( Integer ) newValue );
            return;
        case CimPackage.WIRE_SPACING__PHASE_WIRE_SPACING:
            setPhaseWireSpacing( ( Float ) newValue );
            return;
        case CimPackage.WIRE_SPACING__USAGE:
            setUsage( ( WireUsageKind ) newValue );
            return;
        case CimPackage.WIRE_SPACING__STRUCTURES:
            getStructures().clear();
            getStructures().addAll( ( Collection< ? extends Structure > ) newValue );
            return;
        case CimPackage.WIRE_SPACING__DUCT_BANK:
            setDuctBank( ( DuctBank ) newValue );
            return;
        case CimPackage.WIRE_SPACING__WIRE_POSITIONS:
            getWirePositions().clear();
            getWirePositions().addAll( ( Collection< ? extends WirePosition > ) newValue );
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
        case CimPackage.WIRE_SPACING__IS_CABLE:
            unsetIsCable();
            return;
        case CimPackage.WIRE_SPACING__PHASE_WIRE_COUNT:
            unsetPhaseWireCount();
            return;
        case CimPackage.WIRE_SPACING__PHASE_WIRE_SPACING:
            unsetPhaseWireSpacing();
            return;
        case CimPackage.WIRE_SPACING__USAGE:
            unsetUsage();
            return;
        case CimPackage.WIRE_SPACING__STRUCTURES:
            unsetStructures();
            return;
        case CimPackage.WIRE_SPACING__DUCT_BANK:
            unsetDuctBank();
            return;
        case CimPackage.WIRE_SPACING__WIRE_POSITIONS:
            unsetWirePositions();
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
        case CimPackage.WIRE_SPACING__IS_CABLE:
            return isSetIsCable();
        case CimPackage.WIRE_SPACING__PHASE_WIRE_COUNT:
            return isSetPhaseWireCount();
        case CimPackage.WIRE_SPACING__PHASE_WIRE_SPACING:
            return isSetPhaseWireSpacing();
        case CimPackage.WIRE_SPACING__USAGE:
            return isSetUsage();
        case CimPackage.WIRE_SPACING__STRUCTURES:
            return isSetStructures();
        case CimPackage.WIRE_SPACING__DUCT_BANK:
            return isSetDuctBank();
        case CimPackage.WIRE_SPACING__WIRE_POSITIONS:
            return isSetWirePositions();
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
        result.append( " (isCable: " );
        if( isCableESet )
            result.append( isCable );
        else
            result.append( "<unset>" );
        result.append( ", phaseWireCount: " );
        if( phaseWireCountESet )
            result.append( phaseWireCount );
        else
            result.append( "<unset>" );
        result.append( ", phaseWireSpacing: " );
        if( phaseWireSpacingESet )
            result.append( phaseWireSpacing );
        else
            result.append( "<unset>" );
        result.append( ", usage: " );
        if( usageESet )
            result.append( usage );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WireSpacingImpl
