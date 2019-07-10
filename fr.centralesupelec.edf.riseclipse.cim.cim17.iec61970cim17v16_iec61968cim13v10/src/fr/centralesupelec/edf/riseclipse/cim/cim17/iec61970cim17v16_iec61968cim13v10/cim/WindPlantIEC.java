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
 * A representation of the model object '<em><b>Wind Plant IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantIEC#getWindPlantReactiveControlIEC <em>Wind Plant Reactive Control IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantIEC#getWindPlantFreqPcontrolIEC <em>Wind Plant Freq Pcontrol IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindPlantIEC()
 * @model
 * @generated
 */
public interface WindPlantIEC extends WindPlantDynamics {
    /**
     * Returns the value of the '<em><b>Wind Plant Reactive Control IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantReactiveControlIEC#getWindPlantIEC <em>Wind Plant IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Plant Reactive Control IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Plant Reactive Control IEC</em>' reference.
     * @see #isSetWindPlantReactiveControlIEC()
     * @see #unsetWindPlantReactiveControlIEC()
     * @see #setWindPlantReactiveControlIEC(WindPlantReactiveControlIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindPlantIEC_WindPlantReactiveControlIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantReactiveControlIEC#getWindPlantIEC
     * @model opposite="WindPlantIEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindPlantIEC.WindPlantReactiveControlIEC' kind='element'"
     * @generated
     */
    WindPlantReactiveControlIEC getWindPlantReactiveControlIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantIEC#getWindPlantReactiveControlIEC <em>Wind Plant Reactive Control IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Plant Reactive Control IEC</em>' reference.
     * @see #isSetWindPlantReactiveControlIEC()
     * @see #unsetWindPlantReactiveControlIEC()
     * @see #getWindPlantReactiveControlIEC()
     * @generated
     */
    void setWindPlantReactiveControlIEC( WindPlantReactiveControlIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantIEC#getWindPlantReactiveControlIEC <em>Wind Plant Reactive Control IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindPlantReactiveControlIEC()
     * @see #getWindPlantReactiveControlIEC()
     * @see #setWindPlantReactiveControlIEC(WindPlantReactiveControlIEC)
     * @generated
     */
    void unsetWindPlantReactiveControlIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantIEC#getWindPlantReactiveControlIEC <em>Wind Plant Reactive Control IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Plant Reactive Control IEC</em>' reference is set.
     * @see #unsetWindPlantReactiveControlIEC()
     * @see #getWindPlantReactiveControlIEC()
     * @see #setWindPlantReactiveControlIEC(WindPlantReactiveControlIEC)
     * @generated
     */
    boolean isSetWindPlantReactiveControlIEC();

    /**
     * Returns the value of the '<em><b>Wind Plant Freq Pcontrol IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getWindPlantIEC <em>Wind Plant IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Plant Freq Pcontrol IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Plant Freq Pcontrol IEC</em>' reference.
     * @see #isSetWindPlantFreqPcontrolIEC()
     * @see #unsetWindPlantFreqPcontrolIEC()
     * @see #setWindPlantFreqPcontrolIEC(WindPlantFreqPcontrolIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindPlantIEC_WindPlantFreqPcontrolIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getWindPlantIEC
     * @model opposite="WindPlantIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindPlantIEC.WindPlantFreqPcontrolIEC' kind='element'"
     * @generated
     */
    WindPlantFreqPcontrolIEC getWindPlantFreqPcontrolIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantIEC#getWindPlantFreqPcontrolIEC <em>Wind Plant Freq Pcontrol IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Plant Freq Pcontrol IEC</em>' reference.
     * @see #isSetWindPlantFreqPcontrolIEC()
     * @see #unsetWindPlantFreqPcontrolIEC()
     * @see #getWindPlantFreqPcontrolIEC()
     * @generated
     */
    void setWindPlantFreqPcontrolIEC( WindPlantFreqPcontrolIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantIEC#getWindPlantFreqPcontrolIEC <em>Wind Plant Freq Pcontrol IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindPlantFreqPcontrolIEC()
     * @see #getWindPlantFreqPcontrolIEC()
     * @see #setWindPlantFreqPcontrolIEC(WindPlantFreqPcontrolIEC)
     * @generated
     */
    void unsetWindPlantFreqPcontrolIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantIEC#getWindPlantFreqPcontrolIEC <em>Wind Plant Freq Pcontrol IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Plant Freq Pcontrol IEC</em>' reference is set.
     * @see #unsetWindPlantFreqPcontrolIEC()
     * @see #getWindPlantFreqPcontrolIEC()
     * @see #setWindPlantFreqPcontrolIEC(WindPlantFreqPcontrolIEC)
     * @generated
     */
    boolean isSetWindPlantFreqPcontrolIEC();

} // WindPlantIEC
