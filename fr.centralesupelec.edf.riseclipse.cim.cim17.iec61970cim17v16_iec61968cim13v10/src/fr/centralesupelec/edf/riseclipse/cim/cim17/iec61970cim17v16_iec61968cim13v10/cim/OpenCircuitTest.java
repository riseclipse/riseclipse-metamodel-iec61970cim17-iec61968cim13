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
 * A representation of the model object '<em><b>Open Circuit Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getEnergisedEndStep <em>Energised End Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getEnergisedEndVoltage <em>Energised End Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getOpenEndStep <em>Open End Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getOpenEndVoltage <em>Open End Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getPhaseShift <em>Phase Shift</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getOpenEnd <em>Open End</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getEnergisedEnd <em>Energised End</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOpenCircuitTest()
 * @model
 * @generated
 */
public interface OpenCircuitTest extends TransformerTest {
    /**
     * Returns the value of the '<em><b>Energised End Step</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Energised End Step</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Energised End Step</em>' attribute.
     * @see #isSetEnergisedEndStep()
     * @see #unsetEnergisedEndStep()
     * @see #setEnergisedEndStep(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOpenCircuitTest_EnergisedEndStep()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OpenCircuitTest.energisedEndStep' kind='element'"
     * @generated
     */
    Integer getEnergisedEndStep();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getEnergisedEndStep <em>Energised End Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Energised End Step</em>' attribute.
     * @see #isSetEnergisedEndStep()
     * @see #unsetEnergisedEndStep()
     * @see #getEnergisedEndStep()
     * @generated
     */
    void setEnergisedEndStep( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getEnergisedEndStep <em>Energised End Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergisedEndStep()
     * @see #getEnergisedEndStep()
     * @see #setEnergisedEndStep(Integer)
     * @generated
     */
    void unsetEnergisedEndStep();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getEnergisedEndStep <em>Energised End Step</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energised End Step</em>' attribute is set.
     * @see #unsetEnergisedEndStep()
     * @see #getEnergisedEndStep()
     * @see #setEnergisedEndStep(Integer)
     * @generated
     */
    boolean isSetEnergisedEndStep();

    /**
     * Returns the value of the '<em><b>Energised End Voltage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Energised End Voltage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Energised End Voltage</em>' attribute.
     * @see #isSetEnergisedEndVoltage()
     * @see #unsetEnergisedEndVoltage()
     * @see #setEnergisedEndVoltage(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOpenCircuitTest_EnergisedEndVoltage()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OpenCircuitTest.energisedEndVoltage' kind='element'"
     * @generated
     */
    Float getEnergisedEndVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getEnergisedEndVoltage <em>Energised End Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Energised End Voltage</em>' attribute.
     * @see #isSetEnergisedEndVoltage()
     * @see #unsetEnergisedEndVoltage()
     * @see #getEnergisedEndVoltage()
     * @generated
     */
    void setEnergisedEndVoltage( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getEnergisedEndVoltage <em>Energised End Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergisedEndVoltage()
     * @see #getEnergisedEndVoltage()
     * @see #setEnergisedEndVoltage(Float)
     * @generated
     */
    void unsetEnergisedEndVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getEnergisedEndVoltage <em>Energised End Voltage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energised End Voltage</em>' attribute is set.
     * @see #unsetEnergisedEndVoltage()
     * @see #getEnergisedEndVoltage()
     * @see #setEnergisedEndVoltage(Float)
     * @generated
     */
    boolean isSetEnergisedEndVoltage();

    /**
     * Returns the value of the '<em><b>Open End Step</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Open End Step</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Open End Step</em>' attribute.
     * @see #isSetOpenEndStep()
     * @see #unsetOpenEndStep()
     * @see #setOpenEndStep(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOpenCircuitTest_OpenEndStep()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OpenCircuitTest.openEndStep' kind='element'"
     * @generated
     */
    Integer getOpenEndStep();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getOpenEndStep <em>Open End Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Open End Step</em>' attribute.
     * @see #isSetOpenEndStep()
     * @see #unsetOpenEndStep()
     * @see #getOpenEndStep()
     * @generated
     */
    void setOpenEndStep( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getOpenEndStep <em>Open End Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOpenEndStep()
     * @see #getOpenEndStep()
     * @see #setOpenEndStep(Integer)
     * @generated
     */
    void unsetOpenEndStep();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getOpenEndStep <em>Open End Step</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Open End Step</em>' attribute is set.
     * @see #unsetOpenEndStep()
     * @see #getOpenEndStep()
     * @see #setOpenEndStep(Integer)
     * @generated
     */
    boolean isSetOpenEndStep();

    /**
     * Returns the value of the '<em><b>Open End Voltage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Open End Voltage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Open End Voltage</em>' attribute.
     * @see #isSetOpenEndVoltage()
     * @see #unsetOpenEndVoltage()
     * @see #setOpenEndVoltage(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOpenCircuitTest_OpenEndVoltage()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OpenCircuitTest.openEndVoltage' kind='element'"
     * @generated
     */
    Float getOpenEndVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getOpenEndVoltage <em>Open End Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Open End Voltage</em>' attribute.
     * @see #isSetOpenEndVoltage()
     * @see #unsetOpenEndVoltage()
     * @see #getOpenEndVoltage()
     * @generated
     */
    void setOpenEndVoltage( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getOpenEndVoltage <em>Open End Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOpenEndVoltage()
     * @see #getOpenEndVoltage()
     * @see #setOpenEndVoltage(Float)
     * @generated
     */
    void unsetOpenEndVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getOpenEndVoltage <em>Open End Voltage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Open End Voltage</em>' attribute is set.
     * @see #unsetOpenEndVoltage()
     * @see #getOpenEndVoltage()
     * @see #setOpenEndVoltage(Float)
     * @generated
     */
    boolean isSetOpenEndVoltage();

    /**
     * Returns the value of the '<em><b>Phase Shift</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase Shift</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phase Shift</em>' attribute.
     * @see #isSetPhaseShift()
     * @see #unsetPhaseShift()
     * @see #setPhaseShift(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOpenCircuitTest_PhaseShift()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OpenCircuitTest.phaseShift' kind='element'"
     * @generated
     */
    Float getPhaseShift();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getPhaseShift <em>Phase Shift</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phase Shift</em>' attribute.
     * @see #isSetPhaseShift()
     * @see #unsetPhaseShift()
     * @see #getPhaseShift()
     * @generated
     */
    void setPhaseShift( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getPhaseShift <em>Phase Shift</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhaseShift()
     * @see #getPhaseShift()
     * @see #setPhaseShift(Float)
     * @generated
     */
    void unsetPhaseShift();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getPhaseShift <em>Phase Shift</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phase Shift</em>' attribute is set.
     * @see #unsetPhaseShift()
     * @see #getPhaseShift()
     * @see #setPhaseShift(Float)
     * @generated
     */
    boolean isSetPhaseShift();

    /**
     * Returns the value of the '<em><b>Open End</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getOpenEndOpenCircuitTests <em>Open End Open Circuit Tests</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Open End</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Open End</em>' reference.
     * @see #isSetOpenEnd()
     * @see #unsetOpenEnd()
     * @see #setOpenEnd(TransformerEndInfo)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOpenCircuitTest_OpenEnd()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getOpenEndOpenCircuitTests
     * @model opposite="OpenEndOpenCircuitTests" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OpenCircuitTest.OpenEnd' kind='element'"
     * @generated
     */
    TransformerEndInfo getOpenEnd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getOpenEnd <em>Open End</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Open End</em>' reference.
     * @see #isSetOpenEnd()
     * @see #unsetOpenEnd()
     * @see #getOpenEnd()
     * @generated
     */
    void setOpenEnd( TransformerEndInfo value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getOpenEnd <em>Open End</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOpenEnd()
     * @see #getOpenEnd()
     * @see #setOpenEnd(TransformerEndInfo)
     * @generated
     */
    void unsetOpenEnd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getOpenEnd <em>Open End</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Open End</em>' reference is set.
     * @see #unsetOpenEnd()
     * @see #getOpenEnd()
     * @see #setOpenEnd(TransformerEndInfo)
     * @generated
     */
    boolean isSetOpenEnd();

    /**
     * Returns the value of the '<em><b>Energised End</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getEnergisedEndOpenCircuitTests <em>Energised End Open Circuit Tests</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Energised End</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Energised End</em>' reference.
     * @see #isSetEnergisedEnd()
     * @see #unsetEnergisedEnd()
     * @see #setEnergisedEnd(TransformerEndInfo)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOpenCircuitTest_EnergisedEnd()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getEnergisedEndOpenCircuitTests
     * @model opposite="EnergisedEndOpenCircuitTests" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OpenCircuitTest.EnergisedEnd' kind='element'"
     * @generated
     */
    TransformerEndInfo getEnergisedEnd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getEnergisedEnd <em>Energised End</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Energised End</em>' reference.
     * @see #isSetEnergisedEnd()
     * @see #unsetEnergisedEnd()
     * @see #getEnergisedEnd()
     * @generated
     */
    void setEnergisedEnd( TransformerEndInfo value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getEnergisedEnd <em>Energised End</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergisedEnd()
     * @see #getEnergisedEnd()
     * @see #setEnergisedEnd(TransformerEndInfo)
     * @generated
     */
    void unsetEnergisedEnd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest#getEnergisedEnd <em>Energised End</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energised End</em>' reference is set.
     * @see #unsetEnergisedEnd()
     * @see #getEnergisedEnd()
     * @see #setEnergisedEnd(TransformerEndInfo)
     * @generated
     */
    boolean isSetEnergisedEnd();

} // OpenCircuitTest
