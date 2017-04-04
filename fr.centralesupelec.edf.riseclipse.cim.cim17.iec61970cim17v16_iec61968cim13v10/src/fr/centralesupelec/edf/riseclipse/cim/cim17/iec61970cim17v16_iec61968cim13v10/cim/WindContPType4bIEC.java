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
 * A representation of the model object '<em><b>Wind Cont PType4b IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4bIEC#getDpmaxp4b <em>Dpmaxp4b</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4bIEC#getTpaero <em>Tpaero</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4bIEC#getTpordp4b <em>Tpordp4b</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4bIEC#getTufiltp4b <em>Tufiltp4b</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4bIEC#getWindTurbineType4bIEC <em>Wind Turbine Type4b IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType4bIEC()
 * @model
 * @generated
 */
public interface WindContPType4bIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Dpmaxp4b</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dpmaxp4b</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dpmaxp4b</em>' attribute.
     * @see #isSetDpmaxp4b()
     * @see #unsetDpmaxp4b()
     * @see #setDpmaxp4b(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType4bIEC_Dpmaxp4b()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType4bIEC.dpmaxp4b' kind='element'"
     * @generated
     */
    Float getDpmaxp4b();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4bIEC#getDpmaxp4b <em>Dpmaxp4b</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dpmaxp4b</em>' attribute.
     * @see #isSetDpmaxp4b()
     * @see #unsetDpmaxp4b()
     * @see #getDpmaxp4b()
     * @generated
     */
    void setDpmaxp4b( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4bIEC#getDpmaxp4b <em>Dpmaxp4b</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDpmaxp4b()
     * @see #getDpmaxp4b()
     * @see #setDpmaxp4b(Float)
     * @generated
     */
    void unsetDpmaxp4b();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4bIEC#getDpmaxp4b <em>Dpmaxp4b</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dpmaxp4b</em>' attribute is set.
     * @see #unsetDpmaxp4b()
     * @see #getDpmaxp4b()
     * @see #setDpmaxp4b(Float)
     * @generated
     */
    boolean isSetDpmaxp4b();

    /**
     * Returns the value of the '<em><b>Tpaero</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tpaero</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tpaero</em>' attribute.
     * @see #isSetTpaero()
     * @see #unsetTpaero()
     * @see #setTpaero(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType4bIEC_Tpaero()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType4bIEC.tpaero' kind='element'"
     * @generated
     */
    Float getTpaero();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4bIEC#getTpaero <em>Tpaero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpaero</em>' attribute.
     * @see #isSetTpaero()
     * @see #unsetTpaero()
     * @see #getTpaero()
     * @generated
     */
    void setTpaero( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4bIEC#getTpaero <em>Tpaero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpaero()
     * @see #getTpaero()
     * @see #setTpaero(Float)
     * @generated
     */
    void unsetTpaero();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4bIEC#getTpaero <em>Tpaero</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpaero</em>' attribute is set.
     * @see #unsetTpaero()
     * @see #getTpaero()
     * @see #setTpaero(Float)
     * @generated
     */
    boolean isSetTpaero();

    /**
     * Returns the value of the '<em><b>Tpordp4b</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tpordp4b</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tpordp4b</em>' attribute.
     * @see #isSetTpordp4b()
     * @see #unsetTpordp4b()
     * @see #setTpordp4b(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType4bIEC_Tpordp4b()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType4bIEC.tpordp4b' kind='element'"
     * @generated
     */
    Float getTpordp4b();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4bIEC#getTpordp4b <em>Tpordp4b</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpordp4b</em>' attribute.
     * @see #isSetTpordp4b()
     * @see #unsetTpordp4b()
     * @see #getTpordp4b()
     * @generated
     */
    void setTpordp4b( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4bIEC#getTpordp4b <em>Tpordp4b</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpordp4b()
     * @see #getTpordp4b()
     * @see #setTpordp4b(Float)
     * @generated
     */
    void unsetTpordp4b();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4bIEC#getTpordp4b <em>Tpordp4b</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpordp4b</em>' attribute is set.
     * @see #unsetTpordp4b()
     * @see #getTpordp4b()
     * @see #setTpordp4b(Float)
     * @generated
     */
    boolean isSetTpordp4b();

    /**
     * Returns the value of the '<em><b>Tufiltp4b</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tufiltp4b</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tufiltp4b</em>' attribute.
     * @see #isSetTufiltp4b()
     * @see #unsetTufiltp4b()
     * @see #setTufiltp4b(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType4bIEC_Tufiltp4b()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType4bIEC.tufiltp4b' kind='element'"
     * @generated
     */
    Float getTufiltp4b();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4bIEC#getTufiltp4b <em>Tufiltp4b</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tufiltp4b</em>' attribute.
     * @see #isSetTufiltp4b()
     * @see #unsetTufiltp4b()
     * @see #getTufiltp4b()
     * @generated
     */
    void setTufiltp4b( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4bIEC#getTufiltp4b <em>Tufiltp4b</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTufiltp4b()
     * @see #getTufiltp4b()
     * @see #setTufiltp4b(Float)
     * @generated
     */
    void unsetTufiltp4b();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4bIEC#getTufiltp4b <em>Tufiltp4b</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tufiltp4b</em>' attribute is set.
     * @see #unsetTufiltp4b()
     * @see #getTufiltp4b()
     * @see #setTufiltp4b(Float)
     * @generated
     */
    boolean isSetTufiltp4b();

    /**
     * Returns the value of the '<em><b>Wind Turbine Type4b IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType4bIEC#getWindContPType4bIEC <em>Wind Cont PType4b IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Turbine Type4b IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Turbine Type4b IEC</em>' reference.
     * @see #isSetWindTurbineType4bIEC()
     * @see #unsetWindTurbineType4bIEC()
     * @see #setWindTurbineType4bIEC(WindTurbineType4bIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPType4bIEC_WindTurbineType4bIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType4bIEC#getWindContPType4bIEC
     * @model opposite="WindContPType4bIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPType4bIEC.WindTurbineType4bIEC' kind='element'"
     * @generated
     */
    WindTurbineType4bIEC getWindTurbineType4bIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4bIEC#getWindTurbineType4bIEC <em>Wind Turbine Type4b IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Turbine Type4b IEC</em>' reference.
     * @see #isSetWindTurbineType4bIEC()
     * @see #unsetWindTurbineType4bIEC()
     * @see #getWindTurbineType4bIEC()
     * @generated
     */
    void setWindTurbineType4bIEC( WindTurbineType4bIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4bIEC#getWindTurbineType4bIEC <em>Wind Turbine Type4b IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType4bIEC()
     * @see #getWindTurbineType4bIEC()
     * @see #setWindTurbineType4bIEC(WindTurbineType4bIEC)
     * @generated
     */
    void unsetWindTurbineType4bIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4bIEC#getWindTurbineType4bIEC <em>Wind Turbine Type4b IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type4b IEC</em>' reference is set.
     * @see #unsetWindTurbineType4bIEC()
     * @see #getWindTurbineType4bIEC()
     * @see #setWindTurbineType4bIEC(WindTurbineType4bIEC)
     * @generated
     */
    boolean isSetWindTurbineType4bIEC();

} // WindContPType4bIEC
