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

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tariff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tariff#getEndDate <em>End Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tariff#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tariff#getTariffProfiles <em>Tariff Profiles</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tariff#getPricingStructures <em>Pricing Structures</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTariff()
 * @model
 * @generated
 */
public interface Tariff extends Document {
    /**
     * Returns the value of the '<em><b>End Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Date</em>' attribute.
     * @see #isSetEndDate()
     * @see #unsetEndDate()
     * @see #setEndDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTariff_EndDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Tariff.endDate' kind='element'"
     * @generated
     */
    Date getEndDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tariff#getEndDate <em>End Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Date</em>' attribute.
     * @see #isSetEndDate()
     * @see #unsetEndDate()
     * @see #getEndDate()
     * @generated
     */
    void setEndDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tariff#getEndDate <em>End Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndDate()
     * @see #getEndDate()
     * @see #setEndDate(Date)
     * @generated
     */
    void unsetEndDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tariff#getEndDate <em>End Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Date</em>' attribute is set.
     * @see #unsetEndDate()
     * @see #getEndDate()
     * @see #setEndDate(Date)
     * @generated
     */
    boolean isSetEndDate();

    /**
     * Returns the value of the '<em><b>Start Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start Date</em>' attribute.
     * @see #isSetStartDate()
     * @see #unsetStartDate()
     * @see #setStartDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTariff_StartDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Tariff.startDate' kind='element'"
     * @generated
     */
    Date getStartDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tariff#getStartDate <em>Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start Date</em>' attribute.
     * @see #isSetStartDate()
     * @see #unsetStartDate()
     * @see #getStartDate()
     * @generated
     */
    void setStartDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tariff#getStartDate <em>Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStartDate()
     * @see #getStartDate()
     * @see #setStartDate(Date)
     * @generated
     */
    void unsetStartDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tariff#getStartDate <em>Start Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Start Date</em>' attribute is set.
     * @see #unsetStartDate()
     * @see #getStartDate()
     * @see #setStartDate(Date)
     * @generated
     */
    boolean isSetStartDate();

    /**
     * Returns the value of the '<em><b>Tariff Profiles</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TariffProfile}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TariffProfile#getTariffs <em>Tariffs</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tariff Profiles</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tariff Profiles</em>' reference list.
     * @see #isSetTariffProfiles()
     * @see #unsetTariffProfiles()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTariff_TariffProfiles()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TariffProfile#getTariffs
     * @model opposite="Tariffs" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Tariff.TariffProfiles' kind='element'"
     * @generated
     */
    EList< TariffProfile > getTariffProfiles();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tariff#getTariffProfiles <em>Tariff Profiles</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTariffProfiles()
     * @see #getTariffProfiles()
     * @generated
     */
    void unsetTariffProfiles();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tariff#getTariffProfiles <em>Tariff Profiles</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tariff Profiles</em>' reference list is set.
     * @see #unsetTariffProfiles()
     * @see #getTariffProfiles()
     * @generated
     */
    boolean isSetTariffProfiles();

    /**
     * Returns the value of the '<em><b>Pricing Structures</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getTariffs <em>Tariffs</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pricing Structures</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pricing Structures</em>' reference list.
     * @see #isSetPricingStructures()
     * @see #unsetPricingStructures()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTariff_PricingStructures()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure#getTariffs
     * @model opposite="Tariffs" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Tariff.PricingStructures' kind='element'"
     * @generated
     */
    EList< PricingStructure > getPricingStructures();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tariff#getPricingStructures <em>Pricing Structures</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPricingStructures()
     * @see #getPricingStructures()
     * @generated
     */
    void unsetPricingStructures();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tariff#getPricingStructures <em>Pricing Structures</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pricing Structures</em>' reference list is set.
     * @see #unsetPricingStructures()
     * @see #getPricingStructures()
     * @generated
     */
    boolean isSetPricingStructures();

} // Tariff
