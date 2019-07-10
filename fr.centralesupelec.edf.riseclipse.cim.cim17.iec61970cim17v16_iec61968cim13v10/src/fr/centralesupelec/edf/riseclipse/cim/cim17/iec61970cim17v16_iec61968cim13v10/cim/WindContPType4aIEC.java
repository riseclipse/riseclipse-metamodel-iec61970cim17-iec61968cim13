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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wind Cont PType4a IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4aIEC#getDpmaxp4a <em>Dpmaxp4a</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4aIEC#getTpordp4a <em>Tpordp4a</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4aIEC#getTufiltp4a <em>Tufiltp4a</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4aIEC#getWindTurbineType4aIEC <em>Wind Turbine Type4a IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType4aIEC()
 * @model
 * @generated
 */
public interface WindContPType4aIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Dpmaxp4a</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dpmaxp4a</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dpmaxp4a</em>' attribute.
     * @see #isSetDpmaxp4a()
     * @see #unsetDpmaxp4a()
     * @see #setDpmaxp4a(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType4aIEC_Dpmaxp4a()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType4aIEC.dpmaxp4a' kind='element'"
     * @generated
     */
    Float getDpmaxp4a();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4aIEC#getDpmaxp4a <em>Dpmaxp4a</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dpmaxp4a</em>' attribute.
     * @see #isSetDpmaxp4a()
     * @see #unsetDpmaxp4a()
     * @see #getDpmaxp4a()
     * @generated
     */
    void setDpmaxp4a( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4aIEC#getDpmaxp4a <em>Dpmaxp4a</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDpmaxp4a()
     * @see #getDpmaxp4a()
     * @see #setDpmaxp4a(Float)
     * @generated
     */
    void unsetDpmaxp4a();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4aIEC#getDpmaxp4a <em>Dpmaxp4a</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dpmaxp4a</em>' attribute is set.
     * @see #unsetDpmaxp4a()
     * @see #getDpmaxp4a()
     * @see #setDpmaxp4a(Float)
     * @generated
     */
    boolean isSetDpmaxp4a();

    /**
     * Returns the value of the '<em><b>Tpordp4a</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tpordp4a</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tpordp4a</em>' attribute.
     * @see #isSetTpordp4a()
     * @see #unsetTpordp4a()
     * @see #setTpordp4a(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType4aIEC_Tpordp4a()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType4aIEC.tpordp4a' kind='element'"
     * @generated
     */
    Float getTpordp4a();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4aIEC#getTpordp4a <em>Tpordp4a</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpordp4a</em>' attribute.
     * @see #isSetTpordp4a()
     * @see #unsetTpordp4a()
     * @see #getTpordp4a()
     * @generated
     */
    void setTpordp4a( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4aIEC#getTpordp4a <em>Tpordp4a</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpordp4a()
     * @see #getTpordp4a()
     * @see #setTpordp4a(Float)
     * @generated
     */
    void unsetTpordp4a();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4aIEC#getTpordp4a <em>Tpordp4a</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpordp4a</em>' attribute is set.
     * @see #unsetTpordp4a()
     * @see #getTpordp4a()
     * @see #setTpordp4a(Float)
     * @generated
     */
    boolean isSetTpordp4a();

    /**
     * Returns the value of the '<em><b>Tufiltp4a</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tufiltp4a</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tufiltp4a</em>' attribute.
     * @see #isSetTufiltp4a()
     * @see #unsetTufiltp4a()
     * @see #setTufiltp4a(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType4aIEC_Tufiltp4a()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType4aIEC.tufiltp4a' kind='element'"
     * @generated
     */
    Float getTufiltp4a();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4aIEC#getTufiltp4a <em>Tufiltp4a</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tufiltp4a</em>' attribute.
     * @see #isSetTufiltp4a()
     * @see #unsetTufiltp4a()
     * @see #getTufiltp4a()
     * @generated
     */
    void setTufiltp4a( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4aIEC#getTufiltp4a <em>Tufiltp4a</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTufiltp4a()
     * @see #getTufiltp4a()
     * @see #setTufiltp4a(Float)
     * @generated
     */
    void unsetTufiltp4a();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4aIEC#getTufiltp4a <em>Tufiltp4a</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tufiltp4a</em>' attribute is set.
     * @see #unsetTufiltp4a()
     * @see #getTufiltp4a()
     * @see #setTufiltp4a(Float)
     * @generated
     */
    boolean isSetTufiltp4a();

    /**
     * Returns the value of the '<em><b>Wind Turbine Type4a IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType4aIEC#getWindContPType4aIEC <em>Wind Cont PType4a IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Turbine Type4a IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Turbine Type4a IEC</em>' reference.
     * @see #isSetWindTurbineType4aIEC()
     * @see #unsetWindTurbineType4aIEC()
     * @see #setWindTurbineType4aIEC(WindTurbineType4aIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType4aIEC_WindTurbineType4aIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType4aIEC#getWindContPType4aIEC
     * @model opposite="WindContPType4aIEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType4aIEC.WindTurbineType4aIEC' kind='element'"
     * @generated
     */
    WindTurbineType4aIEC getWindTurbineType4aIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4aIEC#getWindTurbineType4aIEC <em>Wind Turbine Type4a IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Turbine Type4a IEC</em>' reference.
     * @see #isSetWindTurbineType4aIEC()
     * @see #unsetWindTurbineType4aIEC()
     * @see #getWindTurbineType4aIEC()
     * @generated
     */
    void setWindTurbineType4aIEC( WindTurbineType4aIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4aIEC#getWindTurbineType4aIEC <em>Wind Turbine Type4a IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType4aIEC()
     * @see #getWindTurbineType4aIEC()
     * @see #setWindTurbineType4aIEC(WindTurbineType4aIEC)
     * @generated
     */
    void unsetWindTurbineType4aIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4aIEC#getWindTurbineType4aIEC <em>Wind Turbine Type4a IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type4a IEC</em>' reference is set.
     * @see #unsetWindTurbineType4aIEC()
     * @see #getWindTurbineType4aIEC()
     * @see #setWindTurbineType4aIEC(WindTurbineType4aIEC)
     * @generated
     */
    boolean isSetWindTurbineType4aIEC();

} // WindContPType4aIEC
