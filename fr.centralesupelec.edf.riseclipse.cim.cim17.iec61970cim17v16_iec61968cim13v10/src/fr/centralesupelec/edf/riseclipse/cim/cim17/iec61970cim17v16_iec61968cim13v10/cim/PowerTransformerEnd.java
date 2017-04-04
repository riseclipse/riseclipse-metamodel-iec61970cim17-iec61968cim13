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
 * A representation of the model object '<em><b>Power Transformer End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getB <em>B</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getB0 <em>B0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getConnectionKind <em>Connection Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getG <em>G</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getG0 <em>G0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getPhaseAngleClock <em>Phase Angle Clock</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getR0 <em>R0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getRatedS <em>Rated S</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getRatedU <em>Rated U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getX <em>X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getX0 <em>X0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getPowerTransformer <em>Power Transformer</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerTransformerEnd()
 * @model
 * @generated
 */
public interface PowerTransformerEnd extends TransformerEnd {
    /**
     * Returns the value of the '<em><b>B</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>B</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>B</em>' attribute.
     * @see #isSetB()
     * @see #unsetB()
     * @see #setB(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerTransformerEnd_B()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerTransformerEnd.b' kind='element'"
     * @generated
     */
    Float getB();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getB <em>B</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>B</em>' attribute.
     * @see #isSetB()
     * @see #unsetB()
     * @see #getB()
     * @generated
     */
    void setB( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getB <em>B</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetB()
     * @see #getB()
     * @see #setB(Float)
     * @generated
     */
    void unsetB();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getB <em>B</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>B</em>' attribute is set.
     * @see #unsetB()
     * @see #getB()
     * @see #setB(Float)
     * @generated
     */
    boolean isSetB();

    /**
     * Returns the value of the '<em><b>B0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>B0</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>B0</em>' attribute.
     * @see #isSetB0()
     * @see #unsetB0()
     * @see #setB0(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerTransformerEnd_B0()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerTransformerEnd.b0' kind='element'"
     * @generated
     */
    Float getB0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getB0 <em>B0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>B0</em>' attribute.
     * @see #isSetB0()
     * @see #unsetB0()
     * @see #getB0()
     * @generated
     */
    void setB0( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getB0 <em>B0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetB0()
     * @see #getB0()
     * @see #setB0(Float)
     * @generated
     */
    void unsetB0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getB0 <em>B0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>B0</em>' attribute is set.
     * @see #unsetB0()
     * @see #getB0()
     * @see #setB0(Float)
     * @generated
     */
    boolean isSetB0();

    /**
     * Returns the value of the '<em><b>Connection Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindingConnection}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connection Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindingConnection
     * @see #isSetConnectionKind()
     * @see #unsetConnectionKind()
     * @see #setConnectionKind(WindingConnection)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerTransformerEnd_ConnectionKind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerTransformerEnd.connectionKind' kind='element'"
     * @generated
     */
    WindingConnection getConnectionKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getConnectionKind <em>Connection Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindingConnection
     * @see #isSetConnectionKind()
     * @see #unsetConnectionKind()
     * @see #getConnectionKind()
     * @generated
     */
    void setConnectionKind( WindingConnection value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getConnectionKind <em>Connection Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConnectionKind()
     * @see #getConnectionKind()
     * @see #setConnectionKind(WindingConnection)
     * @generated
     */
    void unsetConnectionKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getConnectionKind <em>Connection Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Connection Kind</em>' attribute is set.
     * @see #unsetConnectionKind()
     * @see #getConnectionKind()
     * @see #setConnectionKind(WindingConnection)
     * @generated
     */
    boolean isSetConnectionKind();

    /**
     * Returns the value of the '<em><b>G</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>G</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>G</em>' attribute.
     * @see #isSetG()
     * @see #unsetG()
     * @see #setG(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerTransformerEnd_G()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerTransformerEnd.g' kind='element'"
     * @generated
     */
    Float getG();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getG <em>G</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>G</em>' attribute.
     * @see #isSetG()
     * @see #unsetG()
     * @see #getG()
     * @generated
     */
    void setG( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getG <em>G</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetG()
     * @see #getG()
     * @see #setG(Float)
     * @generated
     */
    void unsetG();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getG <em>G</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>G</em>' attribute is set.
     * @see #unsetG()
     * @see #getG()
     * @see #setG(Float)
     * @generated
     */
    boolean isSetG();

    /**
     * Returns the value of the '<em><b>G0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>G0</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>G0</em>' attribute.
     * @see #isSetG0()
     * @see #unsetG0()
     * @see #setG0(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerTransformerEnd_G0()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerTransformerEnd.g0' kind='element'"
     * @generated
     */
    Float getG0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getG0 <em>G0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>G0</em>' attribute.
     * @see #isSetG0()
     * @see #unsetG0()
     * @see #getG0()
     * @generated
     */
    void setG0( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getG0 <em>G0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetG0()
     * @see #getG0()
     * @see #setG0(Float)
     * @generated
     */
    void unsetG0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getG0 <em>G0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>G0</em>' attribute is set.
     * @see #unsetG0()
     * @see #getG0()
     * @see #setG0(Float)
     * @generated
     */
    boolean isSetG0();

    /**
     * Returns the value of the '<em><b>Phase Angle Clock</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase Angle Clock</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phase Angle Clock</em>' attribute.
     * @see #isSetPhaseAngleClock()
     * @see #unsetPhaseAngleClock()
     * @see #setPhaseAngleClock(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerTransformerEnd_PhaseAngleClock()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerTransformerEnd.phaseAngleClock' kind='element'"
     * @generated
     */
    Integer getPhaseAngleClock();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getPhaseAngleClock <em>Phase Angle Clock</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phase Angle Clock</em>' attribute.
     * @see #isSetPhaseAngleClock()
     * @see #unsetPhaseAngleClock()
     * @see #getPhaseAngleClock()
     * @generated
     */
    void setPhaseAngleClock( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getPhaseAngleClock <em>Phase Angle Clock</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhaseAngleClock()
     * @see #getPhaseAngleClock()
     * @see #setPhaseAngleClock(Integer)
     * @generated
     */
    void unsetPhaseAngleClock();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getPhaseAngleClock <em>Phase Angle Clock</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phase Angle Clock</em>' attribute is set.
     * @see #unsetPhaseAngleClock()
     * @see #getPhaseAngleClock()
     * @see #setPhaseAngleClock(Integer)
     * @generated
     */
    boolean isSetPhaseAngleClock();

    /**
     * Returns the value of the '<em><b>R</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>R</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>R</em>' attribute.
     * @see #isSetR()
     * @see #unsetR()
     * @see #setR(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerTransformerEnd_R()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerTransformerEnd.r' kind='element'"
     * @generated
     */
    Float getR();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getR <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>R</em>' attribute.
     * @see #isSetR()
     * @see #unsetR()
     * @see #getR()
     * @generated
     */
    void setR( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getR <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR()
     * @see #getR()
     * @see #setR(Float)
     * @generated
     */
    void unsetR();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getR <em>R</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>R</em>' attribute is set.
     * @see #unsetR()
     * @see #getR()
     * @see #setR(Float)
     * @generated
     */
    boolean isSetR();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerTransformerEnd_R0()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerTransformerEnd.r0' kind='element'"
     * @generated
     */
    Float getR0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getR0 <em>R0</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getR0 <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR0()
     * @see #getR0()
     * @see #setR0(Float)
     * @generated
     */
    void unsetR0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getR0 <em>R0</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Rated S</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rated S</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rated S</em>' attribute.
     * @see #isSetRatedS()
     * @see #unsetRatedS()
     * @see #setRatedS(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerTransformerEnd_RatedS()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerTransformerEnd.ratedS' kind='element'"
     * @generated
     */
    Float getRatedS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getRatedS <em>Rated S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated S</em>' attribute.
     * @see #isSetRatedS()
     * @see #unsetRatedS()
     * @see #getRatedS()
     * @generated
     */
    void setRatedS( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getRatedS <em>Rated S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedS()
     * @see #getRatedS()
     * @see #setRatedS(Float)
     * @generated
     */
    void unsetRatedS();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getRatedS <em>Rated S</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated S</em>' attribute is set.
     * @see #unsetRatedS()
     * @see #getRatedS()
     * @see #setRatedS(Float)
     * @generated
     */
    boolean isSetRatedS();

    /**
     * Returns the value of the '<em><b>Rated U</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rated U</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rated U</em>' attribute.
     * @see #isSetRatedU()
     * @see #unsetRatedU()
     * @see #setRatedU(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerTransformerEnd_RatedU()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerTransformerEnd.ratedU' kind='element'"
     * @generated
     */
    Float getRatedU();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getRatedU <em>Rated U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated U</em>' attribute.
     * @see #isSetRatedU()
     * @see #unsetRatedU()
     * @see #getRatedU()
     * @generated
     */
    void setRatedU( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getRatedU <em>Rated U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedU()
     * @see #getRatedU()
     * @see #setRatedU(Float)
     * @generated
     */
    void unsetRatedU();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getRatedU <em>Rated U</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated U</em>' attribute is set.
     * @see #unsetRatedU()
     * @see #getRatedU()
     * @see #setRatedU(Float)
     * @generated
     */
    boolean isSetRatedU();

    /**
     * Returns the value of the '<em><b>X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>X</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>X</em>' attribute.
     * @see #isSetX()
     * @see #unsetX()
     * @see #setX(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerTransformerEnd_X()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerTransformerEnd.x' kind='element'"
     * @generated
     */
    Float getX();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getX <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X</em>' attribute.
     * @see #isSetX()
     * @see #unsetX()
     * @see #getX()
     * @generated
     */
    void setX( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getX <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX()
     * @see #getX()
     * @see #setX(Float)
     * @generated
     */
    void unsetX();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getX <em>X</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>X</em>' attribute is set.
     * @see #unsetX()
     * @see #getX()
     * @see #setX(Float)
     * @generated
     */
    boolean isSetX();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerTransformerEnd_X0()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerTransformerEnd.x0' kind='element'"
     * @generated
     */
    Float getX0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getX0 <em>X0</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getX0 <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX0()
     * @see #getX0()
     * @see #setX0(Float)
     * @generated
     */
    void unsetX0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getX0 <em>X0</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Power Transformer</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getPowerTransformerEnd <em>Power Transformer End</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Power Transformer</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Power Transformer</em>' reference.
     * @see #isSetPowerTransformer()
     * @see #unsetPowerTransformer()
     * @see #setPowerTransformer(PowerTransformer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerTransformerEnd_PowerTransformer()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer#getPowerTransformerEnd
     * @model opposite="PowerTransformerEnd" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerTransformerEnd.PowerTransformer' kind='element'"
     * @generated
     */
    PowerTransformer getPowerTransformer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getPowerTransformer <em>Power Transformer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Power Transformer</em>' reference.
     * @see #isSetPowerTransformer()
     * @see #unsetPowerTransformer()
     * @see #getPowerTransformer()
     * @generated
     */
    void setPowerTransformer( PowerTransformer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getPowerTransformer <em>Power Transformer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPowerTransformer()
     * @see #getPowerTransformer()
     * @see #setPowerTransformer(PowerTransformer)
     * @generated
     */
    void unsetPowerTransformer();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd#getPowerTransformer <em>Power Transformer</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Power Transformer</em>' reference is set.
     * @see #unsetPowerTransformer()
     * @see #getPowerTransformer()
     * @see #setPowerTransformer(PowerTransformer)
     * @generated
     */
    boolean isSetPowerTransformer();

} // PowerTransformerEnd
