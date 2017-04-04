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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CT Temp Active Power Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CTTempActivePowerCurve#getCombustionTurbine <em>Combustion Turbine</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCTTempActivePowerCurve()
 * @model
 * @generated
 */
public interface CTTempActivePowerCurve extends Curve {
    /**
     * Returns the value of the '<em><b>Combustion Turbine</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getCTTempActivePowerCurve <em>CT Temp Active Power Curve</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Combustion Turbine</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Combustion Turbine</em>' reference.
     * @see #isSetCombustionTurbine()
     * @see #unsetCombustionTurbine()
     * @see #setCombustionTurbine(CombustionTurbine)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCTTempActivePowerCurve_CombustionTurbine()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getCTTempActivePowerCurve
     * @model opposite="CTTempActivePowerCurve" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CTTempActivePowerCurve.CombustionTurbine' kind='element'"
     * @generated
     */
    CombustionTurbine getCombustionTurbine();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CTTempActivePowerCurve#getCombustionTurbine <em>Combustion Turbine</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Combustion Turbine</em>' reference.
     * @see #isSetCombustionTurbine()
     * @see #unsetCombustionTurbine()
     * @see #getCombustionTurbine()
     * @generated
     */
    void setCombustionTurbine( CombustionTurbine value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CTTempActivePowerCurve#getCombustionTurbine <em>Combustion Turbine</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCombustionTurbine()
     * @see #getCombustionTurbine()
     * @see #setCombustionTurbine(CombustionTurbine)
     * @generated
     */
    void unsetCombustionTurbine();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CTTempActivePowerCurve#getCombustionTurbine <em>Combustion Turbine</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Combustion Turbine</em>' reference is set.
     * @see #unsetCombustionTurbine()
     * @see #getCombustionTurbine()
     * @see #setCombustionTurbine(CombustionTurbine)
     * @generated
     */
    boolean isSetCombustionTurbine();

} // CTTempActivePowerCurve
