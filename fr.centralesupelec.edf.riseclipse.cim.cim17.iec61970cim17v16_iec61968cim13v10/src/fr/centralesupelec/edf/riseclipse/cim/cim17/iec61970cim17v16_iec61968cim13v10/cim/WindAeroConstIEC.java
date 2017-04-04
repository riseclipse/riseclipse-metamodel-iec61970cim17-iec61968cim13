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
 * A representation of the model object '<em><b>Wind Aero Const IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroConstIEC#getWindGenTurbineType1aIEC <em>Wind Gen Turbine Type1a IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindAeroConstIEC()
 * @model
 * @generated
 */
public interface WindAeroConstIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Wind Gen Turbine Type1a IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenTurbineType1aIEC#getWindAeroConstIEC <em>Wind Aero Const IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Gen Turbine Type1a IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Gen Turbine Type1a IEC</em>' reference.
     * @see #isSetWindGenTurbineType1aIEC()
     * @see #unsetWindGenTurbineType1aIEC()
     * @see #setWindGenTurbineType1aIEC(WindGenTurbineType1aIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindAeroConstIEC_WindGenTurbineType1aIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenTurbineType1aIEC#getWindAeroConstIEC
     * @model opposite="WindAeroConstIEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindAeroConstIEC.WindGenTurbineType1aIEC' kind='element'"
     * @generated
     */
    WindGenTurbineType1aIEC getWindGenTurbineType1aIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroConstIEC#getWindGenTurbineType1aIEC <em>Wind Gen Turbine Type1a IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Gen Turbine Type1a IEC</em>' reference.
     * @see #isSetWindGenTurbineType1aIEC()
     * @see #unsetWindGenTurbineType1aIEC()
     * @see #getWindGenTurbineType1aIEC()
     * @generated
     */
    void setWindGenTurbineType1aIEC( WindGenTurbineType1aIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroConstIEC#getWindGenTurbineType1aIEC <em>Wind Gen Turbine Type1a IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindGenTurbineType1aIEC()
     * @see #getWindGenTurbineType1aIEC()
     * @see #setWindGenTurbineType1aIEC(WindGenTurbineType1aIEC)
     * @generated
     */
    void unsetWindGenTurbineType1aIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroConstIEC#getWindGenTurbineType1aIEC <em>Wind Gen Turbine Type1a IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Gen Turbine Type1a IEC</em>' reference is set.
     * @see #unsetWindGenTurbineType1aIEC()
     * @see #getWindGenTurbineType1aIEC()
     * @see #setWindGenTurbineType1aIEC(WindGenTurbineType1aIEC)
     * @generated
     */
    boolean isSetWindGenTurbineType1aIEC();

} // WindAeroConstIEC
