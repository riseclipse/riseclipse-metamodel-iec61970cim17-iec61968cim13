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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccountingUnit;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ChargeKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConsumptionTariffInterval;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeTariffInterval;

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
 * An implementation of the model object '<em><b>Charge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ChargeImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ChargeImpl#getVariablePortion <em>Variable Portion</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ChargeImpl#getFixedPortion <em>Fixed Portion</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ChargeImpl#getParentCharge <em>Parent Charge</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ChargeImpl#getTimeTariffIntervals <em>Time Tariff Intervals</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ChargeImpl#getAuxiliaryAccounts <em>Auxiliary Accounts</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ChargeImpl#getChildCharges <em>Child Charges</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ChargeImpl#getConsumptionTariffIntervals <em>Consumption Tariff Intervals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChargeImpl extends IdentifiedObjectImpl implements Charge {
    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final ChargeKind KIND_EDEFAULT = ChargeKind.CONSUMPTION_CHARGE;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected ChargeKind kind = KIND_EDEFAULT;

    /**
     * This is true if the Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kindESet;

    /**
     * The default value of the '{@link #getVariablePortion() <em>Variable Portion</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariablePortion()
     * @generated
     * @ordered
     */
    protected static final Float VARIABLE_PORTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVariablePortion() <em>Variable Portion</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariablePortion()
     * @generated
     * @ordered
     */
    protected Float variablePortion = VARIABLE_PORTION_EDEFAULT;

    /**
     * This is true if the Variable Portion attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean variablePortionESet;

    /**
     * The cached value of the '{@link #getFixedPortion() <em>Fixed Portion</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFixedPortion()
     * @generated
     * @ordered
     */
    protected AccountingUnit fixedPortion;

    /**
     * This is true if the Fixed Portion containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fixedPortionESet;

    /**
     * The cached value of the '{@link #getParentCharge() <em>Parent Charge</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParentCharge()
     * @generated
     * @ordered
     */
    protected Charge parentCharge;

    /**
     * This is true if the Parent Charge reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean parentChargeESet;

    /**
     * The cached value of the '{@link #getTimeTariffIntervals() <em>Time Tariff Intervals</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeTariffIntervals()
     * @generated
     * @ordered
     */
    protected EList< TimeTariffInterval > timeTariffIntervals;

    /**
     * The cached value of the '{@link #getAuxiliaryAccounts() <em>Auxiliary Accounts</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuxiliaryAccounts()
     * @generated
     * @ordered
     */
    protected EList< AuxiliaryAccount > auxiliaryAccounts;

    /**
     * The cached value of the '{@link #getChildCharges() <em>Child Charges</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChildCharges()
     * @generated
     * @ordered
     */
    protected EList< Charge > childCharges;

    /**
     * The cached value of the '{@link #getConsumptionTariffIntervals() <em>Consumption Tariff Intervals</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsumptionTariffIntervals()
     * @generated
     * @ordered
     */
    protected EList< ConsumptionTariffInterval > consumptionTariffIntervals;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChargeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCharge();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ChargeKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKind( ChargeKind newKind ) {
        ChargeKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        boolean oldKindESet = kindESet;
        kindESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.CHARGE__KIND, oldKind, kind, !oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKind() {
        ChargeKind oldKind = kind;
        boolean oldKindESet = kindESet;
        kind = KIND_EDEFAULT;
        kindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CHARGE__KIND,
                oldKind, KIND_EDEFAULT, oldKindESet ) );
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
    public Float getVariablePortion() {
        return variablePortion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVariablePortion( Float newVariablePortion ) {
        Float oldVariablePortion = variablePortion;
        variablePortion = newVariablePortion;
        boolean oldVariablePortionESet = variablePortionESet;
        variablePortionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CHARGE__VARIABLE_PORTION, oldVariablePortion, variablePortion, !oldVariablePortionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVariablePortion() {
        Float oldVariablePortion = variablePortion;
        boolean oldVariablePortionESet = variablePortionESet;
        variablePortion = VARIABLE_PORTION_EDEFAULT;
        variablePortionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CHARGE__VARIABLE_PORTION,
                    oldVariablePortion, VARIABLE_PORTION_EDEFAULT, oldVariablePortionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVariablePortion() {
        return variablePortionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccountingUnit getFixedPortion() {
        return fixedPortion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFixedPortion( AccountingUnit newFixedPortion, NotificationChain msgs ) {
        AccountingUnit oldFixedPortion = fixedPortion;
        fixedPortion = newFixedPortion;
        boolean oldFixedPortionESet = fixedPortionESet;
        fixedPortionESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CHARGE__FIXED_PORTION, oldFixedPortion, newFixedPortion, !oldFixedPortionESet );
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
    public void setFixedPortion( AccountingUnit newFixedPortion ) {
        if( newFixedPortion != fixedPortion ) {
            NotificationChain msgs = null;
            if( fixedPortion != null ) msgs = ( ( InternalEObject ) fixedPortion ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.CHARGE__FIXED_PORTION, null, msgs );
            if( newFixedPortion != null ) msgs = ( ( InternalEObject ) newFixedPortion ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.CHARGE__FIXED_PORTION, null, msgs );
            msgs = basicSetFixedPortion( newFixedPortion, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldFixedPortionESet = fixedPortionESet;
            fixedPortionESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CHARGE__FIXED_PORTION, newFixedPortion, newFixedPortion, !oldFixedPortionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetFixedPortion( NotificationChain msgs ) {
        AccountingUnit oldFixedPortion = fixedPortion;
        fixedPortion = null;
        boolean oldFixedPortionESet = fixedPortionESet;
        fixedPortionESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CHARGE__FIXED_PORTION, oldFixedPortion, null, oldFixedPortionESet );
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
    public void unsetFixedPortion() {
        if( fixedPortion != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) fixedPortion ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.CHARGE__FIXED_PORTION, null, msgs );
            msgs = basicUnsetFixedPortion( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldFixedPortionESet = fixedPortionESet;
            fixedPortionESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CHARGE__FIXED_PORTION, null, null, oldFixedPortionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFixedPortion() {
        return fixedPortionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Charge getParentCharge() {
        return parentCharge;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentCharge( Charge newParentCharge, NotificationChain msgs ) {
        Charge oldParentCharge = parentCharge;
        parentCharge = newParentCharge;
        boolean oldParentChargeESet = parentChargeESet;
        parentChargeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CHARGE__PARENT_CHARGE, oldParentCharge, newParentCharge, !oldParentChargeESet );
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
    public void setParentCharge( Charge newParentCharge ) {
        if( newParentCharge != parentCharge ) {
            NotificationChain msgs = null;
            if( parentCharge != null ) msgs = ( ( InternalEObject ) parentCharge ).eInverseRemove( this,
                    CimPackage.CHARGE__CHILD_CHARGES, Charge.class, msgs );
            if( newParentCharge != null ) msgs = ( ( InternalEObject ) newParentCharge ).eInverseAdd( this,
                    CimPackage.CHARGE__CHILD_CHARGES, Charge.class, msgs );
            msgs = basicSetParentCharge( newParentCharge, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldParentChargeESet = parentChargeESet;
            parentChargeESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CHARGE__PARENT_CHARGE, newParentCharge, newParentCharge, !oldParentChargeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetParentCharge( NotificationChain msgs ) {
        Charge oldParentCharge = parentCharge;
        parentCharge = null;
        boolean oldParentChargeESet = parentChargeESet;
        parentChargeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CHARGE__PARENT_CHARGE, oldParentCharge, null, oldParentChargeESet );
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
    public void unsetParentCharge() {
        if( parentCharge != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) parentCharge ).eInverseRemove( this, CimPackage.CHARGE__CHILD_CHARGES,
                    Charge.class, msgs );
            msgs = basicUnsetParentCharge( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldParentChargeESet = parentChargeESet;
            parentChargeESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CHARGE__PARENT_CHARGE, null, null, oldParentChargeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetParentCharge() {
        return parentChargeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TimeTariffInterval > getTimeTariffIntervals() {
        if( timeTariffIntervals == null ) {
            timeTariffIntervals = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< TimeTariffInterval >(
                    TimeTariffInterval.class, this, CimPackage.CHARGE__TIME_TARIFF_INTERVALS,
                    CimPackage.TIME_TARIFF_INTERVAL__CHARGES );
        }
        return timeTariffIntervals;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTimeTariffIntervals() {
        if( timeTariffIntervals != null ) ( ( InternalEList.Unsettable< ? > ) timeTariffIntervals ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTimeTariffIntervals() {
        return timeTariffIntervals != null && ( ( InternalEList.Unsettable< ? > ) timeTariffIntervals ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AuxiliaryAccount > getAuxiliaryAccounts() {
        if( auxiliaryAccounts == null ) {
            auxiliaryAccounts = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< AuxiliaryAccount >(
                    AuxiliaryAccount.class, this, CimPackage.CHARGE__AUXILIARY_ACCOUNTS,
                    CimPackage.AUXILIARY_ACCOUNT__CHARGES );
        }
        return auxiliaryAccounts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAuxiliaryAccounts() {
        if( auxiliaryAccounts != null ) ( ( InternalEList.Unsettable< ? > ) auxiliaryAccounts ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAuxiliaryAccounts() {
        return auxiliaryAccounts != null && ( ( InternalEList.Unsettable< ? > ) auxiliaryAccounts ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Charge > getChildCharges() {
        if( childCharges == null ) {
            childCharges = new EObjectWithInverseResolvingEList.Unsettable< Charge >( Charge.class, this,
                    CimPackage.CHARGE__CHILD_CHARGES, CimPackage.CHARGE__PARENT_CHARGE );
        }
        return childCharges;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetChildCharges() {
        if( childCharges != null ) ( ( InternalEList.Unsettable< ? > ) childCharges ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetChildCharges() {
        return childCharges != null && ( ( InternalEList.Unsettable< ? > ) childCharges ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ConsumptionTariffInterval > getConsumptionTariffIntervals() {
        if( consumptionTariffIntervals == null ) {
            consumptionTariffIntervals = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< ConsumptionTariffInterval >(
                    ConsumptionTariffInterval.class, this, CimPackage.CHARGE__CONSUMPTION_TARIFF_INTERVALS,
                    CimPackage.CONSUMPTION_TARIFF_INTERVAL__CHARGES );
        }
        return consumptionTariffIntervals;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConsumptionTariffIntervals() {
        if( consumptionTariffIntervals != null )
            ( ( InternalEList.Unsettable< ? > ) consumptionTariffIntervals ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConsumptionTariffIntervals() {
        return consumptionTariffIntervals != null
                && ( ( InternalEList.Unsettable< ? > ) consumptionTariffIntervals ).isSet();
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
        case CimPackage.CHARGE__PARENT_CHARGE:
            if( parentCharge != null ) msgs = ( ( InternalEObject ) parentCharge ).eInverseRemove( this,
                    CimPackage.CHARGE__CHILD_CHARGES, Charge.class, msgs );
            return basicSetParentCharge( ( Charge ) otherEnd, msgs );
        case CimPackage.CHARGE__TIME_TARIFF_INTERVALS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTimeTariffIntervals() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.CHARGE__AUXILIARY_ACCOUNTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAuxiliaryAccounts() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.CHARGE__CHILD_CHARGES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getChildCharges() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.CHARGE__CONSUMPTION_TARIFF_INTERVALS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getConsumptionTariffIntervals() )
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
        case CimPackage.CHARGE__FIXED_PORTION:
            return basicUnsetFixedPortion( msgs );
        case CimPackage.CHARGE__PARENT_CHARGE:
            return basicUnsetParentCharge( msgs );
        case CimPackage.CHARGE__TIME_TARIFF_INTERVALS:
            return ( ( InternalEList< ? > ) getTimeTariffIntervals() ).basicRemove( otherEnd, msgs );
        case CimPackage.CHARGE__AUXILIARY_ACCOUNTS:
            return ( ( InternalEList< ? > ) getAuxiliaryAccounts() ).basicRemove( otherEnd, msgs );
        case CimPackage.CHARGE__CHILD_CHARGES:
            return ( ( InternalEList< ? > ) getChildCharges() ).basicRemove( otherEnd, msgs );
        case CimPackage.CHARGE__CONSUMPTION_TARIFF_INTERVALS:
            return ( ( InternalEList< ? > ) getConsumptionTariffIntervals() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.CHARGE__KIND:
            return getKind();
        case CimPackage.CHARGE__VARIABLE_PORTION:
            return getVariablePortion();
        case CimPackage.CHARGE__FIXED_PORTION:
            return getFixedPortion();
        case CimPackage.CHARGE__PARENT_CHARGE:
            return getParentCharge();
        case CimPackage.CHARGE__TIME_TARIFF_INTERVALS:
            return getTimeTariffIntervals();
        case CimPackage.CHARGE__AUXILIARY_ACCOUNTS:
            return getAuxiliaryAccounts();
        case CimPackage.CHARGE__CHILD_CHARGES:
            return getChildCharges();
        case CimPackage.CHARGE__CONSUMPTION_TARIFF_INTERVALS:
            return getConsumptionTariffIntervals();
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
        case CimPackage.CHARGE__KIND:
            setKind( ( ChargeKind ) newValue );
            return;
        case CimPackage.CHARGE__VARIABLE_PORTION:
            setVariablePortion( ( Float ) newValue );
            return;
        case CimPackage.CHARGE__FIXED_PORTION:
            setFixedPortion( ( AccountingUnit ) newValue );
            return;
        case CimPackage.CHARGE__PARENT_CHARGE:
            setParentCharge( ( Charge ) newValue );
            return;
        case CimPackage.CHARGE__TIME_TARIFF_INTERVALS:
            getTimeTariffIntervals().clear();
            getTimeTariffIntervals().addAll( ( Collection< ? extends TimeTariffInterval > ) newValue );
            return;
        case CimPackage.CHARGE__AUXILIARY_ACCOUNTS:
            getAuxiliaryAccounts().clear();
            getAuxiliaryAccounts().addAll( ( Collection< ? extends AuxiliaryAccount > ) newValue );
            return;
        case CimPackage.CHARGE__CHILD_CHARGES:
            getChildCharges().clear();
            getChildCharges().addAll( ( Collection< ? extends Charge > ) newValue );
            return;
        case CimPackage.CHARGE__CONSUMPTION_TARIFF_INTERVALS:
            getConsumptionTariffIntervals().clear();
            getConsumptionTariffIntervals().addAll( ( Collection< ? extends ConsumptionTariffInterval > ) newValue );
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
        case CimPackage.CHARGE__KIND:
            unsetKind();
            return;
        case CimPackage.CHARGE__VARIABLE_PORTION:
            unsetVariablePortion();
            return;
        case CimPackage.CHARGE__FIXED_PORTION:
            unsetFixedPortion();
            return;
        case CimPackage.CHARGE__PARENT_CHARGE:
            unsetParentCharge();
            return;
        case CimPackage.CHARGE__TIME_TARIFF_INTERVALS:
            unsetTimeTariffIntervals();
            return;
        case CimPackage.CHARGE__AUXILIARY_ACCOUNTS:
            unsetAuxiliaryAccounts();
            return;
        case CimPackage.CHARGE__CHILD_CHARGES:
            unsetChildCharges();
            return;
        case CimPackage.CHARGE__CONSUMPTION_TARIFF_INTERVALS:
            unsetConsumptionTariffIntervals();
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
        case CimPackage.CHARGE__KIND:
            return isSetKind();
        case CimPackage.CHARGE__VARIABLE_PORTION:
            return isSetVariablePortion();
        case CimPackage.CHARGE__FIXED_PORTION:
            return isSetFixedPortion();
        case CimPackage.CHARGE__PARENT_CHARGE:
            return isSetParentCharge();
        case CimPackage.CHARGE__TIME_TARIFF_INTERVALS:
            return isSetTimeTariffIntervals();
        case CimPackage.CHARGE__AUXILIARY_ACCOUNTS:
            return isSetAuxiliaryAccounts();
        case CimPackage.CHARGE__CHILD_CHARGES:
            return isSetChildCharges();
        case CimPackage.CHARGE__CONSUMPTION_TARIFF_INTERVALS:
            return isSetConsumptionTariffIntervals();
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
        result.append( ", variablePortion: " );
        if( variablePortionESet )
            result.append( variablePortion );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ChargeImpl
