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
 * A representation of the model object '<em><b>Wind Gen Type3a IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenType3aIEC#getKpc <em>Kpc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenType3aIEC#getTic <em>Tic</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenType3aIEC#getWindTurbineType4IEC <em>Wind Turbine Type4 IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindGenType3aIEC()
 * @model
 * @generated
 */
public interface WindGenType3aIEC extends WindGenType3IEC {
    /**
     * Returns the value of the '<em><b>Kpc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kpc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kpc</em>' attribute.
     * @see #isSetKpc()
     * @see #unsetKpc()
     * @see #setKpc(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindGenType3aIEC_Kpc()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindGenType3aIEC.kpc' kind='element'"
     * @generated
     */
    Float getKpc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenType3aIEC#getKpc <em>Kpc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpc</em>' attribute.
     * @see #isSetKpc()
     * @see #unsetKpc()
     * @see #getKpc()
     * @generated
     */
    void setKpc( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenType3aIEC#getKpc <em>Kpc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpc()
     * @see #getKpc()
     * @see #setKpc(Float)
     * @generated
     */
    void unsetKpc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenType3aIEC#getKpc <em>Kpc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpc</em>' attribute is set.
     * @see #unsetKpc()
     * @see #getKpc()
     * @see #setKpc(Float)
     * @generated
     */
    boolean isSetKpc();

    /**
     * Returns the value of the '<em><b>Tic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tic</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tic</em>' attribute.
     * @see #isSetTic()
     * @see #unsetTic()
     * @see #setTic(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindGenType3aIEC_Tic()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindGenType3aIEC.tic' kind='element'"
     * @generated
     */
    Float getTic();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenType3aIEC#getTic <em>Tic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tic</em>' attribute.
     * @see #isSetTic()
     * @see #unsetTic()
     * @see #getTic()
     * @generated
     */
    void setTic( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenType3aIEC#getTic <em>Tic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTic()
     * @see #getTic()
     * @see #setTic(Float)
     * @generated
     */
    void unsetTic();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenType3aIEC#getTic <em>Tic</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tic</em>' attribute is set.
     * @see #unsetTic()
     * @see #getTic()
     * @see #setTic(Float)
     * @generated
     */
    boolean isSetTic();

    /**
     * Returns the value of the '<em><b>Wind Turbine Type4 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType4IEC#getWindGenType3aIEC <em>Wind Gen Type3a IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Turbine Type4 IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Turbine Type4 IEC</em>' reference.
     * @see #isSetWindTurbineType4IEC()
     * @see #unsetWindTurbineType4IEC()
     * @see #setWindTurbineType4IEC(WindTurbineType4IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindGenType3aIEC_WindTurbineType4IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType4IEC#getWindGenType3aIEC
     * @model opposite="WindGenType3aIEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindGenType3aIEC.WindTurbineType4IEC' kind='element'"
     * @generated
     */
    WindTurbineType4IEC getWindTurbineType4IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenType3aIEC#getWindTurbineType4IEC <em>Wind Turbine Type4 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Turbine Type4 IEC</em>' reference.
     * @see #isSetWindTurbineType4IEC()
     * @see #unsetWindTurbineType4IEC()
     * @see #getWindTurbineType4IEC()
     * @generated
     */
    void setWindTurbineType4IEC( WindTurbineType4IEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenType3aIEC#getWindTurbineType4IEC <em>Wind Turbine Type4 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType4IEC()
     * @see #getWindTurbineType4IEC()
     * @see #setWindTurbineType4IEC(WindTurbineType4IEC)
     * @generated
     */
    void unsetWindTurbineType4IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenType3aIEC#getWindTurbineType4IEC <em>Wind Turbine Type4 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type4 IEC</em>' reference is set.
     * @see #unsetWindTurbineType4IEC()
     * @see #getWindTurbineType4IEC()
     * @see #setWindTurbineType4IEC(WindTurbineType4IEC)
     * @generated
     */
    boolean isSetWindTurbineType4IEC();

} // WindGenType3aIEC
