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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getBaselineCondition <em>Baseline Condition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getBaselineLossOfLife <em>Baseline Loss Of Life</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getCritical <em>Critical</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getInUseState <em>In Use State</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getLifecycleState <em>Lifecycle State</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getPosition <em>Position</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getPurchasePrice <em>Purchase Price</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getRetiredReason <em>Retired Reason</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getUtcNumber <em>Utc Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getAcceptanceTest <em>Acceptance Test</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getElectronicAddress <em>Electronic Address</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getInUseDate <em>In Use Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getLifecycleDate <em>Lifecycle Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getReplacementWorkTasks <em>Replacement Work Tasks</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getAnalytic <em>Analytic</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getProductAssetModel <em>Product Asset Model</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getProcedures <em>Procedures</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getScheduledEvents <em>Scheduled Events</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getOwnerships <em>Ownerships</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getConfigurationEvents <em>Configuration Events</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getWorkTasks <em>Work Tasks</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getOperationalTags <em>Operational Tags</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getBreakerOperation <em>Breaker Operation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getOrganisationRoles <em>Organisation Roles</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getLocation <em>Location</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getActivityRecords <em>Activity Records</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getFinancialInfo <em>Financial Info</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getProcedureDataSet <em>Procedure Data Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getMedium <em>Medium</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getAssetContainer <em>Asset Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getAssetDeployment <em>Asset Deployment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getAnalyticScore <em>Analytic Score</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getPowerSystemResources <em>Power System Resources</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getAssetInfo <em>Asset Info</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getAssetGroup <em>Asset Group</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset()
 * @model
 * @generated
 */
public interface Asset extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Baseline Condition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Baseline Condition</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Baseline Condition</em>' attribute.
     * @see #isSetBaselineCondition()
     * @see #unsetBaselineCondition()
     * @see #setBaselineCondition(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_BaselineCondition()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.baselineCondition' kind='element'"
     * @generated
     */
    String getBaselineCondition();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getBaselineCondition <em>Baseline Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Baseline Condition</em>' attribute.
     * @see #isSetBaselineCondition()
     * @see #unsetBaselineCondition()
     * @see #getBaselineCondition()
     * @generated
     */
    void setBaselineCondition( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getBaselineCondition <em>Baseline Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBaselineCondition()
     * @see #getBaselineCondition()
     * @see #setBaselineCondition(String)
     * @generated
     */
    void unsetBaselineCondition();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getBaselineCondition <em>Baseline Condition</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Baseline Condition</em>' attribute is set.
     * @see #unsetBaselineCondition()
     * @see #getBaselineCondition()
     * @see #setBaselineCondition(String)
     * @generated
     */
    boolean isSetBaselineCondition();

    /**
     * Returns the value of the '<em><b>Baseline Loss Of Life</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Baseline Loss Of Life</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Baseline Loss Of Life</em>' attribute.
     * @see #isSetBaselineLossOfLife()
     * @see #unsetBaselineLossOfLife()
     * @see #setBaselineLossOfLife(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_BaselineLossOfLife()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.baselineLossOfLife' kind='element'"
     * @generated
     */
    Float getBaselineLossOfLife();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getBaselineLossOfLife <em>Baseline Loss Of Life</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Baseline Loss Of Life</em>' attribute.
     * @see #isSetBaselineLossOfLife()
     * @see #unsetBaselineLossOfLife()
     * @see #getBaselineLossOfLife()
     * @generated
     */
    void setBaselineLossOfLife( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getBaselineLossOfLife <em>Baseline Loss Of Life</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBaselineLossOfLife()
     * @see #getBaselineLossOfLife()
     * @see #setBaselineLossOfLife(Float)
     * @generated
     */
    void unsetBaselineLossOfLife();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getBaselineLossOfLife <em>Baseline Loss Of Life</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Baseline Loss Of Life</em>' attribute is set.
     * @see #unsetBaselineLossOfLife()
     * @see #getBaselineLossOfLife()
     * @see #setBaselineLossOfLife(Float)
     * @generated
     */
    boolean isSetBaselineLossOfLife();

    /**
     * Returns the value of the '<em><b>Critical</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Critical</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Critical</em>' attribute.
     * @see #isSetCritical()
     * @see #unsetCritical()
     * @see #setCritical(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_Critical()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.critical' kind='element'"
     * @generated
     */
    Boolean getCritical();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getCritical <em>Critical</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Critical</em>' attribute.
     * @see #isSetCritical()
     * @see #unsetCritical()
     * @see #getCritical()
     * @generated
     */
    void setCritical( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getCritical <em>Critical</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCritical()
     * @see #getCritical()
     * @see #setCritical(Boolean)
     * @generated
     */
    void unsetCritical();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getCritical <em>Critical</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Critical</em>' attribute is set.
     * @see #unsetCritical()
     * @see #getCritical()
     * @see #setCritical(Boolean)
     * @generated
     */
    boolean isSetCritical();

    /**
     * Returns the value of the '<em><b>In Use State</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InUseStateKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>In Use State</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>In Use State</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InUseStateKind
     * @see #isSetInUseState()
     * @see #unsetInUseState()
     * @see #setInUseState(InUseStateKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_InUseState()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.inUseState' kind='element'"
     * @generated
     */
    InUseStateKind getInUseState();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getInUseState <em>In Use State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>In Use State</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InUseStateKind
     * @see #isSetInUseState()
     * @see #unsetInUseState()
     * @see #getInUseState()
     * @generated
     */
    void setInUseState( InUseStateKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getInUseState <em>In Use State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInUseState()
     * @see #getInUseState()
     * @see #setInUseState(InUseStateKind)
     * @generated
     */
    void unsetInUseState();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getInUseState <em>In Use State</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>In Use State</em>' attribute is set.
     * @see #unsetInUseState()
     * @see #getInUseState()
     * @see #setInUseState(InUseStateKind)
     * @generated
     */
    boolean isSetInUseState();

    /**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetKind
     * @see #isSetKind()
     * @see #unsetKind()
     * @see #setKind(AssetKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_Kind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.kind' kind='element'"
     * @generated
     */
    AssetKind getKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetKind
     * @see #isSetKind()
     * @see #unsetKind()
     * @see #getKind()
     * @generated
     */
    void setKind( AssetKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKind()
     * @see #getKind()
     * @see #setKind(AssetKind)
     * @generated
     */
    void unsetKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getKind <em>Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kind</em>' attribute is set.
     * @see #unsetKind()
     * @see #getKind()
     * @see #setKind(AssetKind)
     * @generated
     */
    boolean isSetKind();

    /**
     * Returns the value of the '<em><b>Lifecycle State</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetLifecycleStateKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lifecycle State</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lifecycle State</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetLifecycleStateKind
     * @see #isSetLifecycleState()
     * @see #unsetLifecycleState()
     * @see #setLifecycleState(AssetLifecycleStateKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_LifecycleState()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.lifecycleState' kind='element'"
     * @generated
     */
    AssetLifecycleStateKind getLifecycleState();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getLifecycleState <em>Lifecycle State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lifecycle State</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetLifecycleStateKind
     * @see #isSetLifecycleState()
     * @see #unsetLifecycleState()
     * @see #getLifecycleState()
     * @generated
     */
    void setLifecycleState( AssetLifecycleStateKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getLifecycleState <em>Lifecycle State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLifecycleState()
     * @see #getLifecycleState()
     * @see #setLifecycleState(AssetLifecycleStateKind)
     * @generated
     */
    void unsetLifecycleState();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getLifecycleState <em>Lifecycle State</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lifecycle State</em>' attribute is set.
     * @see #unsetLifecycleState()
     * @see #getLifecycleState()
     * @see #setLifecycleState(AssetLifecycleStateKind)
     * @generated
     */
    boolean isSetLifecycleState();

    /**
     * Returns the value of the '<em><b>Lot Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lot Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lot Number</em>' attribute.
     * @see #isSetLotNumber()
     * @see #unsetLotNumber()
     * @see #setLotNumber(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_LotNumber()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.lotNumber' kind='element'"
     * @generated
     */
    String getLotNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getLotNumber <em>Lot Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lot Number</em>' attribute.
     * @see #isSetLotNumber()
     * @see #unsetLotNumber()
     * @see #getLotNumber()
     * @generated
     */
    void setLotNumber( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getLotNumber <em>Lot Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLotNumber()
     * @see #getLotNumber()
     * @see #setLotNumber(String)
     * @generated
     */
    void unsetLotNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getLotNumber <em>Lot Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lot Number</em>' attribute is set.
     * @see #unsetLotNumber()
     * @see #getLotNumber()
     * @see #setLotNumber(String)
     * @generated
     */
    boolean isSetLotNumber();

    /**
     * Returns the value of the '<em><b>Position</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Position</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Position</em>' attribute.
     * @see #isSetPosition()
     * @see #unsetPosition()
     * @see #setPosition(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_Position()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.position' kind='element'"
     * @generated
     */
    String getPosition();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getPosition <em>Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Position</em>' attribute.
     * @see #isSetPosition()
     * @see #unsetPosition()
     * @see #getPosition()
     * @generated
     */
    void setPosition( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getPosition <em>Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPosition()
     * @see #getPosition()
     * @see #setPosition(String)
     * @generated
     */
    void unsetPosition();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getPosition <em>Position</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Position</em>' attribute is set.
     * @see #unsetPosition()
     * @see #getPosition()
     * @see #setPosition(String)
     * @generated
     */
    boolean isSetPosition();

    /**
     * Returns the value of the '<em><b>Purchase Price</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Purchase Price</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Purchase Price</em>' attribute.
     * @see #isSetPurchasePrice()
     * @see #unsetPurchasePrice()
     * @see #setPurchasePrice(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_PurchasePrice()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.purchasePrice' kind='element'"
     * @generated
     */
    BigDecimal getPurchasePrice();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getPurchasePrice <em>Purchase Price</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Purchase Price</em>' attribute.
     * @see #isSetPurchasePrice()
     * @see #unsetPurchasePrice()
     * @see #getPurchasePrice()
     * @generated
     */
    void setPurchasePrice( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getPurchasePrice <em>Purchase Price</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPurchasePrice()
     * @see #getPurchasePrice()
     * @see #setPurchasePrice(BigDecimal)
     * @generated
     */
    void unsetPurchasePrice();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getPurchasePrice <em>Purchase Price</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Purchase Price</em>' attribute is set.
     * @see #unsetPurchasePrice()
     * @see #getPurchasePrice()
     * @see #setPurchasePrice(BigDecimal)
     * @generated
     */
    boolean isSetPurchasePrice();

    /**
     * Returns the value of the '<em><b>Retired Reason</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RetiredReasonKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Retired Reason</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Retired Reason</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RetiredReasonKind
     * @see #isSetRetiredReason()
     * @see #unsetRetiredReason()
     * @see #setRetiredReason(RetiredReasonKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_RetiredReason()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.retiredReason' kind='element'"
     * @generated
     */
    RetiredReasonKind getRetiredReason();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getRetiredReason <em>Retired Reason</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Retired Reason</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RetiredReasonKind
     * @see #isSetRetiredReason()
     * @see #unsetRetiredReason()
     * @see #getRetiredReason()
     * @generated
     */
    void setRetiredReason( RetiredReasonKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getRetiredReason <em>Retired Reason</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRetiredReason()
     * @see #getRetiredReason()
     * @see #setRetiredReason(RetiredReasonKind)
     * @generated
     */
    void unsetRetiredReason();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getRetiredReason <em>Retired Reason</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Retired Reason</em>' attribute is set.
     * @see #unsetRetiredReason()
     * @see #getRetiredReason()
     * @see #setRetiredReason(RetiredReasonKind)
     * @generated
     */
    boolean isSetRetiredReason();

    /**
     * Returns the value of the '<em><b>Serial Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Serial Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Serial Number</em>' attribute.
     * @see #isSetSerialNumber()
     * @see #unsetSerialNumber()
     * @see #setSerialNumber(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_SerialNumber()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.serialNumber' kind='element'"
     * @generated
     */
    String getSerialNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getSerialNumber <em>Serial Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Serial Number</em>' attribute.
     * @see #isSetSerialNumber()
     * @see #unsetSerialNumber()
     * @see #getSerialNumber()
     * @generated
     */
    void setSerialNumber( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getSerialNumber <em>Serial Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSerialNumber()
     * @see #getSerialNumber()
     * @see #setSerialNumber(String)
     * @generated
     */
    void unsetSerialNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getSerialNumber <em>Serial Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Serial Number</em>' attribute is set.
     * @see #unsetSerialNumber()
     * @see #getSerialNumber()
     * @see #setSerialNumber(String)
     * @generated
     */
    boolean isSetSerialNumber();

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_Type()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.type' kind='element'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    boolean isSetType();

    /**
     * Returns the value of the '<em><b>Utc Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Utc Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Utc Number</em>' attribute.
     * @see #isSetUtcNumber()
     * @see #unsetUtcNumber()
     * @see #setUtcNumber(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_UtcNumber()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.utcNumber' kind='element'"
     * @generated
     */
    String getUtcNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getUtcNumber <em>Utc Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Utc Number</em>' attribute.
     * @see #isSetUtcNumber()
     * @see #unsetUtcNumber()
     * @see #getUtcNumber()
     * @generated
     */
    void setUtcNumber( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getUtcNumber <em>Utc Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUtcNumber()
     * @see #getUtcNumber()
     * @see #setUtcNumber(String)
     * @generated
     */
    void unsetUtcNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getUtcNumber <em>Utc Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Utc Number</em>' attribute is set.
     * @see #unsetUtcNumber()
     * @see #getUtcNumber()
     * @see #setUtcNumber(String)
     * @generated
     */
    boolean isSetUtcNumber();

    /**
     * Returns the value of the '<em><b>Acceptance Test</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Acceptance Test</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Acceptance Test</em>' containment reference.
     * @see #isSetAcceptanceTest()
     * @see #unsetAcceptanceTest()
     * @see #setAcceptanceTest(AcceptanceTest)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_AcceptanceTest()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.acceptanceTest' kind='element'"
     * @generated
     */
    AcceptanceTest getAcceptanceTest();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getAcceptanceTest <em>Acceptance Test</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Acceptance Test</em>' containment reference.
     * @see #isSetAcceptanceTest()
     * @see #unsetAcceptanceTest()
     * @see #getAcceptanceTest()
     * @generated
     */
    void setAcceptanceTest( AcceptanceTest value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getAcceptanceTest <em>Acceptance Test</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAcceptanceTest()
     * @see #getAcceptanceTest()
     * @see #setAcceptanceTest(AcceptanceTest)
     * @generated
     */
    void unsetAcceptanceTest();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getAcceptanceTest <em>Acceptance Test</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Acceptance Test</em>' containment reference is set.
     * @see #unsetAcceptanceTest()
     * @see #getAcceptanceTest()
     * @see #setAcceptanceTest(AcceptanceTest)
     * @generated
     */
    boolean isSetAcceptanceTest();

    /**
     * Returns the value of the '<em><b>Electronic Address</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Electronic Address</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Electronic Address</em>' containment reference.
     * @see #isSetElectronicAddress()
     * @see #unsetElectronicAddress()
     * @see #setElectronicAddress(ElectronicAddress)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_ElectronicAddress()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.electronicAddress' kind='element'"
     * @generated
     */
    ElectronicAddress getElectronicAddress();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getElectronicAddress <em>Electronic Address</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Electronic Address</em>' containment reference.
     * @see #isSetElectronicAddress()
     * @see #unsetElectronicAddress()
     * @see #getElectronicAddress()
     * @generated
     */
    void setElectronicAddress( ElectronicAddress value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getElectronicAddress <em>Electronic Address</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetElectronicAddress()
     * @see #getElectronicAddress()
     * @see #setElectronicAddress(ElectronicAddress)
     * @generated
     */
    void unsetElectronicAddress();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getElectronicAddress <em>Electronic Address</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Electronic Address</em>' containment reference is set.
     * @see #unsetElectronicAddress()
     * @see #getElectronicAddress()
     * @see #setElectronicAddress(ElectronicAddress)
     * @generated
     */
    boolean isSetElectronicAddress();

    /**
     * Returns the value of the '<em><b>In Use Date</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>In Use Date</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>In Use Date</em>' containment reference.
     * @see #isSetInUseDate()
     * @see #unsetInUseDate()
     * @see #setInUseDate(InUseDate)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_InUseDate()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.inUseDate' kind='element'"
     * @generated
     */
    InUseDate getInUseDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getInUseDate <em>In Use Date</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>In Use Date</em>' containment reference.
     * @see #isSetInUseDate()
     * @see #unsetInUseDate()
     * @see #getInUseDate()
     * @generated
     */
    void setInUseDate( InUseDate value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getInUseDate <em>In Use Date</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInUseDate()
     * @see #getInUseDate()
     * @see #setInUseDate(InUseDate)
     * @generated
     */
    void unsetInUseDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getInUseDate <em>In Use Date</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>In Use Date</em>' containment reference is set.
     * @see #unsetInUseDate()
     * @see #getInUseDate()
     * @see #setInUseDate(InUseDate)
     * @generated
     */
    boolean isSetInUseDate();

    /**
     * Returns the value of the '<em><b>Lifecycle Date</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lifecycle Date</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lifecycle Date</em>' containment reference.
     * @see #isSetLifecycleDate()
     * @see #unsetLifecycleDate()
     * @see #setLifecycleDate(LifecycleDate)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_LifecycleDate()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.lifecycleDate' kind='element'"
     * @generated
     */
    LifecycleDate getLifecycleDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getLifecycleDate <em>Lifecycle Date</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lifecycle Date</em>' containment reference.
     * @see #isSetLifecycleDate()
     * @see #unsetLifecycleDate()
     * @see #getLifecycleDate()
     * @generated
     */
    void setLifecycleDate( LifecycleDate value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getLifecycleDate <em>Lifecycle Date</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLifecycleDate()
     * @see #getLifecycleDate()
     * @see #setLifecycleDate(LifecycleDate)
     * @generated
     */
    void unsetLifecycleDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getLifecycleDate <em>Lifecycle Date</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lifecycle Date</em>' containment reference is set.
     * @see #unsetLifecycleDate()
     * @see #getLifecycleDate()
     * @see #setLifecycleDate(LifecycleDate)
     * @generated
     */
    boolean isSetLifecycleDate();

    /**
     * Returns the value of the '<em><b>Status</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Status</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Status</em>' containment reference.
     * @see #isSetStatus()
     * @see #unsetStatus()
     * @see #setStatus(Status)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_Status()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.status' kind='element'"
     * @generated
     */
    Status getStatus();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getStatus <em>Status</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Status</em>' containment reference.
     * @see #isSetStatus()
     * @see #unsetStatus()
     * @see #getStatus()
     * @generated
     */
    void setStatus( Status value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getStatus <em>Status</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStatus()
     * @see #getStatus()
     * @see #setStatus(Status)
     * @generated
     */
    void unsetStatus();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getStatus <em>Status</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Status</em>' containment reference is set.
     * @see #unsetStatus()
     * @see #getStatus()
     * @see #setStatus(Status)
     * @generated
     */
    boolean isSetStatus();

    /**
     * Returns the value of the '<em><b>Replacement Work Tasks</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getOldAsset <em>Old Asset</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Replacement Work Tasks</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Replacement Work Tasks</em>' reference list.
     * @see #isSetReplacementWorkTasks()
     * @see #unsetReplacementWorkTasks()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_ReplacementWorkTasks()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getOldAsset
     * @model opposite="OldAsset" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.ReplacementWorkTasks' kind='element'"
     * @generated
     */
    EList< WorkTask > getReplacementWorkTasks();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getReplacementWorkTasks <em>Replacement Work Tasks</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReplacementWorkTasks()
     * @see #getReplacementWorkTasks()
     * @generated
     */
    void unsetReplacementWorkTasks();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getReplacementWorkTasks <em>Replacement Work Tasks</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Replacement Work Tasks</em>' reference list is set.
     * @see #unsetReplacementWorkTasks()
     * @see #getReplacementWorkTasks()
     * @generated
     */
    boolean isSetReplacementWorkTasks();

    /**
     * Returns the value of the '<em><b>Analytic</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Analytic}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Analytic#getAsset <em>Asset</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Analytic</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Analytic</em>' reference list.
     * @see #isSetAnalytic()
     * @see #unsetAnalytic()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_Analytic()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Analytic#getAsset
     * @model opposite="Asset" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.Analytic' kind='element'"
     * @generated
     */
    EList< Analytic > getAnalytic();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getAnalytic <em>Analytic</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAnalytic()
     * @see #getAnalytic()
     * @generated
     */
    void unsetAnalytic();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getAnalytic <em>Analytic</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Analytic</em>' reference list is set.
     * @see #unsetAnalytic()
     * @see #getAnalytic()
     * @generated
     */
    boolean isSetAnalytic();

    /**
     * Returns the value of the '<em><b>Product Asset Model</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getAsset <em>Asset</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Product Asset Model</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Product Asset Model</em>' reference.
     * @see #isSetProductAssetModel()
     * @see #unsetProductAssetModel()
     * @see #setProductAssetModel(ProductAssetModel)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_ProductAssetModel()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel#getAsset
     * @model opposite="Asset" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.ProductAssetModel' kind='element'"
     * @generated
     */
    ProductAssetModel getProductAssetModel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getProductAssetModel <em>Product Asset Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Product Asset Model</em>' reference.
     * @see #isSetProductAssetModel()
     * @see #unsetProductAssetModel()
     * @see #getProductAssetModel()
     * @generated
     */
    void setProductAssetModel( ProductAssetModel value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getProductAssetModel <em>Product Asset Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProductAssetModel()
     * @see #getProductAssetModel()
     * @see #setProductAssetModel(ProductAssetModel)
     * @generated
     */
    void unsetProductAssetModel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getProductAssetModel <em>Product Asset Model</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Product Asset Model</em>' reference is set.
     * @see #unsetProductAssetModel()
     * @see #getProductAssetModel()
     * @see #setProductAssetModel(ProductAssetModel)
     * @generated
     */
    boolean isSetProductAssetModel();

    /**
     * Returns the value of the '<em><b>Procedures</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Procedure}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Procedure#getAssets <em>Assets</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Procedures</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Procedures</em>' reference list.
     * @see #isSetProcedures()
     * @see #unsetProcedures()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_Procedures()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Procedure#getAssets
     * @model opposite="Assets" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.Procedures' kind='element'"
     * @generated
     */
    EList< Procedure > getProcedures();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getProcedures <em>Procedures</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProcedures()
     * @see #getProcedures()
     * @generated
     */
    void unsetProcedures();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getProcedures <em>Procedures</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Procedures</em>' reference list is set.
     * @see #unsetProcedures()
     * @see #getProcedures()
     * @generated
     */
    boolean isSetProcedures();

    /**
     * Returns the value of the '<em><b>Scheduled Events</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEvent}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEvent#getAssets <em>Assets</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scheduled Events</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scheduled Events</em>' reference list.
     * @see #isSetScheduledEvents()
     * @see #unsetScheduledEvents()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_ScheduledEvents()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEvent#getAssets
     * @model opposite="Assets" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.ScheduledEvents' kind='element'"
     * @generated
     */
    EList< ScheduledEvent > getScheduledEvents();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getScheduledEvents <em>Scheduled Events</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetScheduledEvents()
     * @see #getScheduledEvents()
     * @generated
     */
    void unsetScheduledEvents();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getScheduledEvents <em>Scheduled Events</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Scheduled Events</em>' reference list is set.
     * @see #unsetScheduledEvents()
     * @see #getScheduledEvents()
     * @generated
     */
    boolean isSetScheduledEvents();

    /**
     * Returns the value of the '<em><b>Ownerships</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Ownership}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Ownership#getAsset <em>Asset</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ownerships</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ownerships</em>' reference list.
     * @see #isSetOwnerships()
     * @see #unsetOwnerships()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_Ownerships()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Ownership#getAsset
     * @model opposite="Asset" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.Ownerships' kind='element'"
     * @generated
     */
    EList< Ownership > getOwnerships();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getOwnerships <em>Ownerships</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOwnerships()
     * @see #getOwnerships()
     * @generated
     */
    void unsetOwnerships();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getOwnerships <em>Ownerships</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ownerships</em>' reference list is set.
     * @see #unsetOwnerships()
     * @see #getOwnerships()
     * @generated
     */
    boolean isSetOwnerships();

    /**
     * Returns the value of the '<em><b>Configuration Events</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedAsset <em>Changed Asset</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Configuration Events</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Configuration Events</em>' reference list.
     * @see #isSetConfigurationEvents()
     * @see #unsetConfigurationEvents()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_ConfigurationEvents()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedAsset
     * @model opposite="ChangedAsset" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.ConfigurationEvents' kind='element'"
     * @generated
     */
    EList< ConfigurationEvent > getConfigurationEvents();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getConfigurationEvents <em>Configuration Events</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConfigurationEvents()
     * @see #getConfigurationEvents()
     * @generated
     */
    void unsetConfigurationEvents();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getConfigurationEvents <em>Configuration Events</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Configuration Events</em>' reference list is set.
     * @see #unsetConfigurationEvents()
     * @see #getConfigurationEvents()
     * @generated
     */
    boolean isSetConfigurationEvents();

    /**
     * Returns the value of the '<em><b>Work Tasks</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getAssets <em>Assets</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Work Tasks</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Work Tasks</em>' reference list.
     * @see #isSetWorkTasks()
     * @see #unsetWorkTasks()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_WorkTasks()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getAssets
     * @model opposite="Assets" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.WorkTasks' kind='element'"
     * @generated
     */
    EList< WorkTask > getWorkTasks();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getWorkTasks <em>Work Tasks</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWorkTasks()
     * @see #getWorkTasks()
     * @generated
     */
    void unsetWorkTasks();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getWorkTasks <em>Work Tasks</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Work Tasks</em>' reference list is set.
     * @see #unsetWorkTasks()
     * @see #getWorkTasks()
     * @generated
     */
    boolean isSetWorkTasks();

    /**
     * Returns the value of the '<em><b>Operational Tags</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalTag}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalTag#getAsset <em>Asset</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operational Tags</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operational Tags</em>' reference list.
     * @see #isSetOperationalTags()
     * @see #unsetOperationalTags()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_OperationalTags()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalTag#getAsset
     * @model opposite="Asset" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.OperationalTags' kind='element'"
     * @generated
     */
    EList< OperationalTag > getOperationalTags();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getOperationalTags <em>Operational Tags</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOperationalTags()
     * @see #getOperationalTags()
     * @generated
     */
    void unsetOperationalTags();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getOperationalTags <em>Operational Tags</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Operational Tags</em>' reference list is set.
     * @see #unsetOperationalTags()
     * @see #getOperationalTags()
     * @generated
     */
    boolean isSetOperationalTags();

    /**
     * Returns the value of the '<em><b>Breaker Operation</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getBreaker <em>Breaker</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Breaker Operation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Breaker Operation</em>' reference.
     * @see #isSetBreakerOperation()
     * @see #unsetBreakerOperation()
     * @see #setBreakerOperation(SwitchOperationSummary)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_BreakerOperation()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary#getBreaker
     * @model opposite="Breaker" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.BreakerOperation' kind='element'"
     * @generated
     */
    SwitchOperationSummary getBreakerOperation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getBreakerOperation <em>Breaker Operation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Breaker Operation</em>' reference.
     * @see #isSetBreakerOperation()
     * @see #unsetBreakerOperation()
     * @see #getBreakerOperation()
     * @generated
     */
    void setBreakerOperation( SwitchOperationSummary value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getBreakerOperation <em>Breaker Operation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBreakerOperation()
     * @see #getBreakerOperation()
     * @see #setBreakerOperation(SwitchOperationSummary)
     * @generated
     */
    void unsetBreakerOperation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getBreakerOperation <em>Breaker Operation</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Breaker Operation</em>' reference is set.
     * @see #unsetBreakerOperation()
     * @see #getBreakerOperation()
     * @see #setBreakerOperation(SwitchOperationSummary)
     * @generated
     */
    boolean isSetBreakerOperation();

    /**
     * Returns the value of the '<em><b>Organisation Roles</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetOrganisationRole}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetOrganisationRole#getAssets <em>Assets</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Organisation Roles</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Organisation Roles</em>' reference list.
     * @see #isSetOrganisationRoles()
     * @see #unsetOrganisationRoles()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_OrganisationRoles()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetOrganisationRole#getAssets
     * @model opposite="Assets" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.OrganisationRoles' kind='element'"
     * @generated
     */
    EList< AssetOrganisationRole > getOrganisationRoles();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getOrganisationRoles <em>Organisation Roles</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOrganisationRoles()
     * @see #getOrganisationRoles()
     * @generated
     */
    void unsetOrganisationRoles();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getOrganisationRoles <em>Organisation Roles</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Organisation Roles</em>' reference list is set.
     * @see #unsetOrganisationRoles()
     * @see #getOrganisationRoles()
     * @generated
     */
    boolean isSetOrganisationRoles();

    /**
     * Returns the value of the '<em><b>Location</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Location#getAssets <em>Assets</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Location</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Location</em>' reference.
     * @see #isSetLocation()
     * @see #unsetLocation()
     * @see #setLocation(Location)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_Location()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Location#getAssets
     * @model opposite="Assets" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.Location' kind='element'"
     * @generated
     */
    Location getLocation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getLocation <em>Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Location</em>' reference.
     * @see #isSetLocation()
     * @see #unsetLocation()
     * @see #getLocation()
     * @generated
     */
    void setLocation( Location value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getLocation <em>Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLocation()
     * @see #getLocation()
     * @see #setLocation(Location)
     * @generated
     */
    void unsetLocation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getLocation <em>Location</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Location</em>' reference is set.
     * @see #unsetLocation()
     * @see #getLocation()
     * @see #setLocation(Location)
     * @generated
     */
    boolean isSetLocation();

    /**
     * Returns the value of the '<em><b>Measurements</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Measurement}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Measurement#getAsset <em>Asset</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measurements</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Measurements</em>' reference list.
     * @see #isSetMeasurements()
     * @see #unsetMeasurements()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_Measurements()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Measurement#getAsset
     * @model opposite="Asset" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.Measurements' kind='element'"
     * @generated
     */
    EList< Measurement > getMeasurements();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getMeasurements <em>Measurements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeasurements()
     * @see #getMeasurements()
     * @generated
     */
    void unsetMeasurements();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getMeasurements <em>Measurements</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Measurements</em>' reference list is set.
     * @see #unsetMeasurements()
     * @see #getMeasurements()
     * @generated
     */
    boolean isSetMeasurements();

    /**
     * Returns the value of the '<em><b>Activity Records</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ActivityRecord}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ActivityRecord#getAssets <em>Assets</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Activity Records</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Activity Records</em>' reference list.
     * @see #isSetActivityRecords()
     * @see #unsetActivityRecords()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_ActivityRecords()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ActivityRecord#getAssets
     * @model opposite="Assets" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.ActivityRecords' kind='element'"
     * @generated
     */
    EList< ActivityRecord > getActivityRecords();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getActivityRecords <em>Activity Records</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetActivityRecords()
     * @see #getActivityRecords()
     * @generated
     */
    void unsetActivityRecords();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getActivityRecords <em>Activity Records</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Activity Records</em>' reference list is set.
     * @see #unsetActivityRecords()
     * @see #getActivityRecords()
     * @generated
     */
    boolean isSetActivityRecords();

    /**
     * Returns the value of the '<em><b>Financial Info</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getAsset <em>Asset</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Financial Info</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Financial Info</em>' reference.
     * @see #isSetFinancialInfo()
     * @see #unsetFinancialInfo()
     * @see #setFinancialInfo(FinancialInfo)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_FinancialInfo()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getAsset
     * @model opposite="Asset" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.FinancialInfo' kind='element'"
     * @generated
     */
    FinancialInfo getFinancialInfo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getFinancialInfo <em>Financial Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Financial Info</em>' reference.
     * @see #isSetFinancialInfo()
     * @see #unsetFinancialInfo()
     * @see #getFinancialInfo()
     * @generated
     */
    void setFinancialInfo( FinancialInfo value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getFinancialInfo <em>Financial Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFinancialInfo()
     * @see #getFinancialInfo()
     * @see #setFinancialInfo(FinancialInfo)
     * @generated
     */
    void unsetFinancialInfo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getFinancialInfo <em>Financial Info</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Financial Info</em>' reference is set.
     * @see #unsetFinancialInfo()
     * @see #getFinancialInfo()
     * @see #setFinancialInfo(FinancialInfo)
     * @generated
     */
    boolean isSetFinancialInfo();

    /**
     * Returns the value of the '<em><b>Procedure Data Set</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet#getAsset <em>Asset</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Procedure Data Set</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Procedure Data Set</em>' reference list.
     * @see #isSetProcedureDataSet()
     * @see #unsetProcedureDataSet()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_ProcedureDataSet()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet#getAsset
     * @model opposite="Asset" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.ProcedureDataSet' kind='element'"
     * @generated
     */
    EList< ProcedureDataSet > getProcedureDataSet();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getProcedureDataSet <em>Procedure Data Set</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProcedureDataSet()
     * @see #getProcedureDataSet()
     * @generated
     */
    void unsetProcedureDataSet();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getProcedureDataSet <em>Procedure Data Set</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Procedure Data Set</em>' reference list is set.
     * @see #unsetProcedureDataSet()
     * @see #getProcedureDataSet()
     * @generated
     */
    boolean isSetProcedureDataSet();

    /**
     * Returns the value of the '<em><b>Medium</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Medium}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Medium#getAsset <em>Asset</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Medium</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Medium</em>' reference list.
     * @see #isSetMedium()
     * @see #unsetMedium()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_Medium()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Medium#getAsset
     * @model opposite="Asset" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.Medium' kind='element'"
     * @generated
     */
    EList< Medium > getMedium();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getMedium <em>Medium</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMedium()
     * @see #getMedium()
     * @generated
     */
    void unsetMedium();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getMedium <em>Medium</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Medium</em>' reference list is set.
     * @see #unsetMedium()
     * @see #getMedium()
     * @generated
     */
    boolean isSetMedium();

    /**
     * Returns the value of the '<em><b>Asset Container</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetContainer#getAssets <em>Assets</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Asset Container</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Asset Container</em>' reference.
     * @see #isSetAssetContainer()
     * @see #unsetAssetContainer()
     * @see #setAssetContainer(AssetContainer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_AssetContainer()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetContainer#getAssets
     * @model opposite="Assets" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.AssetContainer' kind='element'"
     * @generated
     */
    AssetContainer getAssetContainer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getAssetContainer <em>Asset Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Asset Container</em>' reference.
     * @see #isSetAssetContainer()
     * @see #unsetAssetContainer()
     * @see #getAssetContainer()
     * @generated
     */
    void setAssetContainer( AssetContainer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getAssetContainer <em>Asset Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAssetContainer()
     * @see #getAssetContainer()
     * @see #setAssetContainer(AssetContainer)
     * @generated
     */
    void unsetAssetContainer();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getAssetContainer <em>Asset Container</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asset Container</em>' reference is set.
     * @see #unsetAssetContainer()
     * @see #getAssetContainer()
     * @see #setAssetContainer(AssetContainer)
     * @generated
     */
    boolean isSetAssetContainer();

    /**
     * Returns the value of the '<em><b>Asset Deployment</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetDeployment#getAsset <em>Asset</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Asset Deployment</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Asset Deployment</em>' reference.
     * @see #isSetAssetDeployment()
     * @see #unsetAssetDeployment()
     * @see #setAssetDeployment(AssetDeployment)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_AssetDeployment()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetDeployment#getAsset
     * @model opposite="Asset" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.AssetDeployment' kind='element'"
     * @generated
     */
    AssetDeployment getAssetDeployment();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getAssetDeployment <em>Asset Deployment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Asset Deployment</em>' reference.
     * @see #isSetAssetDeployment()
     * @see #unsetAssetDeployment()
     * @see #getAssetDeployment()
     * @generated
     */
    void setAssetDeployment( AssetDeployment value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getAssetDeployment <em>Asset Deployment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAssetDeployment()
     * @see #getAssetDeployment()
     * @see #setAssetDeployment(AssetDeployment)
     * @generated
     */
    void unsetAssetDeployment();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getAssetDeployment <em>Asset Deployment</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asset Deployment</em>' reference is set.
     * @see #unsetAssetDeployment()
     * @see #getAssetDeployment()
     * @see #setAssetDeployment(AssetDeployment)
     * @generated
     */
    boolean isSetAssetDeployment();

    /**
     * Returns the value of the '<em><b>Analytic Score</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getAsset <em>Asset</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Analytic Score</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Analytic Score</em>' reference list.
     * @see #isSetAnalyticScore()
     * @see #unsetAnalyticScore()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_AnalyticScore()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getAsset
     * @model opposite="Asset" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.AnalyticScore' kind='element'"
     * @generated
     */
    EList< AnalyticScore > getAnalyticScore();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getAnalyticScore <em>Analytic Score</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAnalyticScore()
     * @see #getAnalyticScore()
     * @generated
     */
    void unsetAnalyticScore();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getAnalyticScore <em>Analytic Score</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Analytic Score</em>' reference list is set.
     * @see #unsetAnalyticScore()
     * @see #getAnalyticScore()
     * @generated
     */
    boolean isSetAnalyticScore();

    /**
     * Returns the value of the '<em><b>Power System Resources</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getAssets <em>Assets</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Power System Resources</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Power System Resources</em>' reference list.
     * @see #isSetPowerSystemResources()
     * @see #unsetPowerSystemResources()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_PowerSystemResources()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getAssets
     * @model opposite="Assets" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.PowerSystemResources' kind='element'"
     * @generated
     */
    EList< PowerSystemResource > getPowerSystemResources();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getPowerSystemResources <em>Power System Resources</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPowerSystemResources()
     * @see #getPowerSystemResources()
     * @generated
     */
    void unsetPowerSystemResources();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getPowerSystemResources <em>Power System Resources</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Power System Resources</em>' reference list is set.
     * @see #unsetPowerSystemResources()
     * @see #getPowerSystemResources()
     * @generated
     */
    boolean isSetPowerSystemResources();

    /**
     * Returns the value of the '<em><b>Asset Info</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetInfo#getAssets <em>Assets</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Asset Info</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Asset Info</em>' reference.
     * @see #isSetAssetInfo()
     * @see #unsetAssetInfo()
     * @see #setAssetInfo(AssetInfo)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_AssetInfo()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetInfo#getAssets
     * @model opposite="Assets" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.AssetInfo' kind='element'"
     * @generated
     */
    AssetInfo getAssetInfo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getAssetInfo <em>Asset Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Asset Info</em>' reference.
     * @see #isSetAssetInfo()
     * @see #unsetAssetInfo()
     * @see #getAssetInfo()
     * @generated
     */
    void setAssetInfo( AssetInfo value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getAssetInfo <em>Asset Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAssetInfo()
     * @see #getAssetInfo()
     * @see #setAssetInfo(AssetInfo)
     * @generated
     */
    void unsetAssetInfo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getAssetInfo <em>Asset Info</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asset Info</em>' reference is set.
     * @see #unsetAssetInfo()
     * @see #getAssetInfo()
     * @see #setAssetInfo(AssetInfo)
     * @generated
     */
    boolean isSetAssetInfo();

    /**
     * Returns the value of the '<em><b>Asset Group</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetGroup}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetGroup#getAsset <em>Asset</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Asset Group</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Asset Group</em>' reference list.
     * @see #isSetAssetGroup()
     * @see #unsetAssetGroup()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsset_AssetGroup()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetGroup#getAsset
     * @model opposite="Asset" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Asset.AssetGroup' kind='element'"
     * @generated
     */
    EList< AssetGroup > getAssetGroup();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getAssetGroup <em>Asset Group</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAssetGroup()
     * @see #getAssetGroup()
     * @generated
     */
    void unsetAssetGroup();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getAssetGroup <em>Asset Group</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asset Group</em>' reference list is set.
     * @see #unsetAssetGroup()
     * @see #getAssetGroup()
     * @generated
     */
    boolean isSetAssetGroup();

} // Asset
