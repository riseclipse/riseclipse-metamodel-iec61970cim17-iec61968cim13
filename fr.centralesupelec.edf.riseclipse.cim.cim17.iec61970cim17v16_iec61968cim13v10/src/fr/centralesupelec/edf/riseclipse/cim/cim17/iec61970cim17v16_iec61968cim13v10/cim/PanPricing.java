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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pan Pricing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricing#getProviderID <em>Provider ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricing#getPanPricingDetails <em>Pan Pricing Details</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanPricing()
 * @model
 * @generated
 */
public interface PanPricing extends EndDeviceAction {
    /**
     * Returns the value of the '<em><b>Provider ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Provider ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Provider ID</em>' attribute.
     * @see #isSetProviderID()
     * @see #unsetProviderID()
     * @see #setProviderID(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanPricing_ProviderID()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PanPricing.providerID' kind='element'"
     * @generated
     */
    Integer getProviderID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricing#getProviderID <em>Provider ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Provider ID</em>' attribute.
     * @see #isSetProviderID()
     * @see #unsetProviderID()
     * @see #getProviderID()
     * @generated
     */
    void setProviderID( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricing#getProviderID <em>Provider ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProviderID()
     * @see #getProviderID()
     * @see #setProviderID(Integer)
     * @generated
     */
    void unsetProviderID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricing#getProviderID <em>Provider ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Provider ID</em>' attribute is set.
     * @see #unsetProviderID()
     * @see #getProviderID()
     * @see #setProviderID(Integer)
     * @generated
     */
    boolean isSetProviderID();

    /**
     * Returns the value of the '<em><b>Pan Pricing Details</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getPanPricing <em>Pan Pricing</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pan Pricing Details</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pan Pricing Details</em>' reference list.
     * @see #isSetPanPricingDetails()
     * @see #unsetPanPricingDetails()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanPricing_PanPricingDetails()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getPanPricing
     * @model opposite="PanPricing" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PanPricing.PanPricingDetails' kind='element'"
     * @generated
     */
    EList< PanPricingDetail > getPanPricingDetails();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricing#getPanPricingDetails <em>Pan Pricing Details</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPanPricingDetails()
     * @see #getPanPricingDetails()
     * @generated
     */
    void unsetPanPricingDetails();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricing#getPanPricingDetails <em>Pan Pricing Details</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pan Pricing Details</em>' reference list is set.
     * @see #unsetPanPricingDetails()
     * @see #getPanPricingDetails()
     * @generated
     */
    boolean isSetPanPricingDetails();

} // PanPricing
