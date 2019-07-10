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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectedSwitch;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RecloseSequence;

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
 * An implementation of the model object '<em><b>Protected Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProtectedSwitchImpl#getBreakingCapacity <em>Breaking Capacity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProtectedSwitchImpl#getRecloseSequences <em>Reclose Sequences</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProtectedSwitchImpl#getOperatedByProtectionEquipment <em>Operated By Protection Equipment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtectedSwitchImpl extends SwitchImpl implements ProtectedSwitch {
    /**
     * The default value of the '{@link #getBreakingCapacity() <em>Breaking Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBreakingCapacity()
     * @generated
     * @ordered
     */
    protected static final Float BREAKING_CAPACITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBreakingCapacity() <em>Breaking Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBreakingCapacity()
     * @generated
     * @ordered
     */
    protected Float breakingCapacity = BREAKING_CAPACITY_EDEFAULT;

    /**
     * This is true if the Breaking Capacity attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean breakingCapacityESet;

    /**
     * The cached value of the '{@link #getRecloseSequences() <em>Reclose Sequences</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRecloseSequences()
     * @generated
     * @ordered
     */
    protected EList< RecloseSequence > recloseSequences;

    /**
     * The cached value of the '{@link #getOperatedByProtectionEquipment() <em>Operated By Protection Equipment</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperatedByProtectionEquipment()
     * @generated
     * @ordered
     */
    protected EList< ProtectionEquipment > operatedByProtectionEquipment;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProtectedSwitchImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getProtectedSwitch();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBreakingCapacity() {
        return breakingCapacity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBreakingCapacity( Float newBreakingCapacity ) {
        Float oldBreakingCapacity = breakingCapacity;
        breakingCapacity = newBreakingCapacity;
        boolean oldBreakingCapacityESet = breakingCapacityESet;
        breakingCapacityESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PROTECTED_SWITCH__BREAKING_CAPACITY,
                    oldBreakingCapacity, breakingCapacity, !oldBreakingCapacityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBreakingCapacity() {
        Float oldBreakingCapacity = breakingCapacity;
        boolean oldBreakingCapacityESet = breakingCapacityESet;
        breakingCapacity = BREAKING_CAPACITY_EDEFAULT;
        breakingCapacityESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PROTECTED_SWITCH__BREAKING_CAPACITY,
                    oldBreakingCapacity, BREAKING_CAPACITY_EDEFAULT, oldBreakingCapacityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBreakingCapacity() {
        return breakingCapacityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< RecloseSequence > getRecloseSequences() {
        if( recloseSequences == null ) {
            recloseSequences = new EObjectWithInverseResolvingEList.Unsettable< RecloseSequence >(
                    RecloseSequence.class, this, CimPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES,
                    CimPackage.RECLOSE_SEQUENCE__PROTECTED_SWITCH );
        }
        return recloseSequences;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRecloseSequences() {
        if( recloseSequences != null ) ( ( InternalEList.Unsettable< ? > ) recloseSequences ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRecloseSequences() {
        return recloseSequences != null && ( ( InternalEList.Unsettable< ? > ) recloseSequences ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ProtectionEquipment > getOperatedByProtectionEquipment() {
        if( operatedByProtectionEquipment == null ) {
            operatedByProtectionEquipment = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< ProtectionEquipment >(
                    ProtectionEquipment.class, this, CimPackage.PROTECTED_SWITCH__OPERATED_BY_PROTECTION_EQUIPMENT,
                    CimPackage.PROTECTION_EQUIPMENT__PROTECTED_SWITCHES );
        }
        return operatedByProtectionEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOperatedByProtectionEquipment() {
        if( operatedByProtectionEquipment != null )
            ( ( InternalEList.Unsettable< ? > ) operatedByProtectionEquipment ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOperatedByProtectionEquipment() {
        return operatedByProtectionEquipment != null
                && ( ( InternalEList.Unsettable< ? > ) operatedByProtectionEquipment ).isSet();
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
        case CimPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getRecloseSequences() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.PROTECTED_SWITCH__OPERATED_BY_PROTECTION_EQUIPMENT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOperatedByProtectionEquipment() )
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
        case CimPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES:
            return ( ( InternalEList< ? > ) getRecloseSequences() ).basicRemove( otherEnd, msgs );
        case CimPackage.PROTECTED_SWITCH__OPERATED_BY_PROTECTION_EQUIPMENT:
            return ( ( InternalEList< ? > ) getOperatedByProtectionEquipment() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.PROTECTED_SWITCH__BREAKING_CAPACITY:
            return getBreakingCapacity();
        case CimPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES:
            return getRecloseSequences();
        case CimPackage.PROTECTED_SWITCH__OPERATED_BY_PROTECTION_EQUIPMENT:
            return getOperatedByProtectionEquipment();
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
        case CimPackage.PROTECTED_SWITCH__BREAKING_CAPACITY:
            setBreakingCapacity( ( Float ) newValue );
            return;
        case CimPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES:
            getRecloseSequences().clear();
            getRecloseSequences().addAll( ( Collection< ? extends RecloseSequence > ) newValue );
            return;
        case CimPackage.PROTECTED_SWITCH__OPERATED_BY_PROTECTION_EQUIPMENT:
            getOperatedByProtectionEquipment().clear();
            getOperatedByProtectionEquipment().addAll( ( Collection< ? extends ProtectionEquipment > ) newValue );
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
        case CimPackage.PROTECTED_SWITCH__BREAKING_CAPACITY:
            unsetBreakingCapacity();
            return;
        case CimPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES:
            unsetRecloseSequences();
            return;
        case CimPackage.PROTECTED_SWITCH__OPERATED_BY_PROTECTION_EQUIPMENT:
            unsetOperatedByProtectionEquipment();
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
        case CimPackage.PROTECTED_SWITCH__BREAKING_CAPACITY:
            return isSetBreakingCapacity();
        case CimPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES:
            return isSetRecloseSequences();
        case CimPackage.PROTECTED_SWITCH__OPERATED_BY_PROTECTION_EQUIPMENT:
            return isSetOperatedByProtectionEquipment();
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
        result.append( " (breakingCapacity: " );
        if( breakingCapacityESet )
            result.append( breakingCapacity );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ProtectedSwitchImpl
