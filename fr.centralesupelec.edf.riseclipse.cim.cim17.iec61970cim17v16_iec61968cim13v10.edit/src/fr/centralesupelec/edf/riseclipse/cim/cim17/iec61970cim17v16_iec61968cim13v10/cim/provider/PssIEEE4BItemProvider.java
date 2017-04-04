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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PssIEEE4B;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PssIEEE4B} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PssIEEE4BItemProvider extends PowerSystemStabilizerDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PssIEEE4BItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addBwh1PropertyDescriptor( object );
            addBwh2PropertyDescriptor( object );
            addBwl1PropertyDescriptor( object );
            addBwl2PropertyDescriptor( object );
            addKhPropertyDescriptor( object );
            addKh1PropertyDescriptor( object );
            addKh11PropertyDescriptor( object );
            addKh17PropertyDescriptor( object );
            addKh2PropertyDescriptor( object );
            addKiPropertyDescriptor( object );
            addKi1PropertyDescriptor( object );
            addKi11PropertyDescriptor( object );
            addKi17PropertyDescriptor( object );
            addKi2PropertyDescriptor( object );
            addKlPropertyDescriptor( object );
            addKl1PropertyDescriptor( object );
            addKl11PropertyDescriptor( object );
            addKl17PropertyDescriptor( object );
            addKl2PropertyDescriptor( object );
            addOmeganh1PropertyDescriptor( object );
            addOmeganh2PropertyDescriptor( object );
            addOmeganl1PropertyDescriptor( object );
            addOmeganl2PropertyDescriptor( object );
            addTh1PropertyDescriptor( object );
            addTh10PropertyDescriptor( object );
            addTh11PropertyDescriptor( object );
            addTh12PropertyDescriptor( object );
            addTh2PropertyDescriptor( object );
            addTh3PropertyDescriptor( object );
            addTh4PropertyDescriptor( object );
            addTh5PropertyDescriptor( object );
            addTh6PropertyDescriptor( object );
            addTh7PropertyDescriptor( object );
            addTh8PropertyDescriptor( object );
            addTh9PropertyDescriptor( object );
            addTi1PropertyDescriptor( object );
            addTi10PropertyDescriptor( object );
            addTi11PropertyDescriptor( object );
            addTi12PropertyDescriptor( object );
            addTi2PropertyDescriptor( object );
            addTi3PropertyDescriptor( object );
            addTi4PropertyDescriptor( object );
            addTi5PropertyDescriptor( object );
            addTi6PropertyDescriptor( object );
            addTi7PropertyDescriptor( object );
            addTi8PropertyDescriptor( object );
            addTi9PropertyDescriptor( object );
            addTl1PropertyDescriptor( object );
            addTl10PropertyDescriptor( object );
            addTl11PropertyDescriptor( object );
            addTl12PropertyDescriptor( object );
            addTl2PropertyDescriptor( object );
            addTl3PropertyDescriptor( object );
            addTl4PropertyDescriptor( object );
            addTl5PropertyDescriptor( object );
            addTl6PropertyDescriptor( object );
            addTl7PropertyDescriptor( object );
            addTl8PropertyDescriptor( object );
            addTl9PropertyDescriptor( object );
            addVhmaxPropertyDescriptor( object );
            addVhminPropertyDescriptor( object );
            addVimaxPropertyDescriptor( object );
            addViminPropertyDescriptor( object );
            addVlmaxPropertyDescriptor( object );
            addVlminPropertyDescriptor( object );
            addVstmaxPropertyDescriptor( object );
            addVstminPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Bwh1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBwh1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_bwh1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_bwh1_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Bwh1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Bwh2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBwh2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_bwh2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_bwh2_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Bwh2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Bwl1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBwl1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_bwl1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_bwl1_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Bwl1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Bwl2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBwl2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_bwl2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_bwl2_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Bwl2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kh feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKhPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_kh_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_kh_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Kh(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kh1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKh1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_kh1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_kh1_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Kh1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kh11 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKh11PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_kh11_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_kh11_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Kh11(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kh17 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKh17PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_kh17_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_kh17_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Kh17(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kh2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKh2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_kh2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_kh2_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Kh2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ki feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKiPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_ki_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_ki_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Ki(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ki1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKi1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_ki1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_ki1_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Ki1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ki11 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKi11PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_ki11_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_ki11_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Ki11(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ki17 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKi17PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_ki17_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_ki17_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Ki17(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ki2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKi2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_ki2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_ki2_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Ki2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kl feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKlPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_kl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_kl_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Kl(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kl1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKl1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_kl1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_kl1_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Kl1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kl11 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKl11PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_kl11_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_kl11_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Kl11(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kl17 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKl17PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_kl17_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_kl17_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Kl17(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kl2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKl2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_kl2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_kl2_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Kl2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Omeganh1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOmeganh1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_omeganh1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_omeganh1_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Omeganh1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Omeganh2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOmeganh2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_omeganh2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_omeganh2_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Omeganh2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Omeganl1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOmeganl1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_omeganl1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_omeganl1_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Omeganl1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Omeganl2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOmeganl2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_omeganl2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_omeganl2_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Omeganl2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Th1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTh1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_th1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_th1_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Th1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Th10 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTh10PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_th10_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_th10_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Th10(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Th11 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTh11PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_th11_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_th11_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Th11(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Th12 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTh12PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_th12_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_th12_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Th12(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Th2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTh2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_th2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_th2_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Th2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Th3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTh3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_th3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_th3_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Th3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Th4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTh4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_th4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_th4_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Th4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Th5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTh5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_th5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_th5_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Th5(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Th6 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTh6PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_th6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_th6_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Th6(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Th7 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTh7PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_th7_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_th7_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Th7(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Th8 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTh8PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_th8_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_th8_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Th8(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Th9 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTh9PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_th9_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_th9_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Th9(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ti1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTi1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_ti1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_ti1_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Ti1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ti10 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTi10PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_ti10_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_ti10_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Ti10(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ti11 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTi11PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_ti11_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_ti11_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Ti11(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ti12 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTi12PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_ti12_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_ti12_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Ti12(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ti2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTi2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_ti2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_ti2_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Ti2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ti3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTi3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_ti3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_ti3_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Ti3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ti4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTi4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_ti4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_ti4_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Ti4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ti5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTi5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_ti5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_ti5_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Ti5(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ti6 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTi6PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_ti6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_ti6_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Ti6(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ti7 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTi7PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_ti7_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_ti7_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Ti7(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ti8 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTi8PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_ti8_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_ti8_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Ti8(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ti9 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTi9PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_ti9_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_ti9_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Ti9(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tl1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTl1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_tl1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_tl1_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Tl1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tl10 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTl10PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_tl10_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_tl10_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Tl10(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tl11 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTl11PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_tl11_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_tl11_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Tl11(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tl12 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTl12PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_tl12_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_tl12_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Tl12(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tl2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTl2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_tl2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_tl2_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Tl2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tl3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTl3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_tl3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_tl3_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Tl3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tl4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTl4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_tl4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_tl4_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Tl4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tl5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTl5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_tl5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_tl5_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Tl5(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tl6 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTl6PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_tl6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_tl6_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Tl6(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tl7 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTl7PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_tl7_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_tl7_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Tl7(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tl8 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTl8PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_tl8_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_tl8_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Tl8(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tl9 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTl9PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_tl9_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_tl9_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Tl9(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vhmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVhmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_vhmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_vhmax_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Vhmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vhmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVhminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_vhmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_vhmin_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Vhmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vimax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVimaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_vimax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_vimax_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Vimax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vimin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addViminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_vimin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_vimin_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Vimin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vlmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVlmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_vlmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_vlmax_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Vlmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vlmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVlminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_vlmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_vlmin_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Vlmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vstmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVstmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_vstmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_vstmax_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Vstmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vstmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVstminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE4B_vstmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE4B_vstmin_feature",
                                "_UI_PssIEEE4B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE4B_Vstmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns PssIEEE4B.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/PssIEEE4B" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( PssIEEE4B ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_PssIEEE4B_type" )
                : getString( "_UI_PssIEEE4B_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( PssIEEE4B.class ) ) {
        case CimPackage.PSS_IEEE4B__BWH1:
        case CimPackage.PSS_IEEE4B__BWH2:
        case CimPackage.PSS_IEEE4B__BWL1:
        case CimPackage.PSS_IEEE4B__BWL2:
        case CimPackage.PSS_IEEE4B__KH:
        case CimPackage.PSS_IEEE4B__KH1:
        case CimPackage.PSS_IEEE4B__KH11:
        case CimPackage.PSS_IEEE4B__KH17:
        case CimPackage.PSS_IEEE4B__KH2:
        case CimPackage.PSS_IEEE4B__KI:
        case CimPackage.PSS_IEEE4B__KI1:
        case CimPackage.PSS_IEEE4B__KI11:
        case CimPackage.PSS_IEEE4B__KI17:
        case CimPackage.PSS_IEEE4B__KI2:
        case CimPackage.PSS_IEEE4B__KL:
        case CimPackage.PSS_IEEE4B__KL1:
        case CimPackage.PSS_IEEE4B__KL11:
        case CimPackage.PSS_IEEE4B__KL17:
        case CimPackage.PSS_IEEE4B__KL2:
        case CimPackage.PSS_IEEE4B__OMEGANH1:
        case CimPackage.PSS_IEEE4B__OMEGANH2:
        case CimPackage.PSS_IEEE4B__OMEGANL1:
        case CimPackage.PSS_IEEE4B__OMEGANL2:
        case CimPackage.PSS_IEEE4B__TH1:
        case CimPackage.PSS_IEEE4B__TH10:
        case CimPackage.PSS_IEEE4B__TH11:
        case CimPackage.PSS_IEEE4B__TH12:
        case CimPackage.PSS_IEEE4B__TH2:
        case CimPackage.PSS_IEEE4B__TH3:
        case CimPackage.PSS_IEEE4B__TH4:
        case CimPackage.PSS_IEEE4B__TH5:
        case CimPackage.PSS_IEEE4B__TH6:
        case CimPackage.PSS_IEEE4B__TH7:
        case CimPackage.PSS_IEEE4B__TH8:
        case CimPackage.PSS_IEEE4B__TH9:
        case CimPackage.PSS_IEEE4B__TI1:
        case CimPackage.PSS_IEEE4B__TI10:
        case CimPackage.PSS_IEEE4B__TI11:
        case CimPackage.PSS_IEEE4B__TI12:
        case CimPackage.PSS_IEEE4B__TI2:
        case CimPackage.PSS_IEEE4B__TI3:
        case CimPackage.PSS_IEEE4B__TI4:
        case CimPackage.PSS_IEEE4B__TI5:
        case CimPackage.PSS_IEEE4B__TI6:
        case CimPackage.PSS_IEEE4B__TI7:
        case CimPackage.PSS_IEEE4B__TI8:
        case CimPackage.PSS_IEEE4B__TI9:
        case CimPackage.PSS_IEEE4B__TL1:
        case CimPackage.PSS_IEEE4B__TL10:
        case CimPackage.PSS_IEEE4B__TL11:
        case CimPackage.PSS_IEEE4B__TL12:
        case CimPackage.PSS_IEEE4B__TL2:
        case CimPackage.PSS_IEEE4B__TL3:
        case CimPackage.PSS_IEEE4B__TL4:
        case CimPackage.PSS_IEEE4B__TL5:
        case CimPackage.PSS_IEEE4B__TL6:
        case CimPackage.PSS_IEEE4B__TL7:
        case CimPackage.PSS_IEEE4B__TL8:
        case CimPackage.PSS_IEEE4B__TL9:
        case CimPackage.PSS_IEEE4B__VHMAX:
        case CimPackage.PSS_IEEE4B__VHMIN:
        case CimPackage.PSS_IEEE4B__VIMAX:
        case CimPackage.PSS_IEEE4B__VIMIN:
        case CimPackage.PSS_IEEE4B__VLMAX:
        case CimPackage.PSS_IEEE4B__VLMIN:
        case CimPackage.PSS_IEEE4B__VSTMAX:
        case CimPackage.PSS_IEEE4B__VSTMIN:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

}
