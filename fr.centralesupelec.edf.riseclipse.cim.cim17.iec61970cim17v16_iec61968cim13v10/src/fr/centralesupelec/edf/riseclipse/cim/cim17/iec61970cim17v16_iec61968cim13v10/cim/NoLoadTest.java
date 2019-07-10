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
 * A representation of the model object '<em><b>No Load Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NoLoadTest#getEnergisedEndVoltage <em>Energised End Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NoLoadTest#getExcitingCurrent <em>Exciting Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NoLoadTest#getExcitingCurrentZero <em>Exciting Current Zero</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NoLoadTest#getLoss <em>Loss</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NoLoadTest#getLossZero <em>Loss Zero</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NoLoadTest#getEnergisedEnd <em>Energised End</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getNoLoadTest()
 * @model
 * @generated
 */
public interface NoLoadTest extends TransformerTest {
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getNoLoadTest_EnergisedEndVoltage()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='NoLoadTest.energisedEndVoltage' kind='element'"
     * @generated
     */
    Float getEnergisedEndVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NoLoadTest#getEnergisedEndVoltage <em>Energised End Voltage</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NoLoadTest#getEnergisedEndVoltage <em>Energised End Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergisedEndVoltage()
     * @see #getEnergisedEndVoltage()
     * @see #setEnergisedEndVoltage(Float)
     * @generated
     */
    void unsetEnergisedEndVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NoLoadTest#getEnergisedEndVoltage <em>Energised End Voltage</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Exciting Current</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exciting Current</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exciting Current</em>' attribute.
     * @see #isSetExcitingCurrent()
     * @see #unsetExcitingCurrent()
     * @see #setExcitingCurrent(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getNoLoadTest_ExcitingCurrent()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='NoLoadTest.excitingCurrent' kind='element'"
     * @generated
     */
    Float getExcitingCurrent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NoLoadTest#getExcitingCurrent <em>Exciting Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Exciting Current</em>' attribute.
     * @see #isSetExcitingCurrent()
     * @see #unsetExcitingCurrent()
     * @see #getExcitingCurrent()
     * @generated
     */
    void setExcitingCurrent( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NoLoadTest#getExcitingCurrent <em>Exciting Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExcitingCurrent()
     * @see #getExcitingCurrent()
     * @see #setExcitingCurrent(Float)
     * @generated
     */
    void unsetExcitingCurrent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NoLoadTest#getExcitingCurrent <em>Exciting Current</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Exciting Current</em>' attribute is set.
     * @see #unsetExcitingCurrent()
     * @see #getExcitingCurrent()
     * @see #setExcitingCurrent(Float)
     * @generated
     */
    boolean isSetExcitingCurrent();

    /**
     * Returns the value of the '<em><b>Exciting Current Zero</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exciting Current Zero</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exciting Current Zero</em>' attribute.
     * @see #isSetExcitingCurrentZero()
     * @see #unsetExcitingCurrentZero()
     * @see #setExcitingCurrentZero(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getNoLoadTest_ExcitingCurrentZero()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='NoLoadTest.excitingCurrentZero' kind='element'"
     * @generated
     */
    Float getExcitingCurrentZero();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NoLoadTest#getExcitingCurrentZero <em>Exciting Current Zero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Exciting Current Zero</em>' attribute.
     * @see #isSetExcitingCurrentZero()
     * @see #unsetExcitingCurrentZero()
     * @see #getExcitingCurrentZero()
     * @generated
     */
    void setExcitingCurrentZero( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NoLoadTest#getExcitingCurrentZero <em>Exciting Current Zero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExcitingCurrentZero()
     * @see #getExcitingCurrentZero()
     * @see #setExcitingCurrentZero(Float)
     * @generated
     */
    void unsetExcitingCurrentZero();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NoLoadTest#getExcitingCurrentZero <em>Exciting Current Zero</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Exciting Current Zero</em>' attribute is set.
     * @see #unsetExcitingCurrentZero()
     * @see #getExcitingCurrentZero()
     * @see #setExcitingCurrentZero(Float)
     * @generated
     */
    boolean isSetExcitingCurrentZero();

    /**
     * Returns the value of the '<em><b>Loss</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Loss</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Loss</em>' attribute.
     * @see #isSetLoss()
     * @see #unsetLoss()
     * @see #setLoss(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getNoLoadTest_Loss()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='NoLoadTest.loss' kind='element'"
     * @generated
     */
    Float getLoss();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NoLoadTest#getLoss <em>Loss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Loss</em>' attribute.
     * @see #isSetLoss()
     * @see #unsetLoss()
     * @see #getLoss()
     * @generated
     */
    void setLoss( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NoLoadTest#getLoss <em>Loss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLoss()
     * @see #getLoss()
     * @see #setLoss(Float)
     * @generated
     */
    void unsetLoss();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NoLoadTest#getLoss <em>Loss</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Loss</em>' attribute is set.
     * @see #unsetLoss()
     * @see #getLoss()
     * @see #setLoss(Float)
     * @generated
     */
    boolean isSetLoss();

    /**
     * Returns the value of the '<em><b>Loss Zero</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Loss Zero</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Loss Zero</em>' attribute.
     * @see #isSetLossZero()
     * @see #unsetLossZero()
     * @see #setLossZero(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getNoLoadTest_LossZero()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='NoLoadTest.lossZero' kind='element'"
     * @generated
     */
    Float getLossZero();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NoLoadTest#getLossZero <em>Loss Zero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Loss Zero</em>' attribute.
     * @see #isSetLossZero()
     * @see #unsetLossZero()
     * @see #getLossZero()
     * @generated
     */
    void setLossZero( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NoLoadTest#getLossZero <em>Loss Zero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLossZero()
     * @see #getLossZero()
     * @see #setLossZero(Float)
     * @generated
     */
    void unsetLossZero();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NoLoadTest#getLossZero <em>Loss Zero</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Loss Zero</em>' attribute is set.
     * @see #unsetLossZero()
     * @see #getLossZero()
     * @see #setLossZero(Float)
     * @generated
     */
    boolean isSetLossZero();

    /**
     * Returns the value of the '<em><b>Energised End</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getEnergisedEndNoLoadTests <em>Energised End No Load Tests</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getNoLoadTest_EnergisedEnd()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getEnergisedEndNoLoadTests
     * @model opposite="EnergisedEndNoLoadTests" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='NoLoadTest.EnergisedEnd' kind='element'"
     * @generated
     */
    TransformerEndInfo getEnergisedEnd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NoLoadTest#getEnergisedEnd <em>Energised End</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NoLoadTest#getEnergisedEnd <em>Energised End</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergisedEnd()
     * @see #getEnergisedEnd()
     * @see #setEnergisedEnd(TransformerEndInfo)
     * @generated
     */
    void unsetEnergisedEnd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NoLoadTest#getEnergisedEnd <em>Energised End</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energised End</em>' reference is set.
     * @see #unsetEnergisedEnd()
     * @see #getEnergisedEnd()
     * @see #setEnergisedEnd(TransformerEndInfo)
     * @generated
     */
    boolean isSetEnergisedEnd();

} // NoLoadTest
