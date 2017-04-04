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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pricing Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getCode <em>Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getDailyCeilingUsage <em>Daily Ceiling Usage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getDailyEstimatedUsage <em>Daily Estimated Usage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getDailyFloorUsage <em>Daily Floor Usage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getRevenueKind <em>Revenue Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getTaxExemption <em>Tax Exemption</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getUsagePoints <em>Usage Points</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getServiceCategory <em>Service Category</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getTariffs <em>Tariffs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getTransactions <em>Transactions</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPricingStructure()
 * @model
 * @generated
 */
public interface PricingStructure extends Document {
    /**
     * Returns the value of the '<em><b>Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Code</em>' attribute.
     * @see #isSetCode()
     * @see #unsetCode()
     * @see #setCode(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPricingStructure_Code()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PricingStructure.code' kind='element'"
     * @generated
     */
    String getCode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getCode <em>Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Code</em>' attribute.
     * @see #isSetCode()
     * @see #unsetCode()
     * @see #getCode()
     * @generated
     */
    void setCode( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getCode <em>Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCode()
     * @see #getCode()
     * @see #setCode(String)
     * @generated
     */
    void unsetCode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getCode <em>Code</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Code</em>' attribute is set.
     * @see #unsetCode()
     * @see #getCode()
     * @see #setCode(String)
     * @generated
     */
    boolean isSetCode();

    /**
     * Returns the value of the '<em><b>Daily Ceiling Usage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Daily Ceiling Usage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Daily Ceiling Usage</em>' attribute.
     * @see #isSetDailyCeilingUsage()
     * @see #unsetDailyCeilingUsage()
     * @see #setDailyCeilingUsage(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPricingStructure_DailyCeilingUsage()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PricingStructure.dailyCeilingUsage' kind='element'"
     * @generated
     */
    Integer getDailyCeilingUsage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getDailyCeilingUsage <em>Daily Ceiling Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Daily Ceiling Usage</em>' attribute.
     * @see #isSetDailyCeilingUsage()
     * @see #unsetDailyCeilingUsage()
     * @see #getDailyCeilingUsage()
     * @generated
     */
    void setDailyCeilingUsage( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getDailyCeilingUsage <em>Daily Ceiling Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDailyCeilingUsage()
     * @see #getDailyCeilingUsage()
     * @see #setDailyCeilingUsage(Integer)
     * @generated
     */
    void unsetDailyCeilingUsage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getDailyCeilingUsage <em>Daily Ceiling Usage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Daily Ceiling Usage</em>' attribute is set.
     * @see #unsetDailyCeilingUsage()
     * @see #getDailyCeilingUsage()
     * @see #setDailyCeilingUsage(Integer)
     * @generated
     */
    boolean isSetDailyCeilingUsage();

    /**
     * Returns the value of the '<em><b>Daily Estimated Usage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Daily Estimated Usage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Daily Estimated Usage</em>' attribute.
     * @see #isSetDailyEstimatedUsage()
     * @see #unsetDailyEstimatedUsage()
     * @see #setDailyEstimatedUsage(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPricingStructure_DailyEstimatedUsage()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PricingStructure.dailyEstimatedUsage' kind='element'"
     * @generated
     */
    Integer getDailyEstimatedUsage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getDailyEstimatedUsage <em>Daily Estimated Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Daily Estimated Usage</em>' attribute.
     * @see #isSetDailyEstimatedUsage()
     * @see #unsetDailyEstimatedUsage()
     * @see #getDailyEstimatedUsage()
     * @generated
     */
    void setDailyEstimatedUsage( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getDailyEstimatedUsage <em>Daily Estimated Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDailyEstimatedUsage()
     * @see #getDailyEstimatedUsage()
     * @see #setDailyEstimatedUsage(Integer)
     * @generated
     */
    void unsetDailyEstimatedUsage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getDailyEstimatedUsage <em>Daily Estimated Usage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Daily Estimated Usage</em>' attribute is set.
     * @see #unsetDailyEstimatedUsage()
     * @see #getDailyEstimatedUsage()
     * @see #setDailyEstimatedUsage(Integer)
     * @generated
     */
    boolean isSetDailyEstimatedUsage();

    /**
     * Returns the value of the '<em><b>Daily Floor Usage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Daily Floor Usage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Daily Floor Usage</em>' attribute.
     * @see #isSetDailyFloorUsage()
     * @see #unsetDailyFloorUsage()
     * @see #setDailyFloorUsage(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPricingStructure_DailyFloorUsage()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PricingStructure.dailyFloorUsage' kind='element'"
     * @generated
     */
    Integer getDailyFloorUsage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getDailyFloorUsage <em>Daily Floor Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Daily Floor Usage</em>' attribute.
     * @see #isSetDailyFloorUsage()
     * @see #unsetDailyFloorUsage()
     * @see #getDailyFloorUsage()
     * @generated
     */
    void setDailyFloorUsage( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getDailyFloorUsage <em>Daily Floor Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDailyFloorUsage()
     * @see #getDailyFloorUsage()
     * @see #setDailyFloorUsage(Integer)
     * @generated
     */
    void unsetDailyFloorUsage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getDailyFloorUsage <em>Daily Floor Usage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Daily Floor Usage</em>' attribute is set.
     * @see #unsetDailyFloorUsage()
     * @see #getDailyFloorUsage()
     * @see #setDailyFloorUsage(Integer)
     * @generated
     */
    boolean isSetDailyFloorUsage();

    /**
     * Returns the value of the '<em><b>Revenue Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RevenueKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Revenue Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Revenue Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RevenueKind
     * @see #isSetRevenueKind()
     * @see #unsetRevenueKind()
     * @see #setRevenueKind(RevenueKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPricingStructure_RevenueKind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PricingStructure.revenueKind' kind='element'"
     * @generated
     */
    RevenueKind getRevenueKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getRevenueKind <em>Revenue Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Revenue Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RevenueKind
     * @see #isSetRevenueKind()
     * @see #unsetRevenueKind()
     * @see #getRevenueKind()
     * @generated
     */
    void setRevenueKind( RevenueKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getRevenueKind <em>Revenue Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRevenueKind()
     * @see #getRevenueKind()
     * @see #setRevenueKind(RevenueKind)
     * @generated
     */
    void unsetRevenueKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getRevenueKind <em>Revenue Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Revenue Kind</em>' attribute is set.
     * @see #unsetRevenueKind()
     * @see #getRevenueKind()
     * @see #setRevenueKind(RevenueKind)
     * @generated
     */
    boolean isSetRevenueKind();

    /**
     * Returns the value of the '<em><b>Tax Exemption</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tax Exemption</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tax Exemption</em>' attribute.
     * @see #isSetTaxExemption()
     * @see #unsetTaxExemption()
     * @see #setTaxExemption(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPricingStructure_TaxExemption()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PricingStructure.taxExemption' kind='element'"
     * @generated
     */
    Boolean getTaxExemption();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getTaxExemption <em>Tax Exemption</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tax Exemption</em>' attribute.
     * @see #isSetTaxExemption()
     * @see #unsetTaxExemption()
     * @see #getTaxExemption()
     * @generated
     */
    void setTaxExemption( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getTaxExemption <em>Tax Exemption</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTaxExemption()
     * @see #getTaxExemption()
     * @see #setTaxExemption(Boolean)
     * @generated
     */
    void unsetTaxExemption();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getTaxExemption <em>Tax Exemption</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tax Exemption</em>' attribute is set.
     * @see #unsetTaxExemption()
     * @see #getTaxExemption()
     * @see #setTaxExemption(Boolean)
     * @generated
     */
    boolean isSetTaxExemption();

    /**
     * Returns the value of the '<em><b>Usage Points</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint#getPricingStructures <em>Pricing Structures</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Usage Points</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Usage Points</em>' reference list.
     * @see #isSetUsagePoints()
     * @see #unsetUsagePoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPricingStructure_UsagePoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint#getPricingStructures
     * @model opposite="PricingStructures" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PricingStructure.UsagePoints' kind='element'"
     * @generated
     */
    EList< UsagePoint > getUsagePoints();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getUsagePoints <em>Usage Points</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUsagePoints()
     * @see #getUsagePoints()
     * @generated
     */
    void unsetUsagePoints();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getUsagePoints <em>Usage Points</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Usage Points</em>' reference list is set.
     * @see #unsetUsagePoints()
     * @see #getUsagePoints()
     * @generated
     */
    boolean isSetUsagePoints();

    /**
     * Returns the value of the '<em><b>Service Category</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ServiceCategory#getPricingStructures <em>Pricing Structures</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Category</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Category</em>' reference.
     * @see #isSetServiceCategory()
     * @see #unsetServiceCategory()
     * @see #setServiceCategory(ServiceCategory)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPricingStructure_ServiceCategory()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ServiceCategory#getPricingStructures
     * @model opposite="PricingStructures" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PricingStructure.ServiceCategory' kind='element'"
     * @generated
     */
    ServiceCategory getServiceCategory();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getServiceCategory <em>Service Category</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Category</em>' reference.
     * @see #isSetServiceCategory()
     * @see #unsetServiceCategory()
     * @see #getServiceCategory()
     * @generated
     */
    void setServiceCategory( ServiceCategory value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getServiceCategory <em>Service Category</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetServiceCategory()
     * @see #getServiceCategory()
     * @see #setServiceCategory(ServiceCategory)
     * @generated
     */
    void unsetServiceCategory();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getServiceCategory <em>Service Category</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Service Category</em>' reference is set.
     * @see #unsetServiceCategory()
     * @see #getServiceCategory()
     * @see #setServiceCategory(ServiceCategory)
     * @generated
     */
    boolean isSetServiceCategory();

    /**
     * Returns the value of the '<em><b>Tariffs</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tariff}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tariff#getPricingStructures <em>Pricing Structures</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tariffs</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tariffs</em>' reference list.
     * @see #isSetTariffs()
     * @see #unsetTariffs()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPricingStructure_Tariffs()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tariff#getPricingStructures
     * @model opposite="PricingStructures" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PricingStructure.Tariffs' kind='element'"
     * @generated
     */
    EList< Tariff > getTariffs();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getTariffs <em>Tariffs</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTariffs()
     * @see #getTariffs()
     * @generated
     */
    void unsetTariffs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getTariffs <em>Tariffs</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tariffs</em>' reference list is set.
     * @see #unsetTariffs()
     * @see #getTariffs()
     * @generated
     */
    boolean isSetTariffs();

    /**
     * Returns the value of the '<em><b>Customer Agreements</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAgreement}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAgreement#getPricingStructures <em>Pricing Structures</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Customer Agreements</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Customer Agreements</em>' reference list.
     * @see #isSetCustomerAgreements()
     * @see #unsetCustomerAgreements()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPricingStructure_CustomerAgreements()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAgreement#getPricingStructures
     * @model opposite="PricingStructures" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PricingStructure.CustomerAgreements' kind='element'"
     * @generated
     */
    EList< CustomerAgreement > getCustomerAgreements();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getCustomerAgreements <em>Customer Agreements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCustomerAgreements()
     * @see #getCustomerAgreements()
     * @generated
     */
    void unsetCustomerAgreements();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getCustomerAgreements <em>Customer Agreements</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Customer Agreements</em>' reference list is set.
     * @see #unsetCustomerAgreements()
     * @see #getCustomerAgreements()
     * @generated
     */
    boolean isSetCustomerAgreements();

    /**
     * Returns the value of the '<em><b>Transactions</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getPricingStructure <em>Pricing Structure</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transactions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transactions</em>' reference list.
     * @see #isSetTransactions()
     * @see #unsetTransactions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPricingStructure_Transactions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getPricingStructure
     * @model opposite="PricingStructure" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PricingStructure.Transactions' kind='element'"
     * @generated
     */
    EList< Transaction > getTransactions();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getTransactions <em>Transactions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTransactions()
     * @see #getTransactions()
     * @generated
     */
    void unsetTransactions();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getTransactions <em>Transactions</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Transactions</em>' reference list is set.
     * @see #unsetTransactions()
     * @see #getTransactions()
     * @generated
     */
    boolean isSetTransactions();

} // PricingStructure
