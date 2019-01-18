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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulationKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AggregateKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Channel;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CommodityKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConsumptionTariffInterval;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Currency;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FlowDirectionKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IntervalBlock;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MacroPeriodKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeasurementKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeasuringPeriodKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MetrologyRequirement;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseCode;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RationalNumber;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reading;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingInterharmonic;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingType;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitMultiplier;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitSymbol;

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
 * An implementation of the model object '<em><b>Reading Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingTypeImpl#getAccumulation <em>Accumulation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingTypeImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingTypeImpl#getCommodity <em>Commodity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingTypeImpl#getConsumptionTier <em>Consumption Tier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingTypeImpl#getCpp <em>Cpp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingTypeImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingTypeImpl#getFlowDirection <em>Flow Direction</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingTypeImpl#getMacroPeriod <em>Macro Period</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingTypeImpl#getMeasurementKind <em>Measurement Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingTypeImpl#getMeasuringPeriod <em>Measuring Period</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingTypeImpl#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingTypeImpl#getPhases <em>Phases</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingTypeImpl#getTou <em>Tou</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingTypeImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingTypeImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingTypeImpl#getInterharmonic <em>Interharmonic</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingTypeImpl#getIntervalBlocks <em>Interval Blocks</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingTypeImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingTypeImpl#getConsumptionTariffIntervals <em>Consumption Tariff Intervals</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingTypeImpl#getMetrologyRequirements <em>Metrology Requirements</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingTypeImpl#getPendingCalculation <em>Pending Calculation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingTypeImpl#getReadings <em>Readings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadingTypeImpl extends IdentifiedObjectImpl implements ReadingType {
    /**
     * The default value of the '{@link #getAccumulation() <em>Accumulation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccumulation()
     * @generated
     * @ordered
     */
    protected static final AccumulationKind ACCUMULATION_EDEFAULT = AccumulationKind.NONE;

    /**
     * The cached value of the '{@link #getAccumulation() <em>Accumulation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccumulation()
     * @generated
     * @ordered
     */
    protected AccumulationKind accumulation = ACCUMULATION_EDEFAULT;

    /**
     * This is true if the Accumulation attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean accumulationESet;

    /**
     * The default value of the '{@link #getAggregate() <em>Aggregate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAggregate()
     * @generated
     * @ordered
     */
    protected static final AggregateKind AGGREGATE_EDEFAULT = AggregateKind.NONE;

    /**
     * The cached value of the '{@link #getAggregate() <em>Aggregate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAggregate()
     * @generated
     * @ordered
     */
    protected AggregateKind aggregate = AGGREGATE_EDEFAULT;

    /**
     * This is true if the Aggregate attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean aggregateESet;

    /**
     * The default value of the '{@link #getCommodity() <em>Commodity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCommodity()
     * @generated
     * @ordered
     */
    protected static final CommodityKind COMMODITY_EDEFAULT = CommodityKind.NONE;

    /**
     * The cached value of the '{@link #getCommodity() <em>Commodity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCommodity()
     * @generated
     * @ordered
     */
    protected CommodityKind commodity = COMMODITY_EDEFAULT;

    /**
     * This is true if the Commodity attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean commodityESet;

    /**
     * The default value of the '{@link #getConsumptionTier() <em>Consumption Tier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsumptionTier()
     * @generated
     * @ordered
     */
    protected static final Integer CONSUMPTION_TIER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConsumptionTier() <em>Consumption Tier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsumptionTier()
     * @generated
     * @ordered
     */
    protected Integer consumptionTier = CONSUMPTION_TIER_EDEFAULT;

    /**
     * This is true if the Consumption Tier attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean consumptionTierESet;

    /**
     * The default value of the '{@link #getCpp() <em>Cpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCpp()
     * @generated
     * @ordered
     */
    protected static final Integer CPP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCpp() <em>Cpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCpp()
     * @generated
     * @ordered
     */
    protected Integer cpp = CPP_EDEFAULT;

    /**
     * This is true if the Cpp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cppESet;

    /**
     * The default value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrency()
     * @generated
     * @ordered
     */
    protected static final Currency CURRENCY_EDEFAULT = Currency.AED;

    /**
     * The cached value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrency()
     * @generated
     * @ordered
     */
    protected Currency currency = CURRENCY_EDEFAULT;

    /**
     * This is true if the Currency attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean currencyESet;

    /**
     * The default value of the '{@link #getFlowDirection() <em>Flow Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlowDirection()
     * @generated
     * @ordered
     */
    protected static final FlowDirectionKind FLOW_DIRECTION_EDEFAULT = FlowDirectionKind.NONE;

    /**
     * The cached value of the '{@link #getFlowDirection() <em>Flow Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlowDirection()
     * @generated
     * @ordered
     */
    protected FlowDirectionKind flowDirection = FLOW_DIRECTION_EDEFAULT;

    /**
     * This is true if the Flow Direction attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean flowDirectionESet;

    /**
     * The default value of the '{@link #getMacroPeriod() <em>Macro Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMacroPeriod()
     * @generated
     * @ordered
     */
    protected static final MacroPeriodKind MACRO_PERIOD_EDEFAULT = MacroPeriodKind.NONE;

    /**
     * The cached value of the '{@link #getMacroPeriod() <em>Macro Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMacroPeriod()
     * @generated
     * @ordered
     */
    protected MacroPeriodKind macroPeriod = MACRO_PERIOD_EDEFAULT;

    /**
     * This is true if the Macro Period attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean macroPeriodESet;

    /**
     * The default value of the '{@link #getMeasurementKind() <em>Measurement Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurementKind()
     * @generated
     * @ordered
     */
    protected static final MeasurementKind MEASUREMENT_KIND_EDEFAULT = MeasurementKind.NONE;

    /**
     * The cached value of the '{@link #getMeasurementKind() <em>Measurement Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurementKind()
     * @generated
     * @ordered
     */
    protected MeasurementKind measurementKind = MEASUREMENT_KIND_EDEFAULT;

    /**
     * This is true if the Measurement Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean measurementKindESet;

    /**
     * The default value of the '{@link #getMeasuringPeriod() <em>Measuring Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasuringPeriod()
     * @generated
     * @ordered
     */
    protected static final MeasuringPeriodKind MEASURING_PERIOD_EDEFAULT = MeasuringPeriodKind.NONE;

    /**
     * The cached value of the '{@link #getMeasuringPeriod() <em>Measuring Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasuringPeriod()
     * @generated
     * @ordered
     */
    protected MeasuringPeriodKind measuringPeriod = MEASURING_PERIOD_EDEFAULT;

    /**
     * This is true if the Measuring Period attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean measuringPeriodESet;

    /**
     * The default value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMultiplier()
     * @generated
     * @ordered
     */
    protected static final UnitMultiplier MULTIPLIER_EDEFAULT = UnitMultiplier.YOCTO;

    /**
     * The cached value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMultiplier()
     * @generated
     * @ordered
     */
    protected UnitMultiplier multiplier = MULTIPLIER_EDEFAULT;

    /**
     * This is true if the Multiplier attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean multiplierESet;

    /**
     * The default value of the '{@link #getPhases() <em>Phases</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhases()
     * @generated
     * @ordered
     */
    protected static final PhaseCode PHASES_EDEFAULT = PhaseCode.ABCN;

    /**
     * The cached value of the '{@link #getPhases() <em>Phases</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhases()
     * @generated
     * @ordered
     */
    protected PhaseCode phases = PHASES_EDEFAULT;

    /**
     * This is true if the Phases attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phasesESet;

    /**
     * The default value of the '{@link #getTou() <em>Tou</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTou()
     * @generated
     * @ordered
     */
    protected static final Integer TOU_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTou() <em>Tou</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTou()
     * @generated
     * @ordered
     */
    protected Integer tou = TOU_EDEFAULT;

    /**
     * This is true if the Tou attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean touESet;

    /**
     * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnit()
     * @generated
     * @ordered
     */
    protected static final UnitSymbol UNIT_EDEFAULT = UnitSymbol.NONE;

    /**
     * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnit()
     * @generated
     * @ordered
     */
    protected UnitSymbol unit = UNIT_EDEFAULT;

    /**
     * This is true if the Unit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean unitESet;

    /**
     * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArgument()
     * @generated
     * @ordered
     */
    protected RationalNumber argument;

    /**
     * This is true if the Argument containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean argumentESet;

    /**
     * The cached value of the '{@link #getInterharmonic() <em>Interharmonic</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterharmonic()
     * @generated
     * @ordered
     */
    protected ReadingInterharmonic interharmonic;

    /**
     * This is true if the Interharmonic containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean interharmonicESet;

    /**
     * The cached value of the '{@link #getIntervalBlocks() <em>Interval Blocks</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntervalBlocks()
     * @generated
     * @ordered
     */
    protected EList< IntervalBlock > intervalBlocks;

    /**
     * The cached value of the '{@link #getChannel() <em>Channel</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChannel()
     * @generated
     * @ordered
     */
    protected Channel channel;

    /**
     * This is true if the Channel reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean channelESet;

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
     * The cached value of the '{@link #getMetrologyRequirements() <em>Metrology Requirements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMetrologyRequirements()
     * @generated
     * @ordered
     */
    protected EList< MetrologyRequirement > metrologyRequirements;

    /**
     * The cached value of the '{@link #getPendingCalculation() <em>Pending Calculation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPendingCalculation()
     * @generated
     * @ordered
     */
    protected PendingCalculation pendingCalculation;

    /**
     * This is true if the Pending Calculation reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pendingCalculationESet;

    /**
     * The cached value of the '{@link #getReadings() <em>Readings</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadings()
     * @generated
     * @ordered
     */
    protected EList< Reading > readings;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReadingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getReadingType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccumulationKind getAccumulation() {
        return accumulation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAccumulation( AccumulationKind newAccumulation ) {
        AccumulationKind oldAccumulation = accumulation;
        accumulation = newAccumulation == null ? ACCUMULATION_EDEFAULT : newAccumulation;
        boolean oldAccumulationESet = accumulationESet;
        accumulationESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.READING_TYPE__ACCUMULATION, oldAccumulation, accumulation, !oldAccumulationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAccumulation() {
        AccumulationKind oldAccumulation = accumulation;
        boolean oldAccumulationESet = accumulationESet;
        accumulation = ACCUMULATION_EDEFAULT;
        accumulationESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.READING_TYPE__ACCUMULATION, oldAccumulation, ACCUMULATION_EDEFAULT, oldAccumulationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAccumulation() {
        return accumulationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AggregateKind getAggregate() {
        return aggregate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAggregate( AggregateKind newAggregate ) {
        AggregateKind oldAggregate = aggregate;
        aggregate = newAggregate == null ? AGGREGATE_EDEFAULT : newAggregate;
        boolean oldAggregateESet = aggregateESet;
        aggregateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.READING_TYPE__AGGREGATE, oldAggregate, aggregate, !oldAggregateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAggregate() {
        AggregateKind oldAggregate = aggregate;
        boolean oldAggregateESet = aggregateESet;
        aggregate = AGGREGATE_EDEFAULT;
        aggregateESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.READING_TYPE__AGGREGATE, oldAggregate, AGGREGATE_EDEFAULT, oldAggregateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAggregate() {
        return aggregateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CommodityKind getCommodity() {
        return commodity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCommodity( CommodityKind newCommodity ) {
        CommodityKind oldCommodity = commodity;
        commodity = newCommodity == null ? COMMODITY_EDEFAULT : newCommodity;
        boolean oldCommodityESet = commodityESet;
        commodityESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.READING_TYPE__COMMODITY, oldCommodity, commodity, !oldCommodityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCommodity() {
        CommodityKind oldCommodity = commodity;
        boolean oldCommodityESet = commodityESet;
        commodity = COMMODITY_EDEFAULT;
        commodityESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.READING_TYPE__COMMODITY, oldCommodity, COMMODITY_EDEFAULT, oldCommodityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCommodity() {
        return commodityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getConsumptionTier() {
        return consumptionTier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConsumptionTier( Integer newConsumptionTier ) {
        Integer oldConsumptionTier = consumptionTier;
        consumptionTier = newConsumptionTier;
        boolean oldConsumptionTierESet = consumptionTierESet;
        consumptionTierESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.READING_TYPE__CONSUMPTION_TIER,
                    oldConsumptionTier, consumptionTier, !oldConsumptionTierESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConsumptionTier() {
        Integer oldConsumptionTier = consumptionTier;
        boolean oldConsumptionTierESet = consumptionTierESet;
        consumptionTier = CONSUMPTION_TIER_EDEFAULT;
        consumptionTierESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.READING_TYPE__CONSUMPTION_TIER,
                    oldConsumptionTier, CONSUMPTION_TIER_EDEFAULT, oldConsumptionTierESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConsumptionTier() {
        return consumptionTierESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getCpp() {
        return cpp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCpp( Integer newCpp ) {
        Integer oldCpp = cpp;
        cpp = newCpp;
        boolean oldCppESet = cppESet;
        cppESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.READING_TYPE__CPP, oldCpp, cpp, !oldCppESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCpp() {
        Integer oldCpp = cpp;
        boolean oldCppESet = cppESet;
        cpp = CPP_EDEFAULT;
        cppESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.READING_TYPE__CPP, oldCpp, CPP_EDEFAULT, oldCppESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCpp() {
        return cppESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Currency getCurrency() {
        return currency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCurrency( Currency newCurrency ) {
        Currency oldCurrency = currency;
        currency = newCurrency == null ? CURRENCY_EDEFAULT : newCurrency;
        boolean oldCurrencyESet = currencyESet;
        currencyESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.READING_TYPE__CURRENCY, oldCurrency, currency, !oldCurrencyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCurrency() {
        Currency oldCurrency = currency;
        boolean oldCurrencyESet = currencyESet;
        currency = CURRENCY_EDEFAULT;
        currencyESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.READING_TYPE__CURRENCY, oldCurrency, CURRENCY_EDEFAULT, oldCurrencyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCurrency() {
        return currencyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FlowDirectionKind getFlowDirection() {
        return flowDirection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFlowDirection( FlowDirectionKind newFlowDirection ) {
        FlowDirectionKind oldFlowDirection = flowDirection;
        flowDirection = newFlowDirection == null ? FLOW_DIRECTION_EDEFAULT : newFlowDirection;
        boolean oldFlowDirectionESet = flowDirectionESet;
        flowDirectionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.READING_TYPE__FLOW_DIRECTION, oldFlowDirection, flowDirection, !oldFlowDirectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFlowDirection() {
        FlowDirectionKind oldFlowDirection = flowDirection;
        boolean oldFlowDirectionESet = flowDirectionESet;
        flowDirection = FLOW_DIRECTION_EDEFAULT;
        flowDirectionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.READING_TYPE__FLOW_DIRECTION,
                    oldFlowDirection, FLOW_DIRECTION_EDEFAULT, oldFlowDirectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFlowDirection() {
        return flowDirectionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MacroPeriodKind getMacroPeriod() {
        return macroPeriod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMacroPeriod( MacroPeriodKind newMacroPeriod ) {
        MacroPeriodKind oldMacroPeriod = macroPeriod;
        macroPeriod = newMacroPeriod == null ? MACRO_PERIOD_EDEFAULT : newMacroPeriod;
        boolean oldMacroPeriodESet = macroPeriodESet;
        macroPeriodESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.READING_TYPE__MACRO_PERIOD, oldMacroPeriod, macroPeriod, !oldMacroPeriodESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMacroPeriod() {
        MacroPeriodKind oldMacroPeriod = macroPeriod;
        boolean oldMacroPeriodESet = macroPeriodESet;
        macroPeriod = MACRO_PERIOD_EDEFAULT;
        macroPeriodESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.READING_TYPE__MACRO_PERIOD, oldMacroPeriod, MACRO_PERIOD_EDEFAULT, oldMacroPeriodESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMacroPeriod() {
        return macroPeriodESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MeasurementKind getMeasurementKind() {
        return measurementKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMeasurementKind( MeasurementKind newMeasurementKind ) {
        MeasurementKind oldMeasurementKind = measurementKind;
        measurementKind = newMeasurementKind == null ? MEASUREMENT_KIND_EDEFAULT : newMeasurementKind;
        boolean oldMeasurementKindESet = measurementKindESet;
        measurementKindESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.READING_TYPE__MEASUREMENT_KIND,
                    oldMeasurementKind, measurementKind, !oldMeasurementKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMeasurementKind() {
        MeasurementKind oldMeasurementKind = measurementKind;
        boolean oldMeasurementKindESet = measurementKindESet;
        measurementKind = MEASUREMENT_KIND_EDEFAULT;
        measurementKindESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.READING_TYPE__MEASUREMENT_KIND,
                    oldMeasurementKind, MEASUREMENT_KIND_EDEFAULT, oldMeasurementKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeasurementKind() {
        return measurementKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MeasuringPeriodKind getMeasuringPeriod() {
        return measuringPeriod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMeasuringPeriod( MeasuringPeriodKind newMeasuringPeriod ) {
        MeasuringPeriodKind oldMeasuringPeriod = measuringPeriod;
        measuringPeriod = newMeasuringPeriod == null ? MEASURING_PERIOD_EDEFAULT : newMeasuringPeriod;
        boolean oldMeasuringPeriodESet = measuringPeriodESet;
        measuringPeriodESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.READING_TYPE__MEASURING_PERIOD,
                    oldMeasuringPeriod, measuringPeriod, !oldMeasuringPeriodESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMeasuringPeriod() {
        MeasuringPeriodKind oldMeasuringPeriod = measuringPeriod;
        boolean oldMeasuringPeriodESet = measuringPeriodESet;
        measuringPeriod = MEASURING_PERIOD_EDEFAULT;
        measuringPeriodESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.READING_TYPE__MEASURING_PERIOD,
                    oldMeasuringPeriod, MEASURING_PERIOD_EDEFAULT, oldMeasuringPeriodESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeasuringPeriod() {
        return measuringPeriodESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnitMultiplier getMultiplier() {
        return multiplier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMultiplier( UnitMultiplier newMultiplier ) {
        UnitMultiplier oldMultiplier = multiplier;
        multiplier = newMultiplier == null ? MULTIPLIER_EDEFAULT : newMultiplier;
        boolean oldMultiplierESet = multiplierESet;
        multiplierESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.READING_TYPE__MULTIPLIER, oldMultiplier, multiplier, !oldMultiplierESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMultiplier() {
        UnitMultiplier oldMultiplier = multiplier;
        boolean oldMultiplierESet = multiplierESet;
        multiplier = MULTIPLIER_EDEFAULT;
        multiplierESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.READING_TYPE__MULTIPLIER, oldMultiplier, MULTIPLIER_EDEFAULT, oldMultiplierESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMultiplier() {
        return multiplierESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseCode getPhases() {
        return phases;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPhases( PhaseCode newPhases ) {
        PhaseCode oldPhases = phases;
        phases = newPhases == null ? PHASES_EDEFAULT : newPhases;
        boolean oldPhasesESet = phasesESet;
        phasesESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.READING_TYPE__PHASES, oldPhases, phases, !oldPhasesESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhases() {
        PhaseCode oldPhases = phases;
        boolean oldPhasesESet = phasesESet;
        phases = PHASES_EDEFAULT;
        phasesESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.READING_TYPE__PHASES, oldPhases, PHASES_EDEFAULT, oldPhasesESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhases() {
        return phasesESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getTou() {
        return tou;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTou( Integer newTou ) {
        Integer oldTou = tou;
        tou = newTou;
        boolean oldTouESet = touESet;
        touESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.READING_TYPE__TOU, oldTou, tou, !oldTouESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTou() {
        Integer oldTou = tou;
        boolean oldTouESet = touESet;
        tou = TOU_EDEFAULT;
        touESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.READING_TYPE__TOU, oldTou, TOU_EDEFAULT, oldTouESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTou() {
        return touESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnitSymbol getUnit() {
        return unit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUnit( UnitSymbol newUnit ) {
        UnitSymbol oldUnit = unit;
        unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
        boolean oldUnitESet = unitESet;
        unitESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.READING_TYPE__UNIT, oldUnit, unit, !oldUnitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUnit() {
        UnitSymbol oldUnit = unit;
        boolean oldUnitESet = unitESet;
        unit = UNIT_EDEFAULT;
        unitESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.READING_TYPE__UNIT, oldUnit, UNIT_EDEFAULT, oldUnitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUnit() {
        return unitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RationalNumber getArgument() {
        return argument;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetArgument( RationalNumber newArgument, NotificationChain msgs ) {
        RationalNumber oldArgument = argument;
        argument = newArgument;
        boolean oldArgumentESet = argumentESet;
        argumentESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.READING_TYPE__ARGUMENT, oldArgument, newArgument, !oldArgumentESet );
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
    public void setArgument( RationalNumber newArgument ) {
        if( newArgument != argument ) {
            NotificationChain msgs = null;
            if( argument != null ) msgs = ( ( InternalEObject ) argument ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.READING_TYPE__ARGUMENT, null, msgs );
            if( newArgument != null ) msgs = ( ( InternalEObject ) newArgument ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.READING_TYPE__ARGUMENT, null, msgs );
            msgs = basicSetArgument( newArgument, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldArgumentESet = argumentESet;
            argumentESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.READING_TYPE__ARGUMENT, newArgument, newArgument, !oldArgumentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetArgument( NotificationChain msgs ) {
        RationalNumber oldArgument = argument;
        argument = null;
        boolean oldArgumentESet = argumentESet;
        argumentESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.READING_TYPE__ARGUMENT, oldArgument, null, oldArgumentESet );
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
    public void unsetArgument() {
        if( argument != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) argument ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.READING_TYPE__ARGUMENT, null, msgs );
            msgs = basicUnsetArgument( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldArgumentESet = argumentESet;
            argumentESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.READING_TYPE__ARGUMENT, null, null, oldArgumentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetArgument() {
        return argumentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReadingInterharmonic getInterharmonic() {
        return interharmonic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInterharmonic( ReadingInterharmonic newInterharmonic, NotificationChain msgs ) {
        ReadingInterharmonic oldInterharmonic = interharmonic;
        interharmonic = newInterharmonic;
        boolean oldInterharmonicESet = interharmonicESet;
        interharmonicESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.READING_TYPE__INTERHARMONIC, oldInterharmonic, newInterharmonic, !oldInterharmonicESet );
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
    public void setInterharmonic( ReadingInterharmonic newInterharmonic ) {
        if( newInterharmonic != interharmonic ) {
            NotificationChain msgs = null;
            if( interharmonic != null ) msgs = ( ( InternalEObject ) interharmonic ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.READING_TYPE__INTERHARMONIC, null, msgs );
            if( newInterharmonic != null ) msgs = ( ( InternalEObject ) newInterharmonic ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.READING_TYPE__INTERHARMONIC, null, msgs );
            msgs = basicSetInterharmonic( newInterharmonic, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldInterharmonicESet = interharmonicESet;
            interharmonicESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.READING_TYPE__INTERHARMONIC,
                        newInterharmonic, newInterharmonic, !oldInterharmonicESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetInterharmonic( NotificationChain msgs ) {
        ReadingInterharmonic oldInterharmonic = interharmonic;
        interharmonic = null;
        boolean oldInterharmonicESet = interharmonicESet;
        interharmonicESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.READING_TYPE__INTERHARMONIC, oldInterharmonic, null, oldInterharmonicESet );
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
    public void unsetInterharmonic() {
        if( interharmonic != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) interharmonic ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.READING_TYPE__INTERHARMONIC, null, msgs );
            msgs = basicUnsetInterharmonic( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldInterharmonicESet = interharmonicESet;
            interharmonicESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.READING_TYPE__INTERHARMONIC, null, null, oldInterharmonicESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInterharmonic() {
        return interharmonicESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< IntervalBlock > getIntervalBlocks() {
        if( intervalBlocks == null ) {
            intervalBlocks = new EObjectWithInverseResolvingEList.Unsettable< IntervalBlock >( IntervalBlock.class,
                    this, CimPackage.READING_TYPE__INTERVAL_BLOCKS, CimPackage.INTERVAL_BLOCK__READING_TYPE );
        }
        return intervalBlocks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIntervalBlocks() {
        if( intervalBlocks != null ) ( ( InternalEList.Unsettable< ? > ) intervalBlocks ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIntervalBlocks() {
        return intervalBlocks != null && ( ( InternalEList.Unsettable< ? > ) intervalBlocks ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Channel getChannel() {
        return channel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChannel( Channel newChannel, NotificationChain msgs ) {
        Channel oldChannel = channel;
        channel = newChannel;
        boolean oldChannelESet = channelESet;
        channelESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.READING_TYPE__CHANNEL, oldChannel, newChannel, !oldChannelESet );
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
    public void setChannel( Channel newChannel ) {
        if( newChannel != channel ) {
            NotificationChain msgs = null;
            if( channel != null ) msgs = ( ( InternalEObject ) channel ).eInverseRemove( this,
                    CimPackage.CHANNEL__READING_TYPE, Channel.class, msgs );
            if( newChannel != null ) msgs = ( ( InternalEObject ) newChannel ).eInverseAdd( this,
                    CimPackage.CHANNEL__READING_TYPE, Channel.class, msgs );
            msgs = basicSetChannel( newChannel, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldChannelESet = channelESet;
            channelESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.READING_TYPE__CHANNEL, newChannel, newChannel, !oldChannelESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetChannel( NotificationChain msgs ) {
        Channel oldChannel = channel;
        channel = null;
        boolean oldChannelESet = channelESet;
        channelESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.READING_TYPE__CHANNEL, oldChannel, null, oldChannelESet );
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
    public void unsetChannel() {
        if( channel != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) channel ).eInverseRemove( this, CimPackage.CHANNEL__READING_TYPE,
                    Channel.class, msgs );
            msgs = basicUnsetChannel( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldChannelESet = channelESet;
            channelESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.READING_TYPE__CHANNEL, null, null, oldChannelESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetChannel() {
        return channelESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ConsumptionTariffInterval > getConsumptionTariffIntervals() {
        if( consumptionTariffIntervals == null ) {
            consumptionTariffIntervals = new EObjectWithInverseResolvingEList.Unsettable< ConsumptionTariffInterval >(
                    ConsumptionTariffInterval.class, this, CimPackage.READING_TYPE__CONSUMPTION_TARIFF_INTERVALS,
                    CimPackage.CONSUMPTION_TARIFF_INTERVAL__READING_TYPE );
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
    @Override
    public EList< MetrologyRequirement > getMetrologyRequirements() {
        if( metrologyRequirements == null ) {
            metrologyRequirements = new EObjectWithInverseEList.Unsettable.ManyInverse< MetrologyRequirement >(
                    MetrologyRequirement.class, this, CimPackage.READING_TYPE__METROLOGY_REQUIREMENTS,
                    CimPackage.METROLOGY_REQUIREMENT__READING_TYPES );
        }
        return metrologyRequirements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMetrologyRequirements() {
        if( metrologyRequirements != null ) ( ( InternalEList.Unsettable< ? > ) metrologyRequirements ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMetrologyRequirements() {
        return metrologyRequirements != null && ( ( InternalEList.Unsettable< ? > ) metrologyRequirements ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PendingCalculation getPendingCalculation() {
        return pendingCalculation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPendingCalculation( PendingCalculation newPendingCalculation,
            NotificationChain msgs ) {
        PendingCalculation oldPendingCalculation = pendingCalculation;
        pendingCalculation = newPendingCalculation;
        boolean oldPendingCalculationESet = pendingCalculationESet;
        pendingCalculationESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.READING_TYPE__PENDING_CALCULATION, oldPendingCalculation, newPendingCalculation,
                    !oldPendingCalculationESet );
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
    public void setPendingCalculation( PendingCalculation newPendingCalculation ) {
        if( newPendingCalculation != pendingCalculation ) {
            NotificationChain msgs = null;
            if( pendingCalculation != null ) msgs = ( ( InternalEObject ) pendingCalculation ).eInverseRemove( this,
                    CimPackage.PENDING_CALCULATION__READING_TYPE, PendingCalculation.class, msgs );
            if( newPendingCalculation != null ) msgs = ( ( InternalEObject ) newPendingCalculation ).eInverseAdd( this,
                    CimPackage.PENDING_CALCULATION__READING_TYPE, PendingCalculation.class, msgs );
            msgs = basicSetPendingCalculation( newPendingCalculation, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPendingCalculationESet = pendingCalculationESet;
            pendingCalculationESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.READING_TYPE__PENDING_CALCULATION,
                        newPendingCalculation, newPendingCalculation, !oldPendingCalculationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPendingCalculation( NotificationChain msgs ) {
        PendingCalculation oldPendingCalculation = pendingCalculation;
        pendingCalculation = null;
        boolean oldPendingCalculationESet = pendingCalculationESet;
        pendingCalculationESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.READING_TYPE__PENDING_CALCULATION, oldPendingCalculation, null,
                    oldPendingCalculationESet );
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
    public void unsetPendingCalculation() {
        if( pendingCalculation != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) pendingCalculation ).eInverseRemove( this,
                    CimPackage.PENDING_CALCULATION__READING_TYPE, PendingCalculation.class, msgs );
            msgs = basicUnsetPendingCalculation( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPendingCalculationESet = pendingCalculationESet;
            pendingCalculationESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.READING_TYPE__PENDING_CALCULATION, null, null, oldPendingCalculationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPendingCalculation() {
        return pendingCalculationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Reading > getReadings() {
        if( readings == null ) {
            readings = new EObjectWithInverseResolvingEList.Unsettable< Reading >( Reading.class, this,
                    CimPackage.READING_TYPE__READINGS, CimPackage.READING__READING_TYPE );
        }
        return readings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReadings() {
        if( readings != null ) ( ( InternalEList.Unsettable< ? > ) readings ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReadings() {
        return readings != null && ( ( InternalEList.Unsettable< ? > ) readings ).isSet();
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
        case CimPackage.READING_TYPE__INTERVAL_BLOCKS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getIntervalBlocks() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.READING_TYPE__CHANNEL:
            if( channel != null ) msgs = ( ( InternalEObject ) channel ).eInverseRemove( this,
                    CimPackage.CHANNEL__READING_TYPE, Channel.class, msgs );
            return basicSetChannel( ( Channel ) otherEnd, msgs );
        case CimPackage.READING_TYPE__CONSUMPTION_TARIFF_INTERVALS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getConsumptionTariffIntervals() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.READING_TYPE__METROLOGY_REQUIREMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getMetrologyRequirements() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.READING_TYPE__PENDING_CALCULATION:
            if( pendingCalculation != null ) msgs = ( ( InternalEObject ) pendingCalculation ).eInverseRemove( this,
                    CimPackage.PENDING_CALCULATION__READING_TYPE, PendingCalculation.class, msgs );
            return basicSetPendingCalculation( ( PendingCalculation ) otherEnd, msgs );
        case CimPackage.READING_TYPE__READINGS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReadings() ).basicAdd( otherEnd,
                    msgs );
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
        case CimPackage.READING_TYPE__ARGUMENT:
            return basicUnsetArgument( msgs );
        case CimPackage.READING_TYPE__INTERHARMONIC:
            return basicUnsetInterharmonic( msgs );
        case CimPackage.READING_TYPE__INTERVAL_BLOCKS:
            return ( ( InternalEList< ? > ) getIntervalBlocks() ).basicRemove( otherEnd, msgs );
        case CimPackage.READING_TYPE__CHANNEL:
            return basicUnsetChannel( msgs );
        case CimPackage.READING_TYPE__CONSUMPTION_TARIFF_INTERVALS:
            return ( ( InternalEList< ? > ) getConsumptionTariffIntervals() ).basicRemove( otherEnd, msgs );
        case CimPackage.READING_TYPE__METROLOGY_REQUIREMENTS:
            return ( ( InternalEList< ? > ) getMetrologyRequirements() ).basicRemove( otherEnd, msgs );
        case CimPackage.READING_TYPE__PENDING_CALCULATION:
            return basicUnsetPendingCalculation( msgs );
        case CimPackage.READING_TYPE__READINGS:
            return ( ( InternalEList< ? > ) getReadings() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.READING_TYPE__ACCUMULATION:
            return getAccumulation();
        case CimPackage.READING_TYPE__AGGREGATE:
            return getAggregate();
        case CimPackage.READING_TYPE__COMMODITY:
            return getCommodity();
        case CimPackage.READING_TYPE__CONSUMPTION_TIER:
            return getConsumptionTier();
        case CimPackage.READING_TYPE__CPP:
            return getCpp();
        case CimPackage.READING_TYPE__CURRENCY:
            return getCurrency();
        case CimPackage.READING_TYPE__FLOW_DIRECTION:
            return getFlowDirection();
        case CimPackage.READING_TYPE__MACRO_PERIOD:
            return getMacroPeriod();
        case CimPackage.READING_TYPE__MEASUREMENT_KIND:
            return getMeasurementKind();
        case CimPackage.READING_TYPE__MEASURING_PERIOD:
            return getMeasuringPeriod();
        case CimPackage.READING_TYPE__MULTIPLIER:
            return getMultiplier();
        case CimPackage.READING_TYPE__PHASES:
            return getPhases();
        case CimPackage.READING_TYPE__TOU:
            return getTou();
        case CimPackage.READING_TYPE__UNIT:
            return getUnit();
        case CimPackage.READING_TYPE__ARGUMENT:
            return getArgument();
        case CimPackage.READING_TYPE__INTERHARMONIC:
            return getInterharmonic();
        case CimPackage.READING_TYPE__INTERVAL_BLOCKS:
            return getIntervalBlocks();
        case CimPackage.READING_TYPE__CHANNEL:
            return getChannel();
        case CimPackage.READING_TYPE__CONSUMPTION_TARIFF_INTERVALS:
            return getConsumptionTariffIntervals();
        case CimPackage.READING_TYPE__METROLOGY_REQUIREMENTS:
            return getMetrologyRequirements();
        case CimPackage.READING_TYPE__PENDING_CALCULATION:
            return getPendingCalculation();
        case CimPackage.READING_TYPE__READINGS:
            return getReadings();
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
        case CimPackage.READING_TYPE__ACCUMULATION:
            setAccumulation( ( AccumulationKind ) newValue );
            return;
        case CimPackage.READING_TYPE__AGGREGATE:
            setAggregate( ( AggregateKind ) newValue );
            return;
        case CimPackage.READING_TYPE__COMMODITY:
            setCommodity( ( CommodityKind ) newValue );
            return;
        case CimPackage.READING_TYPE__CONSUMPTION_TIER:
            setConsumptionTier( ( Integer ) newValue );
            return;
        case CimPackage.READING_TYPE__CPP:
            setCpp( ( Integer ) newValue );
            return;
        case CimPackage.READING_TYPE__CURRENCY:
            setCurrency( ( Currency ) newValue );
            return;
        case CimPackage.READING_TYPE__FLOW_DIRECTION:
            setFlowDirection( ( FlowDirectionKind ) newValue );
            return;
        case CimPackage.READING_TYPE__MACRO_PERIOD:
            setMacroPeriod( ( MacroPeriodKind ) newValue );
            return;
        case CimPackage.READING_TYPE__MEASUREMENT_KIND:
            setMeasurementKind( ( MeasurementKind ) newValue );
            return;
        case CimPackage.READING_TYPE__MEASURING_PERIOD:
            setMeasuringPeriod( ( MeasuringPeriodKind ) newValue );
            return;
        case CimPackage.READING_TYPE__MULTIPLIER:
            setMultiplier( ( UnitMultiplier ) newValue );
            return;
        case CimPackage.READING_TYPE__PHASES:
            setPhases( ( PhaseCode ) newValue );
            return;
        case CimPackage.READING_TYPE__TOU:
            setTou( ( Integer ) newValue );
            return;
        case CimPackage.READING_TYPE__UNIT:
            setUnit( ( UnitSymbol ) newValue );
            return;
        case CimPackage.READING_TYPE__ARGUMENT:
            setArgument( ( RationalNumber ) newValue );
            return;
        case CimPackage.READING_TYPE__INTERHARMONIC:
            setInterharmonic( ( ReadingInterharmonic ) newValue );
            return;
        case CimPackage.READING_TYPE__INTERVAL_BLOCKS:
            getIntervalBlocks().clear();
            getIntervalBlocks().addAll( ( Collection< ? extends IntervalBlock > ) newValue );
            return;
        case CimPackage.READING_TYPE__CHANNEL:
            setChannel( ( Channel ) newValue );
            return;
        case CimPackage.READING_TYPE__CONSUMPTION_TARIFF_INTERVALS:
            getConsumptionTariffIntervals().clear();
            getConsumptionTariffIntervals().addAll( ( Collection< ? extends ConsumptionTariffInterval > ) newValue );
            return;
        case CimPackage.READING_TYPE__METROLOGY_REQUIREMENTS:
            getMetrologyRequirements().clear();
            getMetrologyRequirements().addAll( ( Collection< ? extends MetrologyRequirement > ) newValue );
            return;
        case CimPackage.READING_TYPE__PENDING_CALCULATION:
            setPendingCalculation( ( PendingCalculation ) newValue );
            return;
        case CimPackage.READING_TYPE__READINGS:
            getReadings().clear();
            getReadings().addAll( ( Collection< ? extends Reading > ) newValue );
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
        case CimPackage.READING_TYPE__ACCUMULATION:
            unsetAccumulation();
            return;
        case CimPackage.READING_TYPE__AGGREGATE:
            unsetAggregate();
            return;
        case CimPackage.READING_TYPE__COMMODITY:
            unsetCommodity();
            return;
        case CimPackage.READING_TYPE__CONSUMPTION_TIER:
            unsetConsumptionTier();
            return;
        case CimPackage.READING_TYPE__CPP:
            unsetCpp();
            return;
        case CimPackage.READING_TYPE__CURRENCY:
            unsetCurrency();
            return;
        case CimPackage.READING_TYPE__FLOW_DIRECTION:
            unsetFlowDirection();
            return;
        case CimPackage.READING_TYPE__MACRO_PERIOD:
            unsetMacroPeriod();
            return;
        case CimPackage.READING_TYPE__MEASUREMENT_KIND:
            unsetMeasurementKind();
            return;
        case CimPackage.READING_TYPE__MEASURING_PERIOD:
            unsetMeasuringPeriod();
            return;
        case CimPackage.READING_TYPE__MULTIPLIER:
            unsetMultiplier();
            return;
        case CimPackage.READING_TYPE__PHASES:
            unsetPhases();
            return;
        case CimPackage.READING_TYPE__TOU:
            unsetTou();
            return;
        case CimPackage.READING_TYPE__UNIT:
            unsetUnit();
            return;
        case CimPackage.READING_TYPE__ARGUMENT:
            unsetArgument();
            return;
        case CimPackage.READING_TYPE__INTERHARMONIC:
            unsetInterharmonic();
            return;
        case CimPackage.READING_TYPE__INTERVAL_BLOCKS:
            unsetIntervalBlocks();
            return;
        case CimPackage.READING_TYPE__CHANNEL:
            unsetChannel();
            return;
        case CimPackage.READING_TYPE__CONSUMPTION_TARIFF_INTERVALS:
            unsetConsumptionTariffIntervals();
            return;
        case CimPackage.READING_TYPE__METROLOGY_REQUIREMENTS:
            unsetMetrologyRequirements();
            return;
        case CimPackage.READING_TYPE__PENDING_CALCULATION:
            unsetPendingCalculation();
            return;
        case CimPackage.READING_TYPE__READINGS:
            unsetReadings();
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
        case CimPackage.READING_TYPE__ACCUMULATION:
            return isSetAccumulation();
        case CimPackage.READING_TYPE__AGGREGATE:
            return isSetAggregate();
        case CimPackage.READING_TYPE__COMMODITY:
            return isSetCommodity();
        case CimPackage.READING_TYPE__CONSUMPTION_TIER:
            return isSetConsumptionTier();
        case CimPackage.READING_TYPE__CPP:
            return isSetCpp();
        case CimPackage.READING_TYPE__CURRENCY:
            return isSetCurrency();
        case CimPackage.READING_TYPE__FLOW_DIRECTION:
            return isSetFlowDirection();
        case CimPackage.READING_TYPE__MACRO_PERIOD:
            return isSetMacroPeriod();
        case CimPackage.READING_TYPE__MEASUREMENT_KIND:
            return isSetMeasurementKind();
        case CimPackage.READING_TYPE__MEASURING_PERIOD:
            return isSetMeasuringPeriod();
        case CimPackage.READING_TYPE__MULTIPLIER:
            return isSetMultiplier();
        case CimPackage.READING_TYPE__PHASES:
            return isSetPhases();
        case CimPackage.READING_TYPE__TOU:
            return isSetTou();
        case CimPackage.READING_TYPE__UNIT:
            return isSetUnit();
        case CimPackage.READING_TYPE__ARGUMENT:
            return isSetArgument();
        case CimPackage.READING_TYPE__INTERHARMONIC:
            return isSetInterharmonic();
        case CimPackage.READING_TYPE__INTERVAL_BLOCKS:
            return isSetIntervalBlocks();
        case CimPackage.READING_TYPE__CHANNEL:
            return isSetChannel();
        case CimPackage.READING_TYPE__CONSUMPTION_TARIFF_INTERVALS:
            return isSetConsumptionTariffIntervals();
        case CimPackage.READING_TYPE__METROLOGY_REQUIREMENTS:
            return isSetMetrologyRequirements();
        case CimPackage.READING_TYPE__PENDING_CALCULATION:
            return isSetPendingCalculation();
        case CimPackage.READING_TYPE__READINGS:
            return isSetReadings();
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
        result.append( " (accumulation: " );
        if( accumulationESet )
            result.append( accumulation );
        else
            result.append( "<unset>" );
        result.append( ", aggregate: " );
        if( aggregateESet )
            result.append( aggregate );
        else
            result.append( "<unset>" );
        result.append( ", commodity: " );
        if( commodityESet )
            result.append( commodity );
        else
            result.append( "<unset>" );
        result.append( ", consumptionTier: " );
        if( consumptionTierESet )
            result.append( consumptionTier );
        else
            result.append( "<unset>" );
        result.append( ", cpp: " );
        if( cppESet )
            result.append( cpp );
        else
            result.append( "<unset>" );
        result.append( ", currency: " );
        if( currencyESet )
            result.append( currency );
        else
            result.append( "<unset>" );
        result.append( ", flowDirection: " );
        if( flowDirectionESet )
            result.append( flowDirection );
        else
            result.append( "<unset>" );
        result.append( ", macroPeriod: " );
        if( macroPeriodESet )
            result.append( macroPeriod );
        else
            result.append( "<unset>" );
        result.append( ", measurementKind: " );
        if( measurementKindESet )
            result.append( measurementKind );
        else
            result.append( "<unset>" );
        result.append( ", measuringPeriod: " );
        if( measuringPeriodESet )
            result.append( measuringPeriod );
        else
            result.append( "<unset>" );
        result.append( ", multiplier: " );
        if( multiplierESet )
            result.append( multiplier );
        else
            result.append( "<unset>" );
        result.append( ", phases: " );
        if( phasesESet )
            result.append( phases );
        else
            result.append( "<unset>" );
        result.append( ", tou: " );
        if( touESet )
            result.append( tou );
        else
            result.append( "<unset>" );
        result.append( ", unit: " );
        if( unitESet )
            result.append( unit );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ReadingTypeImpl
