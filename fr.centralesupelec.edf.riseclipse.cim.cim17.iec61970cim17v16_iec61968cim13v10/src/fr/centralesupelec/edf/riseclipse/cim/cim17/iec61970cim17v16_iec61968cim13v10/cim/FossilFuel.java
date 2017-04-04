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
 * A representation of the model object '<em><b>Fossil Fuel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFossilFuelType <em>Fossil Fuel Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelCost <em>Fuel Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelDispatchCost <em>Fuel Dispatch Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelEffFactor <em>Fuel Eff Factor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelHandlingCost <em>Fuel Handling Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelHeatContent <em>Fuel Heat Content</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelMixture <em>Fuel Mixture</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelSulfur <em>Fuel Sulfur</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getHighBreakpointP <em>High Breakpoint P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getLowBreakpointP <em>Low Breakpoint P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelAllocationSchedules <em>Fuel Allocation Schedules</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFossilFuel()
 * @model
 * @generated
 */
public interface FossilFuel extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Fossil Fuel Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fossil Fuel Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fossil Fuel Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelType
     * @see #isSetFossilFuelType()
     * @see #unsetFossilFuelType()
     * @see #setFossilFuelType(FuelType)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFossilFuel_FossilFuelType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FossilFuel.fossilFuelType' kind='element'"
     * @generated
     */
    FuelType getFossilFuelType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFossilFuelType <em>Fossil Fuel Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fossil Fuel Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelType
     * @see #isSetFossilFuelType()
     * @see #unsetFossilFuelType()
     * @see #getFossilFuelType()
     * @generated
     */
    void setFossilFuelType( FuelType value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFossilFuelType <em>Fossil Fuel Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFossilFuelType()
     * @see #getFossilFuelType()
     * @see #setFossilFuelType(FuelType)
     * @generated
     */
    void unsetFossilFuelType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFossilFuelType <em>Fossil Fuel Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fossil Fuel Type</em>' attribute is set.
     * @see #unsetFossilFuelType()
     * @see #getFossilFuelType()
     * @see #setFossilFuelType(FuelType)
     * @generated
     */
    boolean isSetFossilFuelType();

    /**
     * Returns the value of the '<em><b>Fuel Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fuel Cost</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fuel Cost</em>' attribute.
     * @see #isSetFuelCost()
     * @see #unsetFuelCost()
     * @see #setFuelCost(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFossilFuel_FuelCost()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FossilFuel.fuelCost' kind='element'"
     * @generated
     */
    Float getFuelCost();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelCost <em>Fuel Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fuel Cost</em>' attribute.
     * @see #isSetFuelCost()
     * @see #unsetFuelCost()
     * @see #getFuelCost()
     * @generated
     */
    void setFuelCost( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelCost <em>Fuel Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFuelCost()
     * @see #getFuelCost()
     * @see #setFuelCost(Float)
     * @generated
     */
    void unsetFuelCost();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelCost <em>Fuel Cost</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fuel Cost</em>' attribute is set.
     * @see #unsetFuelCost()
     * @see #getFuelCost()
     * @see #setFuelCost(Float)
     * @generated
     */
    boolean isSetFuelCost();

    /**
     * Returns the value of the '<em><b>Fuel Dispatch Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fuel Dispatch Cost</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fuel Dispatch Cost</em>' attribute.
     * @see #isSetFuelDispatchCost()
     * @see #unsetFuelDispatchCost()
     * @see #setFuelDispatchCost(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFossilFuel_FuelDispatchCost()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FossilFuel.fuelDispatchCost' kind='element'"
     * @generated
     */
    Float getFuelDispatchCost();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelDispatchCost <em>Fuel Dispatch Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fuel Dispatch Cost</em>' attribute.
     * @see #isSetFuelDispatchCost()
     * @see #unsetFuelDispatchCost()
     * @see #getFuelDispatchCost()
     * @generated
     */
    void setFuelDispatchCost( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelDispatchCost <em>Fuel Dispatch Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFuelDispatchCost()
     * @see #getFuelDispatchCost()
     * @see #setFuelDispatchCost(Float)
     * @generated
     */
    void unsetFuelDispatchCost();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelDispatchCost <em>Fuel Dispatch Cost</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fuel Dispatch Cost</em>' attribute is set.
     * @see #unsetFuelDispatchCost()
     * @see #getFuelDispatchCost()
     * @see #setFuelDispatchCost(Float)
     * @generated
     */
    boolean isSetFuelDispatchCost();

    /**
     * Returns the value of the '<em><b>Fuel Eff Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fuel Eff Factor</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fuel Eff Factor</em>' attribute.
     * @see #isSetFuelEffFactor()
     * @see #unsetFuelEffFactor()
     * @see #setFuelEffFactor(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFossilFuel_FuelEffFactor()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FossilFuel.fuelEffFactor' kind='element'"
     * @generated
     */
    Float getFuelEffFactor();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelEffFactor <em>Fuel Eff Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fuel Eff Factor</em>' attribute.
     * @see #isSetFuelEffFactor()
     * @see #unsetFuelEffFactor()
     * @see #getFuelEffFactor()
     * @generated
     */
    void setFuelEffFactor( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelEffFactor <em>Fuel Eff Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFuelEffFactor()
     * @see #getFuelEffFactor()
     * @see #setFuelEffFactor(Float)
     * @generated
     */
    void unsetFuelEffFactor();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelEffFactor <em>Fuel Eff Factor</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fuel Eff Factor</em>' attribute is set.
     * @see #unsetFuelEffFactor()
     * @see #getFuelEffFactor()
     * @see #setFuelEffFactor(Float)
     * @generated
     */
    boolean isSetFuelEffFactor();

    /**
     * Returns the value of the '<em><b>Fuel Handling Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fuel Handling Cost</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fuel Handling Cost</em>' attribute.
     * @see #isSetFuelHandlingCost()
     * @see #unsetFuelHandlingCost()
     * @see #setFuelHandlingCost(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFossilFuel_FuelHandlingCost()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FossilFuel.fuelHandlingCost' kind='element'"
     * @generated
     */
    Float getFuelHandlingCost();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelHandlingCost <em>Fuel Handling Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fuel Handling Cost</em>' attribute.
     * @see #isSetFuelHandlingCost()
     * @see #unsetFuelHandlingCost()
     * @see #getFuelHandlingCost()
     * @generated
     */
    void setFuelHandlingCost( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelHandlingCost <em>Fuel Handling Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFuelHandlingCost()
     * @see #getFuelHandlingCost()
     * @see #setFuelHandlingCost(Float)
     * @generated
     */
    void unsetFuelHandlingCost();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelHandlingCost <em>Fuel Handling Cost</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fuel Handling Cost</em>' attribute is set.
     * @see #unsetFuelHandlingCost()
     * @see #getFuelHandlingCost()
     * @see #setFuelHandlingCost(Float)
     * @generated
     */
    boolean isSetFuelHandlingCost();

    /**
     * Returns the value of the '<em><b>Fuel Heat Content</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fuel Heat Content</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fuel Heat Content</em>' attribute.
     * @see #isSetFuelHeatContent()
     * @see #unsetFuelHeatContent()
     * @see #setFuelHeatContent(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFossilFuel_FuelHeatContent()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FossilFuel.fuelHeatContent' kind='element'"
     * @generated
     */
    Float getFuelHeatContent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelHeatContent <em>Fuel Heat Content</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fuel Heat Content</em>' attribute.
     * @see #isSetFuelHeatContent()
     * @see #unsetFuelHeatContent()
     * @see #getFuelHeatContent()
     * @generated
     */
    void setFuelHeatContent( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelHeatContent <em>Fuel Heat Content</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFuelHeatContent()
     * @see #getFuelHeatContent()
     * @see #setFuelHeatContent(Float)
     * @generated
     */
    void unsetFuelHeatContent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelHeatContent <em>Fuel Heat Content</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fuel Heat Content</em>' attribute is set.
     * @see #unsetFuelHeatContent()
     * @see #getFuelHeatContent()
     * @see #setFuelHeatContent(Float)
     * @generated
     */
    boolean isSetFuelHeatContent();

    /**
     * Returns the value of the '<em><b>Fuel Mixture</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fuel Mixture</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fuel Mixture</em>' attribute.
     * @see #isSetFuelMixture()
     * @see #unsetFuelMixture()
     * @see #setFuelMixture(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFossilFuel_FuelMixture()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FossilFuel.fuelMixture' kind='element'"
     * @generated
     */
    Float getFuelMixture();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelMixture <em>Fuel Mixture</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fuel Mixture</em>' attribute.
     * @see #isSetFuelMixture()
     * @see #unsetFuelMixture()
     * @see #getFuelMixture()
     * @generated
     */
    void setFuelMixture( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelMixture <em>Fuel Mixture</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFuelMixture()
     * @see #getFuelMixture()
     * @see #setFuelMixture(Float)
     * @generated
     */
    void unsetFuelMixture();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelMixture <em>Fuel Mixture</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fuel Mixture</em>' attribute is set.
     * @see #unsetFuelMixture()
     * @see #getFuelMixture()
     * @see #setFuelMixture(Float)
     * @generated
     */
    boolean isSetFuelMixture();

    /**
     * Returns the value of the '<em><b>Fuel Sulfur</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fuel Sulfur</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fuel Sulfur</em>' attribute.
     * @see #isSetFuelSulfur()
     * @see #unsetFuelSulfur()
     * @see #setFuelSulfur(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFossilFuel_FuelSulfur()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FossilFuel.fuelSulfur' kind='element'"
     * @generated
     */
    Float getFuelSulfur();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelSulfur <em>Fuel Sulfur</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fuel Sulfur</em>' attribute.
     * @see #isSetFuelSulfur()
     * @see #unsetFuelSulfur()
     * @see #getFuelSulfur()
     * @generated
     */
    void setFuelSulfur( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelSulfur <em>Fuel Sulfur</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFuelSulfur()
     * @see #getFuelSulfur()
     * @see #setFuelSulfur(Float)
     * @generated
     */
    void unsetFuelSulfur();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelSulfur <em>Fuel Sulfur</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fuel Sulfur</em>' attribute is set.
     * @see #unsetFuelSulfur()
     * @see #getFuelSulfur()
     * @see #setFuelSulfur(Float)
     * @generated
     */
    boolean isSetFuelSulfur();

    /**
     * Returns the value of the '<em><b>High Breakpoint P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>High Breakpoint P</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>High Breakpoint P</em>' attribute.
     * @see #isSetHighBreakpointP()
     * @see #unsetHighBreakpointP()
     * @see #setHighBreakpointP(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFossilFuel_HighBreakpointP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FossilFuel.highBreakpointP' kind='element'"
     * @generated
     */
    Float getHighBreakpointP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getHighBreakpointP <em>High Breakpoint P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>High Breakpoint P</em>' attribute.
     * @see #isSetHighBreakpointP()
     * @see #unsetHighBreakpointP()
     * @see #getHighBreakpointP()
     * @generated
     */
    void setHighBreakpointP( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getHighBreakpointP <em>High Breakpoint P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHighBreakpointP()
     * @see #getHighBreakpointP()
     * @see #setHighBreakpointP(Float)
     * @generated
     */
    void unsetHighBreakpointP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getHighBreakpointP <em>High Breakpoint P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>High Breakpoint P</em>' attribute is set.
     * @see #unsetHighBreakpointP()
     * @see #getHighBreakpointP()
     * @see #setHighBreakpointP(Float)
     * @generated
     */
    boolean isSetHighBreakpointP();

    /**
     * Returns the value of the '<em><b>Low Breakpoint P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Low Breakpoint P</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Low Breakpoint P</em>' attribute.
     * @see #isSetLowBreakpointP()
     * @see #unsetLowBreakpointP()
     * @see #setLowBreakpointP(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFossilFuel_LowBreakpointP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FossilFuel.lowBreakpointP' kind='element'"
     * @generated
     */
    Float getLowBreakpointP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getLowBreakpointP <em>Low Breakpoint P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Low Breakpoint P</em>' attribute.
     * @see #isSetLowBreakpointP()
     * @see #unsetLowBreakpointP()
     * @see #getLowBreakpointP()
     * @generated
     */
    void setLowBreakpointP( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getLowBreakpointP <em>Low Breakpoint P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLowBreakpointP()
     * @see #getLowBreakpointP()
     * @see #setLowBreakpointP(Float)
     * @generated
     */
    void unsetLowBreakpointP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getLowBreakpointP <em>Low Breakpoint P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Low Breakpoint P</em>' attribute is set.
     * @see #unsetLowBreakpointP()
     * @see #getLowBreakpointP()
     * @see #setLowBreakpointP(Float)
     * @generated
     */
    boolean isSetLowBreakpointP();

    /**
     * Returns the value of the '<em><b>Thermal Generating Unit</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getFossilFuels <em>Fossil Fuels</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Thermal Generating Unit</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Thermal Generating Unit</em>' reference.
     * @see #isSetThermalGeneratingUnit()
     * @see #unsetThermalGeneratingUnit()
     * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFossilFuel_ThermalGeneratingUnit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getFossilFuels
     * @model opposite="FossilFuels" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FossilFuel.ThermalGeneratingUnit' kind='element'"
     * @generated
     */
    ThermalGeneratingUnit getThermalGeneratingUnit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Thermal Generating Unit</em>' reference.
     * @see #isSetThermalGeneratingUnit()
     * @see #unsetThermalGeneratingUnit()
     * @see #getThermalGeneratingUnit()
     * @generated
     */
    void setThermalGeneratingUnit( ThermalGeneratingUnit value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThermalGeneratingUnit()
     * @see #getThermalGeneratingUnit()
     * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
     * @generated
     */
    void unsetThermalGeneratingUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Thermal Generating Unit</em>' reference is set.
     * @see #unsetThermalGeneratingUnit()
     * @see #getThermalGeneratingUnit()
     * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
     * @generated
     */
    boolean isSetThermalGeneratingUnit();

    /**
     * Returns the value of the '<em><b>Fuel Allocation Schedules</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getFossilFuel <em>Fossil Fuel</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fuel Allocation Schedules</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fuel Allocation Schedules</em>' reference list.
     * @see #isSetFuelAllocationSchedules()
     * @see #unsetFuelAllocationSchedules()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFossilFuel_FuelAllocationSchedules()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getFossilFuel
     * @model opposite="FossilFuel" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FossilFuel.FuelAllocationSchedules' kind='element'"
     * @generated
     */
    EList< FuelAllocationSchedule > getFuelAllocationSchedules();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelAllocationSchedules <em>Fuel Allocation Schedules</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFuelAllocationSchedules()
     * @see #getFuelAllocationSchedules()
     * @generated
     */
    void unsetFuelAllocationSchedules();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelAllocationSchedules <em>Fuel Allocation Schedules</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fuel Allocation Schedules</em>' reference list is set.
     * @see #unsetFuelAllocationSchedules()
     * @see #getFuelAllocationSchedules()
     * @generated
     */
    boolean isSetFuelAllocationSchedules();

} // FossilFuel
