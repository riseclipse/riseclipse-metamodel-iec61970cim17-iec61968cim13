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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AcceptanceTest;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ActivityRecord;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Analytic;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetContainer;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetDeployment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetGroup;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetLifecycleStateKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetOrganisationRole;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ElectronicAddress;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InUseDate;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InUseStateKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LifecycleDate;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Location;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Measurement;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Medium;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalTag;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Ownership;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Procedure;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RetiredReasonKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEvent;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Status;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask;

import java.math.BigDecimal;

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
 * An implementation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getBaselineCondition <em>Baseline Condition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getBaselineLossOfLife <em>Baseline Loss Of Life</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getCritical <em>Critical</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getInUseState <em>In Use State</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getLifecycleState <em>Lifecycle State</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getPurchasePrice <em>Purchase Price</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getRetiredReason <em>Retired Reason</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getUtcNumber <em>Utc Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getAcceptanceTest <em>Acceptance Test</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getElectronicAddress <em>Electronic Address</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getInUseDate <em>In Use Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getLifecycleDate <em>Lifecycle Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getReplacementWorkTasks <em>Replacement Work Tasks</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getAnalytic <em>Analytic</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getProductAssetModel <em>Product Asset Model</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getProcedures <em>Procedures</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getScheduledEvents <em>Scheduled Events</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getOwnerships <em>Ownerships</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getConfigurationEvents <em>Configuration Events</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getWorkTasks <em>Work Tasks</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getOperationalTags <em>Operational Tags</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getBreakerOperation <em>Breaker Operation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getOrganisationRoles <em>Organisation Roles</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getActivityRecords <em>Activity Records</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getFinancialInfo <em>Financial Info</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getProcedureDataSet <em>Procedure Data Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getMedium <em>Medium</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getAssetContainer <em>Asset Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getAssetDeployment <em>Asset Deployment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getAnalyticScore <em>Analytic Score</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getPowerSystemResources <em>Power System Resources</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getAssetInfo <em>Asset Info</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetImpl#getAssetGroup <em>Asset Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetImpl extends IdentifiedObjectImpl implements Asset {
    /**
     * The default value of the '{@link #getBaselineCondition() <em>Baseline Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBaselineCondition()
     * @generated
     * @ordered
     */
    protected static final String BASELINE_CONDITION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBaselineCondition() <em>Baseline Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBaselineCondition()
     * @generated
     * @ordered
     */
    protected String baselineCondition = BASELINE_CONDITION_EDEFAULT;

    /**
     * This is true if the Baseline Condition attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean baselineConditionESet;

    /**
     * The default value of the '{@link #getBaselineLossOfLife() <em>Baseline Loss Of Life</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBaselineLossOfLife()
     * @generated
     * @ordered
     */
    protected static final Float BASELINE_LOSS_OF_LIFE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBaselineLossOfLife() <em>Baseline Loss Of Life</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBaselineLossOfLife()
     * @generated
     * @ordered
     */
    protected Float baselineLossOfLife = BASELINE_LOSS_OF_LIFE_EDEFAULT;

    /**
     * This is true if the Baseline Loss Of Life attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean baselineLossOfLifeESet;

    /**
     * The default value of the '{@link #getCritical() <em>Critical</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCritical()
     * @generated
     * @ordered
     */
    protected static final Boolean CRITICAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCritical() <em>Critical</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCritical()
     * @generated
     * @ordered
     */
    protected Boolean critical = CRITICAL_EDEFAULT;

    /**
     * This is true if the Critical attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean criticalESet;

    /**
     * The default value of the '{@link #getInUseState() <em>In Use State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInUseState()
     * @generated
     * @ordered
     */
    protected static final InUseStateKind IN_USE_STATE_EDEFAULT = InUseStateKind.IN_USE;

    /**
     * The cached value of the '{@link #getInUseState() <em>In Use State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInUseState()
     * @generated
     * @ordered
     */
    protected InUseStateKind inUseState = IN_USE_STATE_EDEFAULT;

    /**
     * This is true if the In Use State attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean inUseStateESet;

    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final AssetKind KIND_EDEFAULT = AssetKind.BREAKER_AIR_BLAST_BREAKER;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected AssetKind kind = KIND_EDEFAULT;

    /**
     * This is true if the Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kindESet;

    /**
     * The default value of the '{@link #getLifecycleState() <em>Lifecycle State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLifecycleState()
     * @generated
     * @ordered
     */
    protected static final AssetLifecycleStateKind LIFECYCLE_STATE_EDEFAULT = AssetLifecycleStateKind.MANUFACTURED;

    /**
     * The cached value of the '{@link #getLifecycleState() <em>Lifecycle State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLifecycleState()
     * @generated
     * @ordered
     */
    protected AssetLifecycleStateKind lifecycleState = LIFECYCLE_STATE_EDEFAULT;

    /**
     * This is true if the Lifecycle State attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lifecycleStateESet;

    /**
     * The default value of the '{@link #getLotNumber() <em>Lot Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLotNumber()
     * @generated
     * @ordered
     */
    protected static final String LOT_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLotNumber() <em>Lot Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLotNumber()
     * @generated
     * @ordered
     */
    protected String lotNumber = LOT_NUMBER_EDEFAULT;

    /**
     * This is true if the Lot Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lotNumberESet;

    /**
     * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPosition()
     * @generated
     * @ordered
     */
    protected static final String POSITION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPosition()
     * @generated
     * @ordered
     */
    protected String position = POSITION_EDEFAULT;

    /**
     * This is true if the Position attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean positionESet;

    /**
     * The default value of the '{@link #getPurchasePrice() <em>Purchase Price</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPurchasePrice()
     * @generated
     * @ordered
     */
    protected static final BigDecimal PURCHASE_PRICE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPurchasePrice() <em>Purchase Price</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPurchasePrice()
     * @generated
     * @ordered
     */
    protected BigDecimal purchasePrice = PURCHASE_PRICE_EDEFAULT;

    /**
     * This is true if the Purchase Price attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean purchasePriceESet;

    /**
     * The default value of the '{@link #getRetiredReason() <em>Retired Reason</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRetiredReason()
     * @generated
     * @ordered
     */
    protected static final RetiredReasonKind RETIRED_REASON_EDEFAULT = RetiredReasonKind.ENVIRONMENTAL;

    /**
     * The cached value of the '{@link #getRetiredReason() <em>Retired Reason</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRetiredReason()
     * @generated
     * @ordered
     */
    protected RetiredReasonKind retiredReason = RETIRED_REASON_EDEFAULT;

    /**
     * This is true if the Retired Reason attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean retiredReasonESet;

    /**
     * The default value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSerialNumber()
     * @generated
     * @ordered
     */
    protected static final String SERIAL_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSerialNumber()
     * @generated
     * @ordered
     */
    protected String serialNumber = SERIAL_NUMBER_EDEFAULT;

    /**
     * This is true if the Serial Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean serialNumberESet;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * The default value of the '{@link #getUtcNumber() <em>Utc Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUtcNumber()
     * @generated
     * @ordered
     */
    protected static final String UTC_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUtcNumber() <em>Utc Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUtcNumber()
     * @generated
     * @ordered
     */
    protected String utcNumber = UTC_NUMBER_EDEFAULT;

    /**
     * This is true if the Utc Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean utcNumberESet;

    /**
     * The cached value of the '{@link #getAcceptanceTest() <em>Acceptance Test</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAcceptanceTest()
     * @generated
     * @ordered
     */
    protected AcceptanceTest acceptanceTest;

    /**
     * This is true if the Acceptance Test containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean acceptanceTestESet;

    /**
     * The cached value of the '{@link #getElectronicAddress() <em>Electronic Address</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElectronicAddress()
     * @generated
     * @ordered
     */
    protected ElectronicAddress electronicAddress;

    /**
     * This is true if the Electronic Address containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean electronicAddressESet;

    /**
     * The cached value of the '{@link #getInUseDate() <em>In Use Date</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInUseDate()
     * @generated
     * @ordered
     */
    protected InUseDate inUseDate;

    /**
     * This is true if the In Use Date containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean inUseDateESet;

    /**
     * The cached value of the '{@link #getLifecycleDate() <em>Lifecycle Date</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLifecycleDate()
     * @generated
     * @ordered
     */
    protected LifecycleDate lifecycleDate;

    /**
     * This is true if the Lifecycle Date containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lifecycleDateESet;

    /**
     * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatus()
     * @generated
     * @ordered
     */
    protected Status status;

    /**
     * This is true if the Status containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean statusESet;

    /**
     * The cached value of the '{@link #getReplacementWorkTasks() <em>Replacement Work Tasks</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReplacementWorkTasks()
     * @generated
     * @ordered
     */
    protected EList< WorkTask > replacementWorkTasks;

    /**
     * The cached value of the '{@link #getAnalytic() <em>Analytic</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnalytic()
     * @generated
     * @ordered
     */
    protected EList< Analytic > analytic;

    /**
     * The cached value of the '{@link #getProductAssetModel() <em>Product Asset Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProductAssetModel()
     * @generated
     * @ordered
     */
    protected ProductAssetModel productAssetModel;

    /**
     * This is true if the Product Asset Model reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean productAssetModelESet;

    /**
     * The cached value of the '{@link #getProcedures() <em>Procedures</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcedures()
     * @generated
     * @ordered
     */
    protected EList< Procedure > procedures;

    /**
     * The cached value of the '{@link #getScheduledEvents() <em>Scheduled Events</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScheduledEvents()
     * @generated
     * @ordered
     */
    protected EList< ScheduledEvent > scheduledEvents;

    /**
     * The cached value of the '{@link #getOwnerships() <em>Ownerships</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnerships()
     * @generated
     * @ordered
     */
    protected EList< Ownership > ownerships;

    /**
     * The cached value of the '{@link #getConfigurationEvents() <em>Configuration Events</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigurationEvents()
     * @generated
     * @ordered
     */
    protected EList< ConfigurationEvent > configurationEvents;

    /**
     * The cached value of the '{@link #getWorkTasks() <em>Work Tasks</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWorkTasks()
     * @generated
     * @ordered
     */
    protected EList< WorkTask > workTasks;

    /**
     * The cached value of the '{@link #getOperationalTags() <em>Operational Tags</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperationalTags()
     * @generated
     * @ordered
     */
    protected EList< OperationalTag > operationalTags;

    /**
     * The cached value of the '{@link #getBreakerOperation() <em>Breaker Operation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBreakerOperation()
     * @generated
     * @ordered
     */
    protected SwitchOperationSummary breakerOperation;

    /**
     * This is true if the Breaker Operation reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean breakerOperationESet;

    /**
     * The cached value of the '{@link #getOrganisationRoles() <em>Organisation Roles</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrganisationRoles()
     * @generated
     * @ordered
     */
    protected EList< AssetOrganisationRole > organisationRoles;

    /**
     * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
    protected Location location;

    /**
     * This is true if the Location reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean locationESet;

    /**
     * The cached value of the '{@link #getMeasurements() <em>Measurements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurements()
     * @generated
     * @ordered
     */
    protected EList< Measurement > measurements;

    /**
     * The cached value of the '{@link #getActivityRecords() <em>Activity Records</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActivityRecords()
     * @generated
     * @ordered
     */
    protected EList< ActivityRecord > activityRecords;

    /**
     * The cached value of the '{@link #getFinancialInfo() <em>Financial Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFinancialInfo()
     * @generated
     * @ordered
     */
    protected FinancialInfo financialInfo;

    /**
     * This is true if the Financial Info reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean financialInfoESet;

    /**
     * The cached value of the '{@link #getProcedureDataSet() <em>Procedure Data Set</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcedureDataSet()
     * @generated
     * @ordered
     */
    protected EList< ProcedureDataSet > procedureDataSet;

    /**
     * The cached value of the '{@link #getMedium() <em>Medium</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMedium()
     * @generated
     * @ordered
     */
    protected EList< Medium > medium;

    /**
     * The cached value of the '{@link #getAssetContainer() <em>Asset Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssetContainer()
     * @generated
     * @ordered
     */
    protected AssetContainer assetContainer;

    /**
     * This is true if the Asset Container reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean assetContainerESet;

    /**
     * The cached value of the '{@link #getAssetDeployment() <em>Asset Deployment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssetDeployment()
     * @generated
     * @ordered
     */
    protected AssetDeployment assetDeployment;

    /**
     * This is true if the Asset Deployment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean assetDeploymentESet;

    /**
     * The cached value of the '{@link #getAnalyticScore() <em>Analytic Score</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnalyticScore()
     * @generated
     * @ordered
     */
    protected EList< AnalyticScore > analyticScore;

    /**
     * The cached value of the '{@link #getPowerSystemResources() <em>Power System Resources</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerSystemResources()
     * @generated
     * @ordered
     */
    protected EList< PowerSystemResource > powerSystemResources;

    /**
     * The cached value of the '{@link #getAssetInfo() <em>Asset Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssetInfo()
     * @generated
     * @ordered
     */
    protected AssetInfo assetInfo;

    /**
     * This is true if the Asset Info reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean assetInfoESet;

    /**
     * The cached value of the '{@link #getAssetGroup() <em>Asset Group</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssetGroup()
     * @generated
     * @ordered
     */
    protected EList< AssetGroup > assetGroup;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAsset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getBaselineCondition() {
        return baselineCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBaselineCondition( String newBaselineCondition ) {
        String oldBaselineCondition = baselineCondition;
        baselineCondition = newBaselineCondition;
        boolean oldBaselineConditionESet = baselineConditionESet;
        baselineConditionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET__BASELINE_CONDITION,
                    oldBaselineCondition, baselineCondition, !oldBaselineConditionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBaselineCondition() {
        String oldBaselineCondition = baselineCondition;
        boolean oldBaselineConditionESet = baselineConditionESet;
        baselineCondition = BASELINE_CONDITION_EDEFAULT;
        baselineConditionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET__BASELINE_CONDITION,
                    oldBaselineCondition, BASELINE_CONDITION_EDEFAULT, oldBaselineConditionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBaselineCondition() {
        return baselineConditionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBaselineLossOfLife() {
        return baselineLossOfLife;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBaselineLossOfLife( Float newBaselineLossOfLife ) {
        Float oldBaselineLossOfLife = baselineLossOfLife;
        baselineLossOfLife = newBaselineLossOfLife;
        boolean oldBaselineLossOfLifeESet = baselineLossOfLifeESet;
        baselineLossOfLifeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET__BASELINE_LOSS_OF_LIFE,
                    oldBaselineLossOfLife, baselineLossOfLife, !oldBaselineLossOfLifeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBaselineLossOfLife() {
        Float oldBaselineLossOfLife = baselineLossOfLife;
        boolean oldBaselineLossOfLifeESet = baselineLossOfLifeESet;
        baselineLossOfLife = BASELINE_LOSS_OF_LIFE_EDEFAULT;
        baselineLossOfLifeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET__BASELINE_LOSS_OF_LIFE,
                    oldBaselineLossOfLife, BASELINE_LOSS_OF_LIFE_EDEFAULT, oldBaselineLossOfLifeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBaselineLossOfLife() {
        return baselineLossOfLifeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getCritical() {
        return critical;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCritical( Boolean newCritical ) {
        Boolean oldCritical = critical;
        critical = newCritical;
        boolean oldCriticalESet = criticalESet;
        criticalESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASSET__CRITICAL, oldCritical, critical, !oldCriticalESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCritical() {
        Boolean oldCritical = critical;
        boolean oldCriticalESet = criticalESet;
        critical = CRITICAL_EDEFAULT;
        criticalESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASSET__CRITICAL, oldCritical, CRITICAL_EDEFAULT, oldCriticalESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCritical() {
        return criticalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public InUseStateKind getInUseState() {
        return inUseState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInUseState( InUseStateKind newInUseState ) {
        InUseStateKind oldInUseState = inUseState;
        inUseState = newInUseState == null ? IN_USE_STATE_EDEFAULT : newInUseState;
        boolean oldInUseStateESet = inUseStateESet;
        inUseStateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASSET__IN_USE_STATE, oldInUseState, inUseState, !oldInUseStateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInUseState() {
        InUseStateKind oldInUseState = inUseState;
        boolean oldInUseStateESet = inUseStateESet;
        inUseState = IN_USE_STATE_EDEFAULT;
        inUseStateESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASSET__IN_USE_STATE, oldInUseState, IN_USE_STATE_EDEFAULT, oldInUseStateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInUseState() {
        return inUseStateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssetKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKind( AssetKind newKind ) {
        AssetKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        boolean oldKindESet = kindESet;
        kindESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.ASSET__KIND, oldKind, kind, !oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKind() {
        AssetKind oldKind = kind;
        boolean oldKindESet = kindESet;
        kind = KIND_EDEFAULT;
        kindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET__KIND,
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
    public AssetLifecycleStateKind getLifecycleState() {
        return lifecycleState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLifecycleState( AssetLifecycleStateKind newLifecycleState ) {
        AssetLifecycleStateKind oldLifecycleState = lifecycleState;
        lifecycleState = newLifecycleState == null ? LIFECYCLE_STATE_EDEFAULT : newLifecycleState;
        boolean oldLifecycleStateESet = lifecycleStateESet;
        lifecycleStateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASSET__LIFECYCLE_STATE, oldLifecycleState, lifecycleState, !oldLifecycleStateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLifecycleState() {
        AssetLifecycleStateKind oldLifecycleState = lifecycleState;
        boolean oldLifecycleStateESet = lifecycleStateESet;
        lifecycleState = LIFECYCLE_STATE_EDEFAULT;
        lifecycleStateESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET__LIFECYCLE_STATE,
                    oldLifecycleState, LIFECYCLE_STATE_EDEFAULT, oldLifecycleStateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLifecycleState() {
        return lifecycleStateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLotNumber() {
        return lotNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLotNumber( String newLotNumber ) {
        String oldLotNumber = lotNumber;
        lotNumber = newLotNumber;
        boolean oldLotNumberESet = lotNumberESet;
        lotNumberESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASSET__LOT_NUMBER, oldLotNumber, lotNumber, !oldLotNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLotNumber() {
        String oldLotNumber = lotNumber;
        boolean oldLotNumberESet = lotNumberESet;
        lotNumber = LOT_NUMBER_EDEFAULT;
        lotNumberESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASSET__LOT_NUMBER, oldLotNumber, LOT_NUMBER_EDEFAULT, oldLotNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLotNumber() {
        return lotNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPosition() {
        return position;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPosition( String newPosition ) {
        String oldPosition = position;
        position = newPosition;
        boolean oldPositionESet = positionESet;
        positionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASSET__POSITION, oldPosition, position, !oldPositionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPosition() {
        String oldPosition = position;
        boolean oldPositionESet = positionESet;
        position = POSITION_EDEFAULT;
        positionESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASSET__POSITION, oldPosition, POSITION_EDEFAULT, oldPositionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPosition() {
        return positionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPurchasePrice( BigDecimal newPurchasePrice ) {
        BigDecimal oldPurchasePrice = purchasePrice;
        purchasePrice = newPurchasePrice;
        boolean oldPurchasePriceESet = purchasePriceESet;
        purchasePriceESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASSET__PURCHASE_PRICE, oldPurchasePrice, purchasePrice, !oldPurchasePriceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPurchasePrice() {
        BigDecimal oldPurchasePrice = purchasePrice;
        boolean oldPurchasePriceESet = purchasePriceESet;
        purchasePrice = PURCHASE_PRICE_EDEFAULT;
        purchasePriceESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASSET__PURCHASE_PRICE, oldPurchasePrice, PURCHASE_PRICE_EDEFAULT, oldPurchasePriceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPurchasePrice() {
        return purchasePriceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RetiredReasonKind getRetiredReason() {
        return retiredReason;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRetiredReason( RetiredReasonKind newRetiredReason ) {
        RetiredReasonKind oldRetiredReason = retiredReason;
        retiredReason = newRetiredReason == null ? RETIRED_REASON_EDEFAULT : newRetiredReason;
        boolean oldRetiredReasonESet = retiredReasonESet;
        retiredReasonESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASSET__RETIRED_REASON, oldRetiredReason, retiredReason, !oldRetiredReasonESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRetiredReason() {
        RetiredReasonKind oldRetiredReason = retiredReason;
        boolean oldRetiredReasonESet = retiredReasonESet;
        retiredReason = RETIRED_REASON_EDEFAULT;
        retiredReasonESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASSET__RETIRED_REASON, oldRetiredReason, RETIRED_REASON_EDEFAULT, oldRetiredReasonESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRetiredReason() {
        return retiredReasonESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSerialNumber( String newSerialNumber ) {
        String oldSerialNumber = serialNumber;
        serialNumber = newSerialNumber;
        boolean oldSerialNumberESet = serialNumberESet;
        serialNumberESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASSET__SERIAL_NUMBER, oldSerialNumber, serialNumber, !oldSerialNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSerialNumber() {
        String oldSerialNumber = serialNumber;
        boolean oldSerialNumberESet = serialNumberESet;
        serialNumber = SERIAL_NUMBER_EDEFAULT;
        serialNumberESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASSET__SERIAL_NUMBER, oldSerialNumber, SERIAL_NUMBER_EDEFAULT, oldSerialNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSerialNumber() {
        return serialNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType( String newType ) {
        String oldType = type;
        type = newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.ASSET__TYPE, oldType, type, !oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetType() {
        String oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET__TYPE,
                oldType, TYPE_EDEFAULT, oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetType() {
        return typeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getUtcNumber() {
        return utcNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUtcNumber( String newUtcNumber ) {
        String oldUtcNumber = utcNumber;
        utcNumber = newUtcNumber;
        boolean oldUtcNumberESet = utcNumberESet;
        utcNumberESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASSET__UTC_NUMBER, oldUtcNumber, utcNumber, !oldUtcNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUtcNumber() {
        String oldUtcNumber = utcNumber;
        boolean oldUtcNumberESet = utcNumberESet;
        utcNumber = UTC_NUMBER_EDEFAULT;
        utcNumberESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASSET__UTC_NUMBER, oldUtcNumber, UTC_NUMBER_EDEFAULT, oldUtcNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUtcNumber() {
        return utcNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AcceptanceTest getAcceptanceTest() {
        return acceptanceTest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAcceptanceTest( AcceptanceTest newAcceptanceTest, NotificationChain msgs ) {
        AcceptanceTest oldAcceptanceTest = acceptanceTest;
        acceptanceTest = newAcceptanceTest;
        boolean oldAcceptanceTestESet = acceptanceTestESet;
        acceptanceTestESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET__ACCEPTANCE_TEST, oldAcceptanceTest, newAcceptanceTest, !oldAcceptanceTestESet );
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
    public void setAcceptanceTest( AcceptanceTest newAcceptanceTest ) {
        if( newAcceptanceTest != acceptanceTest ) {
            NotificationChain msgs = null;
            if( acceptanceTest != null ) msgs = ( ( InternalEObject ) acceptanceTest ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ASSET__ACCEPTANCE_TEST, null, msgs );
            if( newAcceptanceTest != null ) msgs = ( ( InternalEObject ) newAcceptanceTest ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ASSET__ACCEPTANCE_TEST, null, msgs );
            msgs = basicSetAcceptanceTest( newAcceptanceTest, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAcceptanceTestESet = acceptanceTestESet;
            acceptanceTestESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET__ACCEPTANCE_TEST, newAcceptanceTest, newAcceptanceTest, !oldAcceptanceTestESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAcceptanceTest( NotificationChain msgs ) {
        AcceptanceTest oldAcceptanceTest = acceptanceTest;
        acceptanceTest = null;
        boolean oldAcceptanceTestESet = acceptanceTestESet;
        acceptanceTestESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET__ACCEPTANCE_TEST, oldAcceptanceTest, null, oldAcceptanceTestESet );
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
    public void unsetAcceptanceTest() {
        if( acceptanceTest != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) acceptanceTest ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ASSET__ACCEPTANCE_TEST, null, msgs );
            msgs = basicUnsetAcceptanceTest( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAcceptanceTestESet = acceptanceTestESet;
            acceptanceTestESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET__ACCEPTANCE_TEST, null, null, oldAcceptanceTestESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAcceptanceTest() {
        return acceptanceTestESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ElectronicAddress getElectronicAddress() {
        return electronicAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetElectronicAddress( ElectronicAddress newElectronicAddress,
            NotificationChain msgs ) {
        ElectronicAddress oldElectronicAddress = electronicAddress;
        electronicAddress = newElectronicAddress;
        boolean oldElectronicAddressESet = electronicAddressESet;
        electronicAddressESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET__ELECTRONIC_ADDRESS, oldElectronicAddress, newElectronicAddress,
                    !oldElectronicAddressESet );
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
    public void setElectronicAddress( ElectronicAddress newElectronicAddress ) {
        if( newElectronicAddress != electronicAddress ) {
            NotificationChain msgs = null;
            if( electronicAddress != null ) msgs = ( ( InternalEObject ) electronicAddress ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ASSET__ELECTRONIC_ADDRESS, null, msgs );
            if( newElectronicAddress != null ) msgs = ( ( InternalEObject ) newElectronicAddress ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ASSET__ELECTRONIC_ADDRESS, null, msgs );
            msgs = basicSetElectronicAddress( newElectronicAddress, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldElectronicAddressESet = electronicAddressESet;
            electronicAddressESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET__ELECTRONIC_ADDRESS,
                        newElectronicAddress, newElectronicAddress, !oldElectronicAddressESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetElectronicAddress( NotificationChain msgs ) {
        ElectronicAddress oldElectronicAddress = electronicAddress;
        electronicAddress = null;
        boolean oldElectronicAddressESet = electronicAddressESet;
        electronicAddressESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET__ELECTRONIC_ADDRESS, oldElectronicAddress, null, oldElectronicAddressESet );
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
    public void unsetElectronicAddress() {
        if( electronicAddress != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) electronicAddress ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ASSET__ELECTRONIC_ADDRESS, null, msgs );
            msgs = basicUnsetElectronicAddress( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldElectronicAddressESet = electronicAddressESet;
            electronicAddressESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET__ELECTRONIC_ADDRESS, null, null, oldElectronicAddressESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetElectronicAddress() {
        return electronicAddressESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public InUseDate getInUseDate() {
        return inUseDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInUseDate( InUseDate newInUseDate, NotificationChain msgs ) {
        InUseDate oldInUseDate = inUseDate;
        inUseDate = newInUseDate;
        boolean oldInUseDateESet = inUseDateESet;
        inUseDateESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET__IN_USE_DATE, oldInUseDate, newInUseDate, !oldInUseDateESet );
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
    public void setInUseDate( InUseDate newInUseDate ) {
        if( newInUseDate != inUseDate ) {
            NotificationChain msgs = null;
            if( inUseDate != null ) msgs = ( ( InternalEObject ) inUseDate ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ASSET__IN_USE_DATE, null, msgs );
            if( newInUseDate != null ) msgs = ( ( InternalEObject ) newInUseDate ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ASSET__IN_USE_DATE, null, msgs );
            msgs = basicSetInUseDate( newInUseDate, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldInUseDateESet = inUseDateESet;
            inUseDateESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET__IN_USE_DATE, newInUseDate, newInUseDate, !oldInUseDateESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetInUseDate( NotificationChain msgs ) {
        InUseDate oldInUseDate = inUseDate;
        inUseDate = null;
        boolean oldInUseDateESet = inUseDateESet;
        inUseDateESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET__IN_USE_DATE, oldInUseDate, null, oldInUseDateESet );
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
    public void unsetInUseDate() {
        if( inUseDate != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) inUseDate ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ASSET__IN_USE_DATE, null, msgs );
            msgs = basicUnsetInUseDate( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldInUseDateESet = inUseDateESet;
            inUseDateESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET__IN_USE_DATE, null, null, oldInUseDateESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInUseDate() {
        return inUseDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LifecycleDate getLifecycleDate() {
        return lifecycleDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLifecycleDate( LifecycleDate newLifecycleDate, NotificationChain msgs ) {
        LifecycleDate oldLifecycleDate = lifecycleDate;
        lifecycleDate = newLifecycleDate;
        boolean oldLifecycleDateESet = lifecycleDateESet;
        lifecycleDateESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET__LIFECYCLE_DATE, oldLifecycleDate, newLifecycleDate, !oldLifecycleDateESet );
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
    public void setLifecycleDate( LifecycleDate newLifecycleDate ) {
        if( newLifecycleDate != lifecycleDate ) {
            NotificationChain msgs = null;
            if( lifecycleDate != null ) msgs = ( ( InternalEObject ) lifecycleDate ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ASSET__LIFECYCLE_DATE, null, msgs );
            if( newLifecycleDate != null ) msgs = ( ( InternalEObject ) newLifecycleDate ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ASSET__LIFECYCLE_DATE, null, msgs );
            msgs = basicSetLifecycleDate( newLifecycleDate, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLifecycleDateESet = lifecycleDateESet;
            lifecycleDateESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET__LIFECYCLE_DATE, newLifecycleDate, newLifecycleDate, !oldLifecycleDateESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLifecycleDate( NotificationChain msgs ) {
        LifecycleDate oldLifecycleDate = lifecycleDate;
        lifecycleDate = null;
        boolean oldLifecycleDateESet = lifecycleDateESet;
        lifecycleDateESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET__LIFECYCLE_DATE, oldLifecycleDate, null, oldLifecycleDateESet );
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
    public void unsetLifecycleDate() {
        if( lifecycleDate != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) lifecycleDate ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ASSET__LIFECYCLE_DATE, null, msgs );
            msgs = basicUnsetLifecycleDate( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLifecycleDateESet = lifecycleDateESet;
            lifecycleDateESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET__LIFECYCLE_DATE, null, null, oldLifecycleDateESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLifecycleDate() {
        return lifecycleDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Status getStatus() {
        return status;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStatus( Status newStatus, NotificationChain msgs ) {
        Status oldStatus = status;
        status = newStatus;
        boolean oldStatusESet = statusESet;
        statusESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.ASSET__STATUS,
                    oldStatus, newStatus, !oldStatusESet );
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
    public void setStatus( Status newStatus ) {
        if( newStatus != status ) {
            NotificationChain msgs = null;
            if( status != null ) msgs = ( ( InternalEObject ) status ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ASSET__STATUS, null, msgs );
            if( newStatus != null ) msgs = ( ( InternalEObject ) newStatus ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ASSET__STATUS, null, msgs );
            msgs = basicSetStatus( newStatus, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStatusESet = statusESet;
            statusESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET__STATUS, newStatus, newStatus, !oldStatusESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetStatus( NotificationChain msgs ) {
        Status oldStatus = status;
        status = null;
        boolean oldStatusESet = statusESet;
        statusESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET__STATUS,
                    oldStatus, null, oldStatusESet );
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
    public void unsetStatus() {
        if( status != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) status ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ASSET__STATUS, null, msgs );
            msgs = basicUnsetStatus( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStatusESet = statusESet;
            statusESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET__STATUS, null, null, oldStatusESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStatus() {
        return statusESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< WorkTask > getReplacementWorkTasks() {
        if( replacementWorkTasks == null ) {
            replacementWorkTasks = new EObjectWithInverseResolvingEList.Unsettable< WorkTask >( WorkTask.class, this,
                    CimPackage.ASSET__REPLACEMENT_WORK_TASKS, CimPackage.WORK_TASK__OLD_ASSET );
        }
        return replacementWorkTasks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReplacementWorkTasks() {
        if( replacementWorkTasks != null ) ( ( InternalEList.Unsettable< ? > ) replacementWorkTasks ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReplacementWorkTasks() {
        return replacementWorkTasks != null && ( ( InternalEList.Unsettable< ? > ) replacementWorkTasks ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Analytic > getAnalytic() {
        if( analytic == null ) {
            analytic = new EObjectWithInverseEList.Unsettable.ManyInverse< Analytic >( Analytic.class, this,
                    CimPackage.ASSET__ANALYTIC, CimPackage.ANALYTIC__ASSET );
        }
        return analytic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAnalytic() {
        if( analytic != null ) ( ( InternalEList.Unsettable< ? > ) analytic ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAnalytic() {
        return analytic != null && ( ( InternalEList.Unsettable< ? > ) analytic ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ProductAssetModel getProductAssetModel() {
        return productAssetModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProductAssetModel( ProductAssetModel newProductAssetModel,
            NotificationChain msgs ) {
        ProductAssetModel oldProductAssetModel = productAssetModel;
        productAssetModel = newProductAssetModel;
        boolean oldProductAssetModelESet = productAssetModelESet;
        productAssetModelESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET__PRODUCT_ASSET_MODEL, oldProductAssetModel, newProductAssetModel,
                    !oldProductAssetModelESet );
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
    public void setProductAssetModel( ProductAssetModel newProductAssetModel ) {
        if( newProductAssetModel != productAssetModel ) {
            NotificationChain msgs = null;
            if( productAssetModel != null ) msgs = ( ( InternalEObject ) productAssetModel ).eInverseRemove( this,
                    CimPackage.PRODUCT_ASSET_MODEL__ASSET, ProductAssetModel.class, msgs );
            if( newProductAssetModel != null ) msgs = ( ( InternalEObject ) newProductAssetModel ).eInverseAdd( this,
                    CimPackage.PRODUCT_ASSET_MODEL__ASSET, ProductAssetModel.class, msgs );
            msgs = basicSetProductAssetModel( newProductAssetModel, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldProductAssetModelESet = productAssetModelESet;
            productAssetModelESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET__PRODUCT_ASSET_MODEL,
                        newProductAssetModel, newProductAssetModel, !oldProductAssetModelESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetProductAssetModel( NotificationChain msgs ) {
        ProductAssetModel oldProductAssetModel = productAssetModel;
        productAssetModel = null;
        boolean oldProductAssetModelESet = productAssetModelESet;
        productAssetModelESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET__PRODUCT_ASSET_MODEL, oldProductAssetModel, null, oldProductAssetModelESet );
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
    public void unsetProductAssetModel() {
        if( productAssetModel != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) productAssetModel ).eInverseRemove( this,
                    CimPackage.PRODUCT_ASSET_MODEL__ASSET, ProductAssetModel.class, msgs );
            msgs = basicUnsetProductAssetModel( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldProductAssetModelESet = productAssetModelESet;
            productAssetModelESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET__PRODUCT_ASSET_MODEL, null, null, oldProductAssetModelESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProductAssetModel() {
        return productAssetModelESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Procedure > getProcedures() {
        if( procedures == null ) {
            procedures = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< Procedure >( Procedure.class,
                    this, CimPackage.ASSET__PROCEDURES, CimPackage.PROCEDURE__ASSETS );
        }
        return procedures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetProcedures() {
        if( procedures != null ) ( ( InternalEList.Unsettable< ? > ) procedures ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProcedures() {
        return procedures != null && ( ( InternalEList.Unsettable< ? > ) procedures ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ScheduledEvent > getScheduledEvents() {
        if( scheduledEvents == null ) {
            scheduledEvents = new EObjectWithInverseEList.Unsettable.ManyInverse< ScheduledEvent >(
                    ScheduledEvent.class, this, CimPackage.ASSET__SCHEDULED_EVENTS,
                    CimPackage.SCHEDULED_EVENT__ASSETS );
        }
        return scheduledEvents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetScheduledEvents() {
        if( scheduledEvents != null ) ( ( InternalEList.Unsettable< ? > ) scheduledEvents ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetScheduledEvents() {
        return scheduledEvents != null && ( ( InternalEList.Unsettable< ? > ) scheduledEvents ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Ownership > getOwnerships() {
        if( ownerships == null ) {
            ownerships = new EObjectWithInverseResolvingEList.Unsettable< Ownership >( Ownership.class, this,
                    CimPackage.ASSET__OWNERSHIPS, CimPackage.OWNERSHIP__ASSET );
        }
        return ownerships;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOwnerships() {
        if( ownerships != null ) ( ( InternalEList.Unsettable< ? > ) ownerships ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOwnerships() {
        return ownerships != null && ( ( InternalEList.Unsettable< ? > ) ownerships ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ConfigurationEvent > getConfigurationEvents() {
        if( configurationEvents == null ) {
            configurationEvents = new EObjectWithInverseResolvingEList.Unsettable< ConfigurationEvent >(
                    ConfigurationEvent.class, this, CimPackage.ASSET__CONFIGURATION_EVENTS,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_ASSET );
        }
        return configurationEvents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConfigurationEvents() {
        if( configurationEvents != null ) ( ( InternalEList.Unsettable< ? > ) configurationEvents ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConfigurationEvents() {
        return configurationEvents != null && ( ( InternalEList.Unsettable< ? > ) configurationEvents ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< WorkTask > getWorkTasks() {
        if( workTasks == null ) {
            workTasks = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< WorkTask >( WorkTask.class, this,
                    CimPackage.ASSET__WORK_TASKS, CimPackage.WORK_TASK__ASSETS );
        }
        return workTasks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWorkTasks() {
        if( workTasks != null ) ( ( InternalEList.Unsettable< ? > ) workTasks ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWorkTasks() {
        return workTasks != null && ( ( InternalEList.Unsettable< ? > ) workTasks ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< OperationalTag > getOperationalTags() {
        if( operationalTags == null ) {
            operationalTags = new EObjectWithInverseResolvingEList.Unsettable< OperationalTag >( OperationalTag.class,
                    this, CimPackage.ASSET__OPERATIONAL_TAGS, CimPackage.OPERATIONAL_TAG__ASSET );
        }
        return operationalTags;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOperationalTags() {
        if( operationalTags != null ) ( ( InternalEList.Unsettable< ? > ) operationalTags ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOperationalTags() {
        return operationalTags != null && ( ( InternalEList.Unsettable< ? > ) operationalTags ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SwitchOperationSummary getBreakerOperation() {
        return breakerOperation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBreakerOperation( SwitchOperationSummary newBreakerOperation,
            NotificationChain msgs ) {
        SwitchOperationSummary oldBreakerOperation = breakerOperation;
        breakerOperation = newBreakerOperation;
        boolean oldBreakerOperationESet = breakerOperationESet;
        breakerOperationESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET__BREAKER_OPERATION, oldBreakerOperation, newBreakerOperation,
                    !oldBreakerOperationESet );
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
    public void setBreakerOperation( SwitchOperationSummary newBreakerOperation ) {
        if( newBreakerOperation != breakerOperation ) {
            NotificationChain msgs = null;
            if( breakerOperation != null ) msgs = ( ( InternalEObject ) breakerOperation ).eInverseRemove( this,
                    CimPackage.SWITCH_OPERATION_SUMMARY__BREAKER, SwitchOperationSummary.class, msgs );
            if( newBreakerOperation != null ) msgs = ( ( InternalEObject ) newBreakerOperation ).eInverseAdd( this,
                    CimPackage.SWITCH_OPERATION_SUMMARY__BREAKER, SwitchOperationSummary.class, msgs );
            msgs = basicSetBreakerOperation( newBreakerOperation, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBreakerOperationESet = breakerOperationESet;
            breakerOperationESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET__BREAKER_OPERATION,
                        newBreakerOperation, newBreakerOperation, !oldBreakerOperationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetBreakerOperation( NotificationChain msgs ) {
        SwitchOperationSummary oldBreakerOperation = breakerOperation;
        breakerOperation = null;
        boolean oldBreakerOperationESet = breakerOperationESet;
        breakerOperationESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET__BREAKER_OPERATION, oldBreakerOperation, null, oldBreakerOperationESet );
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
    public void unsetBreakerOperation() {
        if( breakerOperation != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) breakerOperation ).eInverseRemove( this,
                    CimPackage.SWITCH_OPERATION_SUMMARY__BREAKER, SwitchOperationSummary.class, msgs );
            msgs = basicUnsetBreakerOperation( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBreakerOperationESet = breakerOperationESet;
            breakerOperationESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET__BREAKER_OPERATION, null, null, oldBreakerOperationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBreakerOperation() {
        return breakerOperationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AssetOrganisationRole > getOrganisationRoles() {
        if( organisationRoles == null ) {
            organisationRoles = new EObjectWithInverseEList.Unsettable.ManyInverse< AssetOrganisationRole >(
                    AssetOrganisationRole.class, this, CimPackage.ASSET__ORGANISATION_ROLES,
                    CimPackage.ASSET_ORGANISATION_ROLE__ASSETS );
        }
        return organisationRoles;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOrganisationRoles() {
        if( organisationRoles != null ) ( ( InternalEList.Unsettable< ? > ) organisationRoles ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOrganisationRoles() {
        return organisationRoles != null && ( ( InternalEList.Unsettable< ? > ) organisationRoles ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Location getLocation() {
        return location;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLocation( Location newLocation, NotificationChain msgs ) {
        Location oldLocation = location;
        location = newLocation;
        boolean oldLocationESet = locationESet;
        locationESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.ASSET__LOCATION,
                    oldLocation, newLocation, !oldLocationESet );
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
    public void setLocation( Location newLocation ) {
        if( newLocation != location ) {
            NotificationChain msgs = null;
            if( location != null ) msgs = ( ( InternalEObject ) location ).eInverseRemove( this,
                    CimPackage.LOCATION__ASSETS, Location.class, msgs );
            if( newLocation != null ) msgs = ( ( InternalEObject ) newLocation ).eInverseAdd( this,
                    CimPackage.LOCATION__ASSETS, Location.class, msgs );
            msgs = basicSetLocation( newLocation, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLocationESet = locationESet;
            locationESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET__LOCATION, newLocation, newLocation, !oldLocationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLocation( NotificationChain msgs ) {
        Location oldLocation = location;
        location = null;
        boolean oldLocationESet = locationESet;
        locationESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET__LOCATION, oldLocation, null, oldLocationESet );
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
    public void unsetLocation() {
        if( location != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) location ).eInverseRemove( this, CimPackage.LOCATION__ASSETS, Location.class,
                    msgs );
            msgs = basicUnsetLocation( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLocationESet = locationESet;
            locationESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET__LOCATION, null, null, oldLocationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLocation() {
        return locationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Measurement > getMeasurements() {
        if( measurements == null ) {
            measurements = new EObjectWithInverseResolvingEList.Unsettable< Measurement >( Measurement.class, this,
                    CimPackage.ASSET__MEASUREMENTS, CimPackage.MEASUREMENT__ASSET );
        }
        return measurements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMeasurements() {
        if( measurements != null ) ( ( InternalEList.Unsettable< ? > ) measurements ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeasurements() {
        return measurements != null && ( ( InternalEList.Unsettable< ? > ) measurements ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ActivityRecord > getActivityRecords() {
        if( activityRecords == null ) {
            activityRecords = new EObjectWithInverseEList.Unsettable.ManyInverse< ActivityRecord >(
                    ActivityRecord.class, this, CimPackage.ASSET__ACTIVITY_RECORDS,
                    CimPackage.ACTIVITY_RECORD__ASSETS );
        }
        return activityRecords;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetActivityRecords() {
        if( activityRecords != null ) ( ( InternalEList.Unsettable< ? > ) activityRecords ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetActivityRecords() {
        return activityRecords != null && ( ( InternalEList.Unsettable< ? > ) activityRecords ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FinancialInfo getFinancialInfo() {
        return financialInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFinancialInfo( FinancialInfo newFinancialInfo, NotificationChain msgs ) {
        FinancialInfo oldFinancialInfo = financialInfo;
        financialInfo = newFinancialInfo;
        boolean oldFinancialInfoESet = financialInfoESet;
        financialInfoESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET__FINANCIAL_INFO, oldFinancialInfo, newFinancialInfo, !oldFinancialInfoESet );
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
    public void setFinancialInfo( FinancialInfo newFinancialInfo ) {
        if( newFinancialInfo != financialInfo ) {
            NotificationChain msgs = null;
            if( financialInfo != null ) msgs = ( ( InternalEObject ) financialInfo ).eInverseRemove( this,
                    CimPackage.FINANCIAL_INFO__ASSET, FinancialInfo.class, msgs );
            if( newFinancialInfo != null ) msgs = ( ( InternalEObject ) newFinancialInfo ).eInverseAdd( this,
                    CimPackage.FINANCIAL_INFO__ASSET, FinancialInfo.class, msgs );
            msgs = basicSetFinancialInfo( newFinancialInfo, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldFinancialInfoESet = financialInfoESet;
            financialInfoESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET__FINANCIAL_INFO, newFinancialInfo, newFinancialInfo, !oldFinancialInfoESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetFinancialInfo( NotificationChain msgs ) {
        FinancialInfo oldFinancialInfo = financialInfo;
        financialInfo = null;
        boolean oldFinancialInfoESet = financialInfoESet;
        financialInfoESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET__FINANCIAL_INFO, oldFinancialInfo, null, oldFinancialInfoESet );
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
    public void unsetFinancialInfo() {
        if( financialInfo != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) financialInfo ).eInverseRemove( this, CimPackage.FINANCIAL_INFO__ASSET,
                    FinancialInfo.class, msgs );
            msgs = basicUnsetFinancialInfo( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldFinancialInfoESet = financialInfoESet;
            financialInfoESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET__FINANCIAL_INFO, null, null, oldFinancialInfoESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFinancialInfo() {
        return financialInfoESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ProcedureDataSet > getProcedureDataSet() {
        if( procedureDataSet == null ) {
            procedureDataSet = new EObjectWithInverseResolvingEList.Unsettable< ProcedureDataSet >(
                    ProcedureDataSet.class, this, CimPackage.ASSET__PROCEDURE_DATA_SET,
                    CimPackage.PROCEDURE_DATA_SET__ASSET );
        }
        return procedureDataSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetProcedureDataSet() {
        if( procedureDataSet != null ) ( ( InternalEList.Unsettable< ? > ) procedureDataSet ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProcedureDataSet() {
        return procedureDataSet != null && ( ( InternalEList.Unsettable< ? > ) procedureDataSet ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Medium > getMedium() {
        if( medium == null ) {
            medium = new EObjectWithInverseEList.Unsettable.ManyInverse< Medium >( Medium.class, this,
                    CimPackage.ASSET__MEDIUM, CimPackage.MEDIUM__ASSET );
        }
        return medium;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMedium() {
        if( medium != null ) ( ( InternalEList.Unsettable< ? > ) medium ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMedium() {
        return medium != null && ( ( InternalEList.Unsettable< ? > ) medium ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssetContainer getAssetContainer() {
        return assetContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAssetContainer( AssetContainer newAssetContainer, NotificationChain msgs ) {
        AssetContainer oldAssetContainer = assetContainer;
        assetContainer = newAssetContainer;
        boolean oldAssetContainerESet = assetContainerESet;
        assetContainerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET__ASSET_CONTAINER, oldAssetContainer, newAssetContainer, !oldAssetContainerESet );
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
    public void setAssetContainer( AssetContainer newAssetContainer ) {
        if( newAssetContainer != assetContainer ) {
            NotificationChain msgs = null;
            if( assetContainer != null ) msgs = ( ( InternalEObject ) assetContainer ).eInverseRemove( this,
                    CimPackage.ASSET_CONTAINER__ASSETS, AssetContainer.class, msgs );
            if( newAssetContainer != null ) msgs = ( ( InternalEObject ) newAssetContainer ).eInverseAdd( this,
                    CimPackage.ASSET_CONTAINER__ASSETS, AssetContainer.class, msgs );
            msgs = basicSetAssetContainer( newAssetContainer, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetContainerESet = assetContainerESet;
            assetContainerESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET__ASSET_CONTAINER, newAssetContainer, newAssetContainer, !oldAssetContainerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAssetContainer( NotificationChain msgs ) {
        AssetContainer oldAssetContainer = assetContainer;
        assetContainer = null;
        boolean oldAssetContainerESet = assetContainerESet;
        assetContainerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET__ASSET_CONTAINER, oldAssetContainer, null, oldAssetContainerESet );
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
    public void unsetAssetContainer() {
        if( assetContainer != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) assetContainer ).eInverseRemove( this, CimPackage.ASSET_CONTAINER__ASSETS,
                    AssetContainer.class, msgs );
            msgs = basicUnsetAssetContainer( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetContainerESet = assetContainerESet;
            assetContainerESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET__ASSET_CONTAINER, null, null, oldAssetContainerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssetContainer() {
        return assetContainerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssetDeployment getAssetDeployment() {
        if( assetDeployment != null && assetDeployment.eIsProxy() ) {
            InternalEObject oldAssetDeployment = ( InternalEObject ) assetDeployment;
            assetDeployment = ( AssetDeployment ) eResolveProxy( oldAssetDeployment );
            if( assetDeployment != oldAssetDeployment ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.ASSET__ASSET_DEPLOYMENT, oldAssetDeployment, assetDeployment ) );
            }
        }
        return assetDeployment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssetDeployment basicGetAssetDeployment() {
        return assetDeployment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAssetDeployment( AssetDeployment newAssetDeployment, NotificationChain msgs ) {
        AssetDeployment oldAssetDeployment = assetDeployment;
        assetDeployment = newAssetDeployment;
        boolean oldAssetDeploymentESet = assetDeploymentESet;
        assetDeploymentESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET__ASSET_DEPLOYMENT, oldAssetDeployment, newAssetDeployment,
                    !oldAssetDeploymentESet );
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
    public void setAssetDeployment( AssetDeployment newAssetDeployment ) {
        if( newAssetDeployment != assetDeployment ) {
            NotificationChain msgs = null;
            if( assetDeployment != null ) msgs = ( ( InternalEObject ) assetDeployment ).eInverseRemove( this,
                    CimPackage.ASSET_DEPLOYMENT__ASSET, AssetDeployment.class, msgs );
            if( newAssetDeployment != null ) msgs = ( ( InternalEObject ) newAssetDeployment ).eInverseAdd( this,
                    CimPackage.ASSET_DEPLOYMENT__ASSET, AssetDeployment.class, msgs );
            msgs = basicSetAssetDeployment( newAssetDeployment, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetDeploymentESet = assetDeploymentESet;
            assetDeploymentESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET__ASSET_DEPLOYMENT,
                        newAssetDeployment, newAssetDeployment, !oldAssetDeploymentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAssetDeployment( NotificationChain msgs ) {
        AssetDeployment oldAssetDeployment = assetDeployment;
        assetDeployment = null;
        boolean oldAssetDeploymentESet = assetDeploymentESet;
        assetDeploymentESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET__ASSET_DEPLOYMENT, oldAssetDeployment, null, oldAssetDeploymentESet );
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
    public void unsetAssetDeployment() {
        if( assetDeployment != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) assetDeployment ).eInverseRemove( this, CimPackage.ASSET_DEPLOYMENT__ASSET,
                    AssetDeployment.class, msgs );
            msgs = basicUnsetAssetDeployment( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetDeploymentESet = assetDeploymentESet;
            assetDeploymentESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET__ASSET_DEPLOYMENT, null, null, oldAssetDeploymentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssetDeployment() {
        return assetDeploymentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AnalyticScore > getAnalyticScore() {
        if( analyticScore == null ) {
            analyticScore = new EObjectWithInverseResolvingEList.Unsettable< AnalyticScore >( AnalyticScore.class, this,
                    CimPackage.ASSET__ANALYTIC_SCORE, CimPackage.ANALYTIC_SCORE__ASSET );
        }
        return analyticScore;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAnalyticScore() {
        if( analyticScore != null ) ( ( InternalEList.Unsettable< ? > ) analyticScore ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAnalyticScore() {
        return analyticScore != null && ( ( InternalEList.Unsettable< ? > ) analyticScore ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< PowerSystemResource > getPowerSystemResources() {
        if( powerSystemResources == null ) {
            powerSystemResources = new EObjectWithInverseEList.Unsettable.ManyInverse< PowerSystemResource >(
                    PowerSystemResource.class, this, CimPackage.ASSET__POWER_SYSTEM_RESOURCES,
                    CimPackage.POWER_SYSTEM_RESOURCE__ASSETS );
        }
        return powerSystemResources;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPowerSystemResources() {
        if( powerSystemResources != null ) ( ( InternalEList.Unsettable< ? > ) powerSystemResources ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerSystemResources() {
        return powerSystemResources != null && ( ( InternalEList.Unsettable< ? > ) powerSystemResources ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssetInfo getAssetInfo() {
        return assetInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAssetInfo( AssetInfo newAssetInfo, NotificationChain msgs ) {
        AssetInfo oldAssetInfo = assetInfo;
        assetInfo = newAssetInfo;
        boolean oldAssetInfoESet = assetInfoESet;
        assetInfoESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET__ASSET_INFO, oldAssetInfo, newAssetInfo, !oldAssetInfoESet );
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
    public void setAssetInfo( AssetInfo newAssetInfo ) {
        if( newAssetInfo != assetInfo ) {
            NotificationChain msgs = null;
            if( assetInfo != null ) msgs = ( ( InternalEObject ) assetInfo ).eInverseRemove( this,
                    CimPackage.ASSET_INFO__ASSETS, AssetInfo.class, msgs );
            if( newAssetInfo != null ) msgs = ( ( InternalEObject ) newAssetInfo ).eInverseAdd( this,
                    CimPackage.ASSET_INFO__ASSETS, AssetInfo.class, msgs );
            msgs = basicSetAssetInfo( newAssetInfo, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetInfoESet = assetInfoESet;
            assetInfoESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET__ASSET_INFO, newAssetInfo, newAssetInfo, !oldAssetInfoESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAssetInfo( NotificationChain msgs ) {
        AssetInfo oldAssetInfo = assetInfo;
        assetInfo = null;
        boolean oldAssetInfoESet = assetInfoESet;
        assetInfoESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET__ASSET_INFO, oldAssetInfo, null, oldAssetInfoESet );
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
    public void unsetAssetInfo() {
        if( assetInfo != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) assetInfo ).eInverseRemove( this, CimPackage.ASSET_INFO__ASSETS,
                    AssetInfo.class, msgs );
            msgs = basicUnsetAssetInfo( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetInfoESet = assetInfoESet;
            assetInfoESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET__ASSET_INFO, null, null, oldAssetInfoESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssetInfo() {
        return assetInfoESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AssetGroup > getAssetGroup() {
        if( assetGroup == null ) {
            assetGroup = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< AssetGroup >( AssetGroup.class,
                    this, CimPackage.ASSET__ASSET_GROUP, CimPackage.ASSET_GROUP__ASSET );
        }
        return assetGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAssetGroup() {
        if( assetGroup != null ) ( ( InternalEList.Unsettable< ? > ) assetGroup ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssetGroup() {
        return assetGroup != null && ( ( InternalEList.Unsettable< ? > ) assetGroup ).isSet();
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
        case CimPackage.ASSET__REPLACEMENT_WORK_TASKS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReplacementWorkTasks() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.ASSET__ANALYTIC:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAnalytic() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.ASSET__PRODUCT_ASSET_MODEL:
            if( productAssetModel != null ) msgs = ( ( InternalEObject ) productAssetModel ).eInverseRemove( this,
                    CimPackage.PRODUCT_ASSET_MODEL__ASSET, ProductAssetModel.class, msgs );
            return basicSetProductAssetModel( ( ProductAssetModel ) otherEnd, msgs );
        case CimPackage.ASSET__PROCEDURES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getProcedures() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.ASSET__SCHEDULED_EVENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getScheduledEvents() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.ASSET__OWNERSHIPS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOwnerships() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.ASSET__CONFIGURATION_EVENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getConfigurationEvents() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.ASSET__WORK_TASKS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getWorkTasks() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.ASSET__OPERATIONAL_TAGS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOperationalTags() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.ASSET__BREAKER_OPERATION:
            if( breakerOperation != null ) msgs = ( ( InternalEObject ) breakerOperation ).eInverseRemove( this,
                    CimPackage.SWITCH_OPERATION_SUMMARY__BREAKER, SwitchOperationSummary.class, msgs );
            return basicSetBreakerOperation( ( SwitchOperationSummary ) otherEnd, msgs );
        case CimPackage.ASSET__ORGANISATION_ROLES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOrganisationRoles() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.ASSET__LOCATION:
            if( location != null ) msgs = ( ( InternalEObject ) location ).eInverseRemove( this,
                    CimPackage.LOCATION__ASSETS, Location.class, msgs );
            return basicSetLocation( ( Location ) otherEnd, msgs );
        case CimPackage.ASSET__MEASUREMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getMeasurements() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.ASSET__ACTIVITY_RECORDS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getActivityRecords() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.ASSET__FINANCIAL_INFO:
            if( financialInfo != null ) msgs = ( ( InternalEObject ) financialInfo ).eInverseRemove( this,
                    CimPackage.FINANCIAL_INFO__ASSET, FinancialInfo.class, msgs );
            return basicSetFinancialInfo( ( FinancialInfo ) otherEnd, msgs );
        case CimPackage.ASSET__PROCEDURE_DATA_SET:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getProcedureDataSet() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.ASSET__MEDIUM:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getMedium() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.ASSET__ASSET_CONTAINER:
            if( assetContainer != null ) msgs = ( ( InternalEObject ) assetContainer ).eInverseRemove( this,
                    CimPackage.ASSET_CONTAINER__ASSETS, AssetContainer.class, msgs );
            return basicSetAssetContainer( ( AssetContainer ) otherEnd, msgs );
        case CimPackage.ASSET__ASSET_DEPLOYMENT:
            if( assetDeployment != null ) msgs = ( ( InternalEObject ) assetDeployment ).eInverseRemove( this,
                    CimPackage.ASSET_DEPLOYMENT__ASSET, AssetDeployment.class, msgs );
            return basicSetAssetDeployment( ( AssetDeployment ) otherEnd, msgs );
        case CimPackage.ASSET__ANALYTIC_SCORE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAnalyticScore() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.ASSET__POWER_SYSTEM_RESOURCES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPowerSystemResources() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.ASSET__ASSET_INFO:
            if( assetInfo != null ) msgs = ( ( InternalEObject ) assetInfo ).eInverseRemove( this,
                    CimPackage.ASSET_INFO__ASSETS, AssetInfo.class, msgs );
            return basicSetAssetInfo( ( AssetInfo ) otherEnd, msgs );
        case CimPackage.ASSET__ASSET_GROUP:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAssetGroup() ).basicAdd( otherEnd,
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
        case CimPackage.ASSET__ACCEPTANCE_TEST:
            return basicUnsetAcceptanceTest( msgs );
        case CimPackage.ASSET__ELECTRONIC_ADDRESS:
            return basicUnsetElectronicAddress( msgs );
        case CimPackage.ASSET__IN_USE_DATE:
            return basicUnsetInUseDate( msgs );
        case CimPackage.ASSET__LIFECYCLE_DATE:
            return basicUnsetLifecycleDate( msgs );
        case CimPackage.ASSET__STATUS:
            return basicUnsetStatus( msgs );
        case CimPackage.ASSET__REPLACEMENT_WORK_TASKS:
            return ( ( InternalEList< ? > ) getReplacementWorkTasks() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET__ANALYTIC:
            return ( ( InternalEList< ? > ) getAnalytic() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET__PRODUCT_ASSET_MODEL:
            return basicUnsetProductAssetModel( msgs );
        case CimPackage.ASSET__PROCEDURES:
            return ( ( InternalEList< ? > ) getProcedures() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET__SCHEDULED_EVENTS:
            return ( ( InternalEList< ? > ) getScheduledEvents() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET__OWNERSHIPS:
            return ( ( InternalEList< ? > ) getOwnerships() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET__CONFIGURATION_EVENTS:
            return ( ( InternalEList< ? > ) getConfigurationEvents() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET__WORK_TASKS:
            return ( ( InternalEList< ? > ) getWorkTasks() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET__OPERATIONAL_TAGS:
            return ( ( InternalEList< ? > ) getOperationalTags() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET__BREAKER_OPERATION:
            return basicUnsetBreakerOperation( msgs );
        case CimPackage.ASSET__ORGANISATION_ROLES:
            return ( ( InternalEList< ? > ) getOrganisationRoles() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET__LOCATION:
            return basicUnsetLocation( msgs );
        case CimPackage.ASSET__MEASUREMENTS:
            return ( ( InternalEList< ? > ) getMeasurements() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET__ACTIVITY_RECORDS:
            return ( ( InternalEList< ? > ) getActivityRecords() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET__FINANCIAL_INFO:
            return basicUnsetFinancialInfo( msgs );
        case CimPackage.ASSET__PROCEDURE_DATA_SET:
            return ( ( InternalEList< ? > ) getProcedureDataSet() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET__MEDIUM:
            return ( ( InternalEList< ? > ) getMedium() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET__ASSET_CONTAINER:
            return basicUnsetAssetContainer( msgs );
        case CimPackage.ASSET__ASSET_DEPLOYMENT:
            return basicUnsetAssetDeployment( msgs );
        case CimPackage.ASSET__ANALYTIC_SCORE:
            return ( ( InternalEList< ? > ) getAnalyticScore() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET__POWER_SYSTEM_RESOURCES:
            return ( ( InternalEList< ? > ) getPowerSystemResources() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET__ASSET_INFO:
            return basicUnsetAssetInfo( msgs );
        case CimPackage.ASSET__ASSET_GROUP:
            return ( ( InternalEList< ? > ) getAssetGroup() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.ASSET__BASELINE_CONDITION:
            return getBaselineCondition();
        case CimPackage.ASSET__BASELINE_LOSS_OF_LIFE:
            return getBaselineLossOfLife();
        case CimPackage.ASSET__CRITICAL:
            return getCritical();
        case CimPackage.ASSET__IN_USE_STATE:
            return getInUseState();
        case CimPackage.ASSET__KIND:
            return getKind();
        case CimPackage.ASSET__LIFECYCLE_STATE:
            return getLifecycleState();
        case CimPackage.ASSET__LOT_NUMBER:
            return getLotNumber();
        case CimPackage.ASSET__POSITION:
            return getPosition();
        case CimPackage.ASSET__PURCHASE_PRICE:
            return getPurchasePrice();
        case CimPackage.ASSET__RETIRED_REASON:
            return getRetiredReason();
        case CimPackage.ASSET__SERIAL_NUMBER:
            return getSerialNumber();
        case CimPackage.ASSET__TYPE:
            return getType();
        case CimPackage.ASSET__UTC_NUMBER:
            return getUtcNumber();
        case CimPackage.ASSET__ACCEPTANCE_TEST:
            return getAcceptanceTest();
        case CimPackage.ASSET__ELECTRONIC_ADDRESS:
            return getElectronicAddress();
        case CimPackage.ASSET__IN_USE_DATE:
            return getInUseDate();
        case CimPackage.ASSET__LIFECYCLE_DATE:
            return getLifecycleDate();
        case CimPackage.ASSET__STATUS:
            return getStatus();
        case CimPackage.ASSET__REPLACEMENT_WORK_TASKS:
            return getReplacementWorkTasks();
        case CimPackage.ASSET__ANALYTIC:
            return getAnalytic();
        case CimPackage.ASSET__PRODUCT_ASSET_MODEL:
            return getProductAssetModel();
        case CimPackage.ASSET__PROCEDURES:
            return getProcedures();
        case CimPackage.ASSET__SCHEDULED_EVENTS:
            return getScheduledEvents();
        case CimPackage.ASSET__OWNERSHIPS:
            return getOwnerships();
        case CimPackage.ASSET__CONFIGURATION_EVENTS:
            return getConfigurationEvents();
        case CimPackage.ASSET__WORK_TASKS:
            return getWorkTasks();
        case CimPackage.ASSET__OPERATIONAL_TAGS:
            return getOperationalTags();
        case CimPackage.ASSET__BREAKER_OPERATION:
            return getBreakerOperation();
        case CimPackage.ASSET__ORGANISATION_ROLES:
            return getOrganisationRoles();
        case CimPackage.ASSET__LOCATION:
            return getLocation();
        case CimPackage.ASSET__MEASUREMENTS:
            return getMeasurements();
        case CimPackage.ASSET__ACTIVITY_RECORDS:
            return getActivityRecords();
        case CimPackage.ASSET__FINANCIAL_INFO:
            return getFinancialInfo();
        case CimPackage.ASSET__PROCEDURE_DATA_SET:
            return getProcedureDataSet();
        case CimPackage.ASSET__MEDIUM:
            return getMedium();
        case CimPackage.ASSET__ASSET_CONTAINER:
            return getAssetContainer();
        case CimPackage.ASSET__ASSET_DEPLOYMENT:
            if( resolve ) return getAssetDeployment();
            return basicGetAssetDeployment();
        case CimPackage.ASSET__ANALYTIC_SCORE:
            return getAnalyticScore();
        case CimPackage.ASSET__POWER_SYSTEM_RESOURCES:
            return getPowerSystemResources();
        case CimPackage.ASSET__ASSET_INFO:
            return getAssetInfo();
        case CimPackage.ASSET__ASSET_GROUP:
            return getAssetGroup();
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
        case CimPackage.ASSET__BASELINE_CONDITION:
            setBaselineCondition( ( String ) newValue );
            return;
        case CimPackage.ASSET__BASELINE_LOSS_OF_LIFE:
            setBaselineLossOfLife( ( Float ) newValue );
            return;
        case CimPackage.ASSET__CRITICAL:
            setCritical( ( Boolean ) newValue );
            return;
        case CimPackage.ASSET__IN_USE_STATE:
            setInUseState( ( InUseStateKind ) newValue );
            return;
        case CimPackage.ASSET__KIND:
            setKind( ( AssetKind ) newValue );
            return;
        case CimPackage.ASSET__LIFECYCLE_STATE:
            setLifecycleState( ( AssetLifecycleStateKind ) newValue );
            return;
        case CimPackage.ASSET__LOT_NUMBER:
            setLotNumber( ( String ) newValue );
            return;
        case CimPackage.ASSET__POSITION:
            setPosition( ( String ) newValue );
            return;
        case CimPackage.ASSET__PURCHASE_PRICE:
            setPurchasePrice( ( BigDecimal ) newValue );
            return;
        case CimPackage.ASSET__RETIRED_REASON:
            setRetiredReason( ( RetiredReasonKind ) newValue );
            return;
        case CimPackage.ASSET__SERIAL_NUMBER:
            setSerialNumber( ( String ) newValue );
            return;
        case CimPackage.ASSET__TYPE:
            setType( ( String ) newValue );
            return;
        case CimPackage.ASSET__UTC_NUMBER:
            setUtcNumber( ( String ) newValue );
            return;
        case CimPackage.ASSET__ACCEPTANCE_TEST:
            setAcceptanceTest( ( AcceptanceTest ) newValue );
            return;
        case CimPackage.ASSET__ELECTRONIC_ADDRESS:
            setElectronicAddress( ( ElectronicAddress ) newValue );
            return;
        case CimPackage.ASSET__IN_USE_DATE:
            setInUseDate( ( InUseDate ) newValue );
            return;
        case CimPackage.ASSET__LIFECYCLE_DATE:
            setLifecycleDate( ( LifecycleDate ) newValue );
            return;
        case CimPackage.ASSET__STATUS:
            setStatus( ( Status ) newValue );
            return;
        case CimPackage.ASSET__REPLACEMENT_WORK_TASKS:
            getReplacementWorkTasks().clear();
            getReplacementWorkTasks().addAll( ( Collection< ? extends WorkTask > ) newValue );
            return;
        case CimPackage.ASSET__ANALYTIC:
            getAnalytic().clear();
            getAnalytic().addAll( ( Collection< ? extends Analytic > ) newValue );
            return;
        case CimPackage.ASSET__PRODUCT_ASSET_MODEL:
            setProductAssetModel( ( ProductAssetModel ) newValue );
            return;
        case CimPackage.ASSET__PROCEDURES:
            getProcedures().clear();
            getProcedures().addAll( ( Collection< ? extends Procedure > ) newValue );
            return;
        case CimPackage.ASSET__SCHEDULED_EVENTS:
            getScheduledEvents().clear();
            getScheduledEvents().addAll( ( Collection< ? extends ScheduledEvent > ) newValue );
            return;
        case CimPackage.ASSET__OWNERSHIPS:
            getOwnerships().clear();
            getOwnerships().addAll( ( Collection< ? extends Ownership > ) newValue );
            return;
        case CimPackage.ASSET__CONFIGURATION_EVENTS:
            getConfigurationEvents().clear();
            getConfigurationEvents().addAll( ( Collection< ? extends ConfigurationEvent > ) newValue );
            return;
        case CimPackage.ASSET__WORK_TASKS:
            getWorkTasks().clear();
            getWorkTasks().addAll( ( Collection< ? extends WorkTask > ) newValue );
            return;
        case CimPackage.ASSET__OPERATIONAL_TAGS:
            getOperationalTags().clear();
            getOperationalTags().addAll( ( Collection< ? extends OperationalTag > ) newValue );
            return;
        case CimPackage.ASSET__BREAKER_OPERATION:
            setBreakerOperation( ( SwitchOperationSummary ) newValue );
            return;
        case CimPackage.ASSET__ORGANISATION_ROLES:
            getOrganisationRoles().clear();
            getOrganisationRoles().addAll( ( Collection< ? extends AssetOrganisationRole > ) newValue );
            return;
        case CimPackage.ASSET__LOCATION:
            setLocation( ( Location ) newValue );
            return;
        case CimPackage.ASSET__MEASUREMENTS:
            getMeasurements().clear();
            getMeasurements().addAll( ( Collection< ? extends Measurement > ) newValue );
            return;
        case CimPackage.ASSET__ACTIVITY_RECORDS:
            getActivityRecords().clear();
            getActivityRecords().addAll( ( Collection< ? extends ActivityRecord > ) newValue );
            return;
        case CimPackage.ASSET__FINANCIAL_INFO:
            setFinancialInfo( ( FinancialInfo ) newValue );
            return;
        case CimPackage.ASSET__PROCEDURE_DATA_SET:
            getProcedureDataSet().clear();
            getProcedureDataSet().addAll( ( Collection< ? extends ProcedureDataSet > ) newValue );
            return;
        case CimPackage.ASSET__MEDIUM:
            getMedium().clear();
            getMedium().addAll( ( Collection< ? extends Medium > ) newValue );
            return;
        case CimPackage.ASSET__ASSET_CONTAINER:
            setAssetContainer( ( AssetContainer ) newValue );
            return;
        case CimPackage.ASSET__ASSET_DEPLOYMENT:
            setAssetDeployment( ( AssetDeployment ) newValue );
            return;
        case CimPackage.ASSET__ANALYTIC_SCORE:
            getAnalyticScore().clear();
            getAnalyticScore().addAll( ( Collection< ? extends AnalyticScore > ) newValue );
            return;
        case CimPackage.ASSET__POWER_SYSTEM_RESOURCES:
            getPowerSystemResources().clear();
            getPowerSystemResources().addAll( ( Collection< ? extends PowerSystemResource > ) newValue );
            return;
        case CimPackage.ASSET__ASSET_INFO:
            setAssetInfo( ( AssetInfo ) newValue );
            return;
        case CimPackage.ASSET__ASSET_GROUP:
            getAssetGroup().clear();
            getAssetGroup().addAll( ( Collection< ? extends AssetGroup > ) newValue );
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
        case CimPackage.ASSET__BASELINE_CONDITION:
            unsetBaselineCondition();
            return;
        case CimPackage.ASSET__BASELINE_LOSS_OF_LIFE:
            unsetBaselineLossOfLife();
            return;
        case CimPackage.ASSET__CRITICAL:
            unsetCritical();
            return;
        case CimPackage.ASSET__IN_USE_STATE:
            unsetInUseState();
            return;
        case CimPackage.ASSET__KIND:
            unsetKind();
            return;
        case CimPackage.ASSET__LIFECYCLE_STATE:
            unsetLifecycleState();
            return;
        case CimPackage.ASSET__LOT_NUMBER:
            unsetLotNumber();
            return;
        case CimPackage.ASSET__POSITION:
            unsetPosition();
            return;
        case CimPackage.ASSET__PURCHASE_PRICE:
            unsetPurchasePrice();
            return;
        case CimPackage.ASSET__RETIRED_REASON:
            unsetRetiredReason();
            return;
        case CimPackage.ASSET__SERIAL_NUMBER:
            unsetSerialNumber();
            return;
        case CimPackage.ASSET__TYPE:
            unsetType();
            return;
        case CimPackage.ASSET__UTC_NUMBER:
            unsetUtcNumber();
            return;
        case CimPackage.ASSET__ACCEPTANCE_TEST:
            unsetAcceptanceTest();
            return;
        case CimPackage.ASSET__ELECTRONIC_ADDRESS:
            unsetElectronicAddress();
            return;
        case CimPackage.ASSET__IN_USE_DATE:
            unsetInUseDate();
            return;
        case CimPackage.ASSET__LIFECYCLE_DATE:
            unsetLifecycleDate();
            return;
        case CimPackage.ASSET__STATUS:
            unsetStatus();
            return;
        case CimPackage.ASSET__REPLACEMENT_WORK_TASKS:
            unsetReplacementWorkTasks();
            return;
        case CimPackage.ASSET__ANALYTIC:
            unsetAnalytic();
            return;
        case CimPackage.ASSET__PRODUCT_ASSET_MODEL:
            unsetProductAssetModel();
            return;
        case CimPackage.ASSET__PROCEDURES:
            unsetProcedures();
            return;
        case CimPackage.ASSET__SCHEDULED_EVENTS:
            unsetScheduledEvents();
            return;
        case CimPackage.ASSET__OWNERSHIPS:
            unsetOwnerships();
            return;
        case CimPackage.ASSET__CONFIGURATION_EVENTS:
            unsetConfigurationEvents();
            return;
        case CimPackage.ASSET__WORK_TASKS:
            unsetWorkTasks();
            return;
        case CimPackage.ASSET__OPERATIONAL_TAGS:
            unsetOperationalTags();
            return;
        case CimPackage.ASSET__BREAKER_OPERATION:
            unsetBreakerOperation();
            return;
        case CimPackage.ASSET__ORGANISATION_ROLES:
            unsetOrganisationRoles();
            return;
        case CimPackage.ASSET__LOCATION:
            unsetLocation();
            return;
        case CimPackage.ASSET__MEASUREMENTS:
            unsetMeasurements();
            return;
        case CimPackage.ASSET__ACTIVITY_RECORDS:
            unsetActivityRecords();
            return;
        case CimPackage.ASSET__FINANCIAL_INFO:
            unsetFinancialInfo();
            return;
        case CimPackage.ASSET__PROCEDURE_DATA_SET:
            unsetProcedureDataSet();
            return;
        case CimPackage.ASSET__MEDIUM:
            unsetMedium();
            return;
        case CimPackage.ASSET__ASSET_CONTAINER:
            unsetAssetContainer();
            return;
        case CimPackage.ASSET__ASSET_DEPLOYMENT:
            unsetAssetDeployment();
            return;
        case CimPackage.ASSET__ANALYTIC_SCORE:
            unsetAnalyticScore();
            return;
        case CimPackage.ASSET__POWER_SYSTEM_RESOURCES:
            unsetPowerSystemResources();
            return;
        case CimPackage.ASSET__ASSET_INFO:
            unsetAssetInfo();
            return;
        case CimPackage.ASSET__ASSET_GROUP:
            unsetAssetGroup();
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
        case CimPackage.ASSET__BASELINE_CONDITION:
            return isSetBaselineCondition();
        case CimPackage.ASSET__BASELINE_LOSS_OF_LIFE:
            return isSetBaselineLossOfLife();
        case CimPackage.ASSET__CRITICAL:
            return isSetCritical();
        case CimPackage.ASSET__IN_USE_STATE:
            return isSetInUseState();
        case CimPackage.ASSET__KIND:
            return isSetKind();
        case CimPackage.ASSET__LIFECYCLE_STATE:
            return isSetLifecycleState();
        case CimPackage.ASSET__LOT_NUMBER:
            return isSetLotNumber();
        case CimPackage.ASSET__POSITION:
            return isSetPosition();
        case CimPackage.ASSET__PURCHASE_PRICE:
            return isSetPurchasePrice();
        case CimPackage.ASSET__RETIRED_REASON:
            return isSetRetiredReason();
        case CimPackage.ASSET__SERIAL_NUMBER:
            return isSetSerialNumber();
        case CimPackage.ASSET__TYPE:
            return isSetType();
        case CimPackage.ASSET__UTC_NUMBER:
            return isSetUtcNumber();
        case CimPackage.ASSET__ACCEPTANCE_TEST:
            return isSetAcceptanceTest();
        case CimPackage.ASSET__ELECTRONIC_ADDRESS:
            return isSetElectronicAddress();
        case CimPackage.ASSET__IN_USE_DATE:
            return isSetInUseDate();
        case CimPackage.ASSET__LIFECYCLE_DATE:
            return isSetLifecycleDate();
        case CimPackage.ASSET__STATUS:
            return isSetStatus();
        case CimPackage.ASSET__REPLACEMENT_WORK_TASKS:
            return isSetReplacementWorkTasks();
        case CimPackage.ASSET__ANALYTIC:
            return isSetAnalytic();
        case CimPackage.ASSET__PRODUCT_ASSET_MODEL:
            return isSetProductAssetModel();
        case CimPackage.ASSET__PROCEDURES:
            return isSetProcedures();
        case CimPackage.ASSET__SCHEDULED_EVENTS:
            return isSetScheduledEvents();
        case CimPackage.ASSET__OWNERSHIPS:
            return isSetOwnerships();
        case CimPackage.ASSET__CONFIGURATION_EVENTS:
            return isSetConfigurationEvents();
        case CimPackage.ASSET__WORK_TASKS:
            return isSetWorkTasks();
        case CimPackage.ASSET__OPERATIONAL_TAGS:
            return isSetOperationalTags();
        case CimPackage.ASSET__BREAKER_OPERATION:
            return isSetBreakerOperation();
        case CimPackage.ASSET__ORGANISATION_ROLES:
            return isSetOrganisationRoles();
        case CimPackage.ASSET__LOCATION:
            return isSetLocation();
        case CimPackage.ASSET__MEASUREMENTS:
            return isSetMeasurements();
        case CimPackage.ASSET__ACTIVITY_RECORDS:
            return isSetActivityRecords();
        case CimPackage.ASSET__FINANCIAL_INFO:
            return isSetFinancialInfo();
        case CimPackage.ASSET__PROCEDURE_DATA_SET:
            return isSetProcedureDataSet();
        case CimPackage.ASSET__MEDIUM:
            return isSetMedium();
        case CimPackage.ASSET__ASSET_CONTAINER:
            return isSetAssetContainer();
        case CimPackage.ASSET__ASSET_DEPLOYMENT:
            return isSetAssetDeployment();
        case CimPackage.ASSET__ANALYTIC_SCORE:
            return isSetAnalyticScore();
        case CimPackage.ASSET__POWER_SYSTEM_RESOURCES:
            return isSetPowerSystemResources();
        case CimPackage.ASSET__ASSET_INFO:
            return isSetAssetInfo();
        case CimPackage.ASSET__ASSET_GROUP:
            return isSetAssetGroup();
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
        result.append( " (baselineCondition: " );
        if( baselineConditionESet )
            result.append( baselineCondition );
        else
            result.append( "<unset>" );
        result.append( ", baselineLossOfLife: " );
        if( baselineLossOfLifeESet )
            result.append( baselineLossOfLife );
        else
            result.append( "<unset>" );
        result.append( ", critical: " );
        if( criticalESet )
            result.append( critical );
        else
            result.append( "<unset>" );
        result.append( ", inUseState: " );
        if( inUseStateESet )
            result.append( inUseState );
        else
            result.append( "<unset>" );
        result.append( ", kind: " );
        if( kindESet )
            result.append( kind );
        else
            result.append( "<unset>" );
        result.append( ", lifecycleState: " );
        if( lifecycleStateESet )
            result.append( lifecycleState );
        else
            result.append( "<unset>" );
        result.append( ", lotNumber: " );
        if( lotNumberESet )
            result.append( lotNumber );
        else
            result.append( "<unset>" );
        result.append( ", position: " );
        if( positionESet )
            result.append( position );
        else
            result.append( "<unset>" );
        result.append( ", purchasePrice: " );
        if( purchasePriceESet )
            result.append( purchasePrice );
        else
            result.append( "<unset>" );
        result.append( ", retiredReason: " );
        if( retiredReasonESet )
            result.append( retiredReason );
        else
            result.append( "<unset>" );
        result.append( ", serialNumber: " );
        if( serialNumberESet )
            result.append( serialNumber );
        else
            result.append( "<unset>" );
        result.append( ", type: " );
        if( typeESet )
            result.append( type );
        else
            result.append( "<unset>" );
        result.append( ", utcNumber: " );
        if( utcNumberESet )
            result.append( utcNumber );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AssetImpl
