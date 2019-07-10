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
 * A representation of the model object '<em><b>Mutual Coupling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getB0ch <em>B0ch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getDistance11 <em>Distance11</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getDistance12 <em>Distance12</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getDistance21 <em>Distance21</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getDistance22 <em>Distance22</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getG0ch <em>G0ch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getR0 <em>R0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getX0 <em>X0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getSecond_Terminal <em>Second Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getFirst_Terminal <em>First Terminal</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMutualCoupling()
 * @model
 * @generated
 */
public interface MutualCoupling extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>B0ch</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>B0ch</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>B0ch</em>' attribute.
     * @see #isSetB0ch()
     * @see #unsetB0ch()
     * @see #setB0ch(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMutualCoupling_B0ch()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MutualCoupling.b0ch' kind='element'"
     * @generated
     */
    Float getB0ch();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getB0ch <em>B0ch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>B0ch</em>' attribute.
     * @see #isSetB0ch()
     * @see #unsetB0ch()
     * @see #getB0ch()
     * @generated
     */
    void setB0ch( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getB0ch <em>B0ch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetB0ch()
     * @see #getB0ch()
     * @see #setB0ch(Float)
     * @generated
     */
    void unsetB0ch();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getB0ch <em>B0ch</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>B0ch</em>' attribute is set.
     * @see #unsetB0ch()
     * @see #getB0ch()
     * @see #setB0ch(Float)
     * @generated
     */
    boolean isSetB0ch();

    /**
     * Returns the value of the '<em><b>Distance11</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Distance11</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Distance11</em>' attribute.
     * @see #isSetDistance11()
     * @see #unsetDistance11()
     * @see #setDistance11(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMutualCoupling_Distance11()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MutualCoupling.distance11' kind='element'"
     * @generated
     */
    Float getDistance11();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getDistance11 <em>Distance11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Distance11</em>' attribute.
     * @see #isSetDistance11()
     * @see #unsetDistance11()
     * @see #getDistance11()
     * @generated
     */
    void setDistance11( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getDistance11 <em>Distance11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDistance11()
     * @see #getDistance11()
     * @see #setDistance11(Float)
     * @generated
     */
    void unsetDistance11();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getDistance11 <em>Distance11</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Distance11</em>' attribute is set.
     * @see #unsetDistance11()
     * @see #getDistance11()
     * @see #setDistance11(Float)
     * @generated
     */
    boolean isSetDistance11();

    /**
     * Returns the value of the '<em><b>Distance12</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Distance12</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Distance12</em>' attribute.
     * @see #isSetDistance12()
     * @see #unsetDistance12()
     * @see #setDistance12(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMutualCoupling_Distance12()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MutualCoupling.distance12' kind='element'"
     * @generated
     */
    Float getDistance12();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getDistance12 <em>Distance12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Distance12</em>' attribute.
     * @see #isSetDistance12()
     * @see #unsetDistance12()
     * @see #getDistance12()
     * @generated
     */
    void setDistance12( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getDistance12 <em>Distance12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDistance12()
     * @see #getDistance12()
     * @see #setDistance12(Float)
     * @generated
     */
    void unsetDistance12();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getDistance12 <em>Distance12</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Distance12</em>' attribute is set.
     * @see #unsetDistance12()
     * @see #getDistance12()
     * @see #setDistance12(Float)
     * @generated
     */
    boolean isSetDistance12();

    /**
     * Returns the value of the '<em><b>Distance21</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Distance21</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Distance21</em>' attribute.
     * @see #isSetDistance21()
     * @see #unsetDistance21()
     * @see #setDistance21(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMutualCoupling_Distance21()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MutualCoupling.distance21' kind='element'"
     * @generated
     */
    Float getDistance21();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getDistance21 <em>Distance21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Distance21</em>' attribute.
     * @see #isSetDistance21()
     * @see #unsetDistance21()
     * @see #getDistance21()
     * @generated
     */
    void setDistance21( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getDistance21 <em>Distance21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDistance21()
     * @see #getDistance21()
     * @see #setDistance21(Float)
     * @generated
     */
    void unsetDistance21();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getDistance21 <em>Distance21</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Distance21</em>' attribute is set.
     * @see #unsetDistance21()
     * @see #getDistance21()
     * @see #setDistance21(Float)
     * @generated
     */
    boolean isSetDistance21();

    /**
     * Returns the value of the '<em><b>Distance22</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Distance22</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Distance22</em>' attribute.
     * @see #isSetDistance22()
     * @see #unsetDistance22()
     * @see #setDistance22(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMutualCoupling_Distance22()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MutualCoupling.distance22' kind='element'"
     * @generated
     */
    Float getDistance22();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getDistance22 <em>Distance22</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Distance22</em>' attribute.
     * @see #isSetDistance22()
     * @see #unsetDistance22()
     * @see #getDistance22()
     * @generated
     */
    void setDistance22( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getDistance22 <em>Distance22</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDistance22()
     * @see #getDistance22()
     * @see #setDistance22(Float)
     * @generated
     */
    void unsetDistance22();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getDistance22 <em>Distance22</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Distance22</em>' attribute is set.
     * @see #unsetDistance22()
     * @see #getDistance22()
     * @see #setDistance22(Float)
     * @generated
     */
    boolean isSetDistance22();

    /**
     * Returns the value of the '<em><b>G0ch</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>G0ch</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>G0ch</em>' attribute.
     * @see #isSetG0ch()
     * @see #unsetG0ch()
     * @see #setG0ch(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMutualCoupling_G0ch()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MutualCoupling.g0ch' kind='element'"
     * @generated
     */
    Float getG0ch();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getG0ch <em>G0ch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>G0ch</em>' attribute.
     * @see #isSetG0ch()
     * @see #unsetG0ch()
     * @see #getG0ch()
     * @generated
     */
    void setG0ch( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getG0ch <em>G0ch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetG0ch()
     * @see #getG0ch()
     * @see #setG0ch(Float)
     * @generated
     */
    void unsetG0ch();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getG0ch <em>G0ch</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>G0ch</em>' attribute is set.
     * @see #unsetG0ch()
     * @see #getG0ch()
     * @see #setG0ch(Float)
     * @generated
     */
    boolean isSetG0ch();

    /**
     * Returns the value of the '<em><b>R0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>R0</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>R0</em>' attribute.
     * @see #isSetR0()
     * @see #unsetR0()
     * @see #setR0(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMutualCoupling_R0()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MutualCoupling.r0' kind='element'"
     * @generated
     */
    Float getR0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getR0 <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>R0</em>' attribute.
     * @see #isSetR0()
     * @see #unsetR0()
     * @see #getR0()
     * @generated
     */
    void setR0( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getR0 <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR0()
     * @see #getR0()
     * @see #setR0(Float)
     * @generated
     */
    void unsetR0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getR0 <em>R0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>R0</em>' attribute is set.
     * @see #unsetR0()
     * @see #getR0()
     * @see #setR0(Float)
     * @generated
     */
    boolean isSetR0();

    /**
     * Returns the value of the '<em><b>X0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>X0</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>X0</em>' attribute.
     * @see #isSetX0()
     * @see #unsetX0()
     * @see #setX0(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMutualCoupling_X0()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MutualCoupling.x0' kind='element'"
     * @generated
     */
    Float getX0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getX0 <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X0</em>' attribute.
     * @see #isSetX0()
     * @see #unsetX0()
     * @see #getX0()
     * @generated
     */
    void setX0( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getX0 <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX0()
     * @see #getX0()
     * @see #setX0(Float)
     * @generated
     */
    void unsetX0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getX0 <em>X0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>X0</em>' attribute is set.
     * @see #unsetX0()
     * @see #getX0()
     * @see #setX0(Float)
     * @generated
     */
    boolean isSetX0();

    /**
     * Returns the value of the '<em><b>Second Terminal</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getHasSecondMutualCoupling <em>Has Second Mutual Coupling</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Second Terminal</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Second Terminal</em>' reference.
     * @see #isSetSecond_Terminal()
     * @see #unsetSecond_Terminal()
     * @see #setSecond_Terminal(Terminal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMutualCoupling_Second_Terminal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getHasSecondMutualCoupling
     * @model opposite="HasSecondMutualCoupling" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MutualCoupling.Second_Terminal' kind='element'"
     * @generated
     */
    Terminal getSecond_Terminal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getSecond_Terminal <em>Second Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Second Terminal</em>' reference.
     * @see #isSetSecond_Terminal()
     * @see #unsetSecond_Terminal()
     * @see #getSecond_Terminal()
     * @generated
     */
    void setSecond_Terminal( Terminal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getSecond_Terminal <em>Second Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSecond_Terminal()
     * @see #getSecond_Terminal()
     * @see #setSecond_Terminal(Terminal)
     * @generated
     */
    void unsetSecond_Terminal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getSecond_Terminal <em>Second Terminal</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Second Terminal</em>' reference is set.
     * @see #unsetSecond_Terminal()
     * @see #getSecond_Terminal()
     * @see #setSecond_Terminal(Terminal)
     * @generated
     */
    boolean isSetSecond_Terminal();

    /**
     * Returns the value of the '<em><b>First Terminal</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getHasFirstMutualCoupling <em>Has First Mutual Coupling</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>First Terminal</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>First Terminal</em>' reference.
     * @see #isSetFirst_Terminal()
     * @see #unsetFirst_Terminal()
     * @see #setFirst_Terminal(Terminal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMutualCoupling_First_Terminal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getHasFirstMutualCoupling
     * @model opposite="HasFirstMutualCoupling" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MutualCoupling.First_Terminal' kind='element'"
     * @generated
     */
    Terminal getFirst_Terminal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getFirst_Terminal <em>First Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>First Terminal</em>' reference.
     * @see #isSetFirst_Terminal()
     * @see #unsetFirst_Terminal()
     * @see #getFirst_Terminal()
     * @generated
     */
    void setFirst_Terminal( Terminal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getFirst_Terminal <em>First Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFirst_Terminal()
     * @see #getFirst_Terminal()
     * @see #setFirst_Terminal(Terminal)
     * @generated
     */
    void unsetFirst_Terminal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getFirst_Terminal <em>First Terminal</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>First Terminal</em>' reference is set.
     * @see #unsetFirst_Terminal()
     * @see #getFirst_Terminal()
     * @see #setFirst_Terminal(Terminal)
     * @generated
     */
    boolean isSetFirst_Terminal();

} // MutualCoupling
